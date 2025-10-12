# Generated from ./MiniJava.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MiniJavaParser import MiniJavaParser
else:
    from MiniJavaParser import MiniJavaParser

# This class defines a complete listener for a parse tree produced by MiniJavaParser.
class MiniJavaListener(ParseTreeListener):

    # Enter a parse tree produced by MiniJavaParser#program.
    def enterProgram(self, ctx:MiniJavaParser.ProgramContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#program.
    def exitProgram(self, ctx:MiniJavaParser.ProgramContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#classDecl.
    def enterClassDecl(self, ctx:MiniJavaParser.ClassDeclContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#classDecl.
    def exitClassDecl(self, ctx:MiniJavaParser.ClassDeclContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#memberDecl.
    def enterMemberDecl(self, ctx:MiniJavaParser.MemberDeclContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#memberDecl.
    def exitMemberDecl(self, ctx:MiniJavaParser.MemberDeclContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#fieldDecl.
    def enterFieldDecl(self, ctx:MiniJavaParser.FieldDeclContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#fieldDecl.
    def exitFieldDecl(self, ctx:MiniJavaParser.FieldDeclContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#methodDecl.
    def enterMethodDecl(self, ctx:MiniJavaParser.MethodDeclContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#methodDecl.
    def exitMethodDecl(self, ctx:MiniJavaParser.MethodDeclContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#params.
    def enterParams(self, ctx:MiniJavaParser.ParamsContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#params.
    def exitParams(self, ctx:MiniJavaParser.ParamsContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#param.
    def enterParam(self, ctx:MiniJavaParser.ParamContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#param.
    def exitParam(self, ctx:MiniJavaParser.ParamContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#varList.
    def enterVarList(self, ctx:MiniJavaParser.VarListContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#varList.
    def exitVarList(self, ctx:MiniJavaParser.VarListContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#block.
    def enterBlock(self, ctx:MiniJavaParser.BlockContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#block.
    def exitBlock(self, ctx:MiniJavaParser.BlockContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#stmt.
    def enterStmt(self, ctx:MiniJavaParser.StmtContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#stmt.
    def exitStmt(self, ctx:MiniJavaParser.StmtContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#varDecl.
    def enterVarDecl(self, ctx:MiniJavaParser.VarDeclContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#varDecl.
    def exitVarDecl(self, ctx:MiniJavaParser.VarDeclContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#assignStmt.
    def enterAssignStmt(self, ctx:MiniJavaParser.AssignStmtContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#assignStmt.
    def exitAssignStmt(self, ctx:MiniJavaParser.AssignStmtContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#ifStmt.
    def enterIfStmt(self, ctx:MiniJavaParser.IfStmtContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#ifStmt.
    def exitIfStmt(self, ctx:MiniJavaParser.IfStmtContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#whileStmt.
    def enterWhileStmt(self, ctx:MiniJavaParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#whileStmt.
    def exitWhileStmt(self, ctx:MiniJavaParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#DoubleLit.
    def enterDoubleLit(self, ctx:MiniJavaParser.DoubleLitContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#DoubleLit.
    def exitDoubleLit(self, ctx:MiniJavaParser.DoubleLitContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#MulDiv.
    def enterMulDiv(self, ctx:MiniJavaParser.MulDivContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#MulDiv.
    def exitMulDiv(self, ctx:MiniJavaParser.MulDivContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#AddSub.
    def enterAddSub(self, ctx:MiniJavaParser.AddSubContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#AddSub.
    def exitAddSub(self, ctx:MiniJavaParser.AddSubContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#Cmp.
    def enterCmp(self, ctx:MiniJavaParser.CmpContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#Cmp.
    def exitCmp(self, ctx:MiniJavaParser.CmpContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#FalseLit.
    def enterFalseLit(self, ctx:MiniJavaParser.FalseLitContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#FalseLit.
    def exitFalseLit(self, ctx:MiniJavaParser.FalseLitContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#TrueLit.
    def enterTrueLit(self, ctx:MiniJavaParser.TrueLitContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#TrueLit.
    def exitTrueLit(self, ctx:MiniJavaParser.TrueLitContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#IdRef.
    def enterIdRef(self, ctx:MiniJavaParser.IdRefContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#IdRef.
    def exitIdRef(self, ctx:MiniJavaParser.IdRefContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#IntLit.
    def enterIntLit(self, ctx:MiniJavaParser.IntLitContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#IntLit.
    def exitIntLit(self, ctx:MiniJavaParser.IntLitContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#BoolBin.
    def enterBoolBin(self, ctx:MiniJavaParser.BoolBinContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#BoolBin.
    def exitBoolBin(self, ctx:MiniJavaParser.BoolBinContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#Paren.
    def enterParen(self, ctx:MiniJavaParser.ParenContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#Paren.
    def exitParen(self, ctx:MiniJavaParser.ParenContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#modifier.
    def enterModifier(self, ctx:MiniJavaParser.ModifierContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#modifier.
    def exitModifier(self, ctx:MiniJavaParser.ModifierContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#type.
    def enterType(self, ctx:MiniJavaParser.TypeContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#type.
    def exitType(self, ctx:MiniJavaParser.TypeContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#typeOrVoid.
    def enterTypeOrVoid(self, ctx:MiniJavaParser.TypeOrVoidContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#typeOrVoid.
    def exitTypeOrVoid(self, ctx:MiniJavaParser.TypeOrVoidContext):
        pass



del MiniJavaParser