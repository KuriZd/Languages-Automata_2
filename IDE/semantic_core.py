# file: semantic_core.py
from antlr4 import CommonTokenStream, InputStream, ParseTreeVisitor
from MiniJavaLexer import MiniJavaLexer
from MiniJavaParser import MiniJavaParser

T_INT, T_DOUBLE, T_BOOL, T_VOID, T_ERROR = 'int', 'double', 'bool', 'void', '<error>'

class SemanticError:
    def __init__(self, line, col, msg):
        self.line=line; self.col=col; self.msg=msg
    def __str__(self):
        return f"[l{self.line}:c{self.col}] {self.msg}"

class SymTables:
    def __init__(self):
        self.SymTG = {}  # { className: { 'fields': {id: type}, 'methods': {name: {'ret':type,'params':[type], 'fields':ref}} } }

class Collector(ParseTreeVisitor):
    def __init__(self, errors: list, st: SymTables):
        self.errors = errors
        self.st = st

    def visitProgram(self, ctx:MiniJavaParser.ProgramContext):
        for c in ctx.classDecl():
            self.visit(c)
        return None

    def visitClassDecl(self, ctx:MiniJavaParser.ClassDeclContext):
        cname = ctx.ID().getText()
        if cname in self.st.SymTG:
            self._err(ctx.start, f"Redeclaración de clase '{cname}'")
            return None
        self.st.SymTG[cname] = {'fields':{}, 'methods':{}}
        for m in ctx.memberDecl():
            if m.fieldDecl():
                self._collectField(cname, m.fieldDecl())
            else:
                self._collectMethod(cname, m.methodDecl())

    def _collectField(self, cname, fctx:MiniJavaParser.FieldDeclContext):
        ty = fctx.type_().getText()
        for idtok in fctx.varList().ID():
            name = idtok.getText()
            if name in self.st.SymTG[cname]['fields']:
                self._err(idtok.symbol, f"Redeclaración de atributo '{name}' en clase '{cname}'")
            else:
                self.st.SymTG[cname]['fields'][name] = ty

    def _collectMethod(self, cname, mctx:MiniJavaParser.MethodDeclContext):
        mname = mctx.ID().getText()
        if mname in self.st.SymTG[cname]['methods']:
            self._err(mctx.start, f"Redeclaración de método '{mname}' en clase '{cname}'")
            return
        ret = mctx.typeOrVoid().getText()
        params = []
        if mctx.params():
            for p in mctx.params().param():
                params.append(p.type_().getText())
        self.st.SymTG[cname]['methods'][mname] = {
            'ret': ret,
            'params': params,
        }

    def _err(self, tok, msg):
        self.errors.append(SemanticError(tok.line, tok.column, msg))

class TypeChecker(ParseTreeVisitor):
    def __init__(self, errors: list, st: SymTables):
        self.errors = errors
        self.st = st
        self.currentClass = None
        self.SymT = {}  # locals of current method: {id:type}

    # Helpers
    def _err(self, tok, msg):
        self.errors.append(SemanticError(tok.line, tok.column, msg))

    def _type_of_id(self, name, tok):
        if name in self.SymT:
            return self.SymT[name]
        # search in current class fields
        if self.currentClass and name in self.st.SymTG[self.currentClass]['fields']:
            return self.st.SymTG[self.currentClass]['fields'][name]
        self._err(tok, f"Uso de variable no declarada '{name}'")
        return T_ERROR

    def _same(self, a, b):
        return a == b

    def _bin(self, left, right, opTok, allowed):
        if left==T_ERROR or right==T_ERROR:
            return T_ERROR
        if left!=right:
            self._err(opTok, f"Expresión con tipos distintos: {left} {opTok.text} {right}")
            return T_ERROR
        if left not in allowed:
            self._err(opTok, f"Operador '{opTok.text}' no aplica a tipo {left}")
            return T_ERROR
        return left

    # Entry
    def visitProgram(self, ctx:MiniJavaParser.ProgramContext):
        for c in ctx.classDecl():
            self.currentClass = c.ID().getText()
            # check methods one by one
            for m in c.memberDecl():
                if m.methodDecl():
                    self._checkMethod(self.currentClass, m.methodDecl())
        return None

    def _checkMethod(self, cname, mctx:MiniJavaParser.MethodDeclContext):
        self.SymT = {}
        # load params into SymT and check duplicates
        if mctx.params():
            for p in mctx.params().param():
                ty = p.type_().getText()
                name = p.ID().getText()
                if name in self.SymT:
                    self._err(p.start, f"Redeclaración de parámetro '{name}'")
                else:
                    self.SymT[name]=ty
        # walk body
        self.visit(mctx.block())

    # Statements
    def visitBlock(self, ctx:MiniJavaParser.BlockContext):
        for s in ctx.stmt():
            self.visit(s)
        return None

    def visitVarDecl(self, ctx:MiniJavaParser.VarDeclContext):
        ty = ctx.type_().getText()
        for idtok in ctx.varList().ID():
            name = idtok.getText()
            if name in self.SymT:
                self._err(idtok.symbol, f"Redeclaración de variable local '{name}'")
            else:
                self.SymT[name]=ty
        return None

    def visitAssignStmt(self, ctx:MiniJavaParser.AssignStmtContext):
        nameTok = ctx.ID().getSymbol()
        lhs_t = self._type_of_id(ctx.ID().getText(), nameTok)
        rhs_t = self.visit(ctx.expr())
        if lhs_t!=T_ERROR and rhs_t!=T_ERROR and lhs_t!=rhs_t:
            self._err(nameTok, f"Asignación incompatible: {lhs_t} = {rhs_t}")
        return None

    def visitIfStmt(self, ctx:MiniJavaParser.IfStmtContext):
        ct = self.visit(ctx.expr())
        if ct!=T_ERROR and ct!=T_BOOL:
            self._err(ctx.start, "La condición del if debe ser booleana")
        self.visit(ctx.stmt(0))
        if ctx.stmt(1):
            self.visit(ctx.stmt(1))
        return None

    def visitWhileStmt(self, ctx:MiniJavaParser.WhileStmtContext):
        ct = self.visit(ctx.expr())
        if ct!=T_ERROR and ct!=T_BOOL:
            self._err(ctx.start, "La condición del while debe ser booleana")
        self.visit(ctx.stmt())
        return None

    # Expressions
    def visitParen(self, ctx:MiniJavaParser.ParenContext):
        return self.visit(ctx.expr())

    def visitIdRef(self, ctx:MiniJavaParser.IdRefContext):
        name = ctx.ID().getText()
        return self._type_of_id(name, ctx.start)

    def visitIntLit(self, ctx:MiniJavaParser.IntLitContext):
        return T_INT

    def visitDoubleLit(self, ctx:MiniJavaParser.DoubleLitContext):
        return T_DOUBLE

    def visitTrueLit(self, ctx:MiniJavaParser.TrueLitContext):
        return T_BOOL

    def visitFalseLit(self, ctx:MiniJavaParser.FalseLitContext):
        return T_BOOL

    def visitAddSub(self, ctx:MiniJavaParser.AddSubContext):
        l = self.visit(ctx.expr(0)); r = self.visit(ctx.expr(1))
        return self._bin(l, r, ctx.op, {T_INT, T_DOUBLE})

    def visitMulDiv(self, ctx:MiniJavaParser.MulDivContext):
        l = self.visit(ctx.expr(0)); r = self.visit(ctx.expr(1))
        return self._bin(l, r, ctx.op, {T_INT, T_DOUBLE})

    def visitCmp(self, ctx:MiniJavaParser.CmpContext):
        l = self.visit(ctx.expr(0)); r = self.visit(ctx.expr(1))
        # comparaciones requieren mismos tipos numéricos o bool==bool
        if l==T_ERROR or r==T_ERROR:
            return T_ERROR
        if l!=r:
            self._err(ctx.op, f"Comparación entre tipos distintos: {l} {ctx.op.text} {r}")
            return T_ERROR
        return T_BOOL

    def visitBoolBin(self, ctx:MiniJavaParser.BoolBinContext):
        l = self.visit(ctx.expr(0)); r = self.visit(ctx.expr(1))
        if l==T_ERROR or r==T_ERROR:
            return T_ERROR
        if l!=T_BOOL or r!=T_BOOL:
            self._err(ctx.op, f"Operador booleano '{ctx.op.text}' requiere bool y bool")
            return T_ERROR
        return T_BOOL

# API

def analyze(code:str):
    errors = []
    st = SymTables()

    lexer = MiniJavaLexer(InputStream(code))
    tokens = CommonTokenStream(lexer)
    parser = MiniJavaParser(tokens)
    tree = parser.program()

    Collector(errors, st).visit(tree)
    TypeChecker(errors, st).visit(tree)

    return errors