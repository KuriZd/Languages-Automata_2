# Generated from ./MiniJava.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,39,302,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,1,0,4,0,50,8,0,11,0,12,0,51,1,
        0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,5,1,62,8,1,10,1,12,1,65,9,1,1,1,1,
        1,1,1,1,2,1,2,3,2,72,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,81,8,3,
        10,3,12,3,84,9,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,3,4,94,8,4,1,4,
        1,4,1,4,5,4,99,8,4,10,4,12,4,102,9,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,5,5,115,8,5,10,5,12,5,118,9,5,1,6,1,6,1,6,1,6,1,
        6,1,6,5,6,126,8,6,10,6,12,6,129,9,6,1,6,1,6,1,7,1,7,1,7,1,7,3,7,
        137,8,7,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,5,9,
        152,8,9,10,9,12,9,155,9,9,1,9,1,9,1,9,1,9,5,9,161,8,9,10,9,12,9,
        164,9,9,1,9,3,9,167,8,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,5,10,
        176,8,10,10,10,12,10,179,9,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,
        1,11,5,11,189,8,11,10,11,12,11,192,9,11,1,12,1,12,1,12,1,12,1,12,
        1,12,5,12,200,8,12,10,12,12,12,203,9,12,1,13,1,13,1,13,1,13,1,13,
        1,13,1,13,3,13,212,8,13,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,
        1,14,1,14,1,14,1,14,3,14,226,8,14,1,15,1,15,1,15,1,15,1,15,1,16,
        1,16,1,16,1,16,1,16,1,16,5,16,239,8,16,10,16,12,16,242,9,16,1,17,
        1,17,1,17,1,17,1,17,1,17,5,17,250,8,17,10,17,12,17,253,9,17,1,18,
        1,18,1,18,1,18,1,18,1,18,3,18,261,8,18,1,19,1,19,1,19,1,19,1,19,
        1,19,5,19,269,8,19,10,19,12,19,272,9,19,1,20,1,20,1,20,1,20,1,20,
        1,20,5,20,280,8,20,10,20,12,20,283,9,20,1,21,1,21,1,21,1,21,1,21,
        1,21,1,21,1,21,1,21,1,21,1,21,3,21,296,8,21,1,22,1,22,1,23,1,23,
        1,23,0,0,24,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,
        38,40,42,44,46,0,5,1,0,20,25,1,0,4,5,1,0,6,7,1,0,8,10,1,0,11,13,
        307,0,49,1,0,0,0,2,55,1,0,0,0,4,71,1,0,0,0,6,73,1,0,0,0,8,87,1,0,
        0,0,10,106,1,0,0,0,12,119,1,0,0,0,14,136,1,0,0,0,16,138,1,0,0,0,
        18,144,1,0,0,0,20,168,1,0,0,0,22,182,1,0,0,0,24,193,1,0,0,0,26,211,
        1,0,0,0,28,225,1,0,0,0,30,227,1,0,0,0,32,232,1,0,0,0,34,243,1,0,
        0,0,36,260,1,0,0,0,38,262,1,0,0,0,40,273,1,0,0,0,42,295,1,0,0,0,
        44,297,1,0,0,0,46,299,1,0,0,0,48,50,3,2,1,0,49,48,1,0,0,0,50,51,
        1,0,0,0,51,49,1,0,0,0,51,52,1,0,0,0,52,53,1,0,0,0,53,54,5,0,0,1,
        54,1,1,0,0,0,55,56,3,44,22,0,56,57,5,14,0,0,57,58,5,36,0,0,58,59,
        6,1,-1,0,59,63,5,29,0,0,60,62,3,4,2,0,61,60,1,0,0,0,62,65,1,0,0,
        0,63,61,1,0,0,0,63,64,1,0,0,0,64,66,1,0,0,0,65,63,1,0,0,0,66,67,
        5,30,0,0,67,68,6,1,-1,0,68,3,1,0,0,0,69,72,3,8,4,0,70,72,3,6,3,0,
        71,69,1,0,0,0,71,70,1,0,0,0,72,5,1,0,0,0,73,74,3,44,22,0,74,75,3,
        46,23,0,75,76,5,36,0,0,76,82,6,3,-1,0,77,78,5,31,0,0,78,79,5,36,
        0,0,79,81,6,3,-1,0,80,77,1,0,0,0,81,84,1,0,0,0,82,80,1,0,0,0,82,
        83,1,0,0,0,83,85,1,0,0,0,84,82,1,0,0,0,85,86,5,32,0,0,86,7,1,0,0,
        0,87,88,3,44,22,0,88,89,3,46,23,0,89,90,5,36,0,0,90,91,5,1,0,0,91,
        93,6,4,-1,0,92,94,3,10,5,0,93,92,1,0,0,0,93,94,1,0,0,0,94,95,1,0,
        0,0,95,96,5,2,0,0,96,100,5,29,0,0,97,99,3,14,7,0,98,97,1,0,0,0,99,
        102,1,0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,103,1,0,0,0,102,100,
        1,0,0,0,103,104,5,30,0,0,104,105,6,4,-1,0,105,9,1,0,0,0,106,107,
        3,46,23,0,107,108,5,36,0,0,108,116,6,5,-1,0,109,110,5,31,0,0,110,
        111,3,46,23,0,111,112,5,36,0,0,112,113,6,5,-1,0,113,115,1,0,0,0,
        114,109,1,0,0,0,115,118,1,0,0,0,116,114,1,0,0,0,116,117,1,0,0,0,
        117,11,1,0,0,0,118,116,1,0,0,0,119,120,3,46,23,0,120,121,5,36,0,
        0,121,127,6,6,-1,0,122,123,5,31,0,0,123,124,5,36,0,0,124,126,6,6,
        -1,0,125,122,1,0,0,0,126,129,1,0,0,0,127,125,1,0,0,0,127,128,1,0,
        0,0,128,130,1,0,0,0,129,127,1,0,0,0,130,131,5,32,0,0,131,13,1,0,
        0,0,132,137,3,16,8,0,133,137,3,12,6,0,134,137,3,18,9,0,135,137,3,
        20,10,0,136,132,1,0,0,0,136,133,1,0,0,0,136,134,1,0,0,0,136,135,
        1,0,0,0,137,15,1,0,0,0,138,139,5,36,0,0,139,140,5,3,0,0,140,141,
        3,38,19,0,141,142,5,32,0,0,142,143,6,8,-1,0,143,17,1,0,0,0,144,145,
        5,15,0,0,145,146,5,1,0,0,146,147,3,22,11,0,147,148,5,2,0,0,148,149,
        6,9,-1,0,149,153,5,29,0,0,150,152,3,14,7,0,151,150,1,0,0,0,152,155,
        1,0,0,0,153,151,1,0,0,0,153,154,1,0,0,0,154,156,1,0,0,0,155,153,
        1,0,0,0,156,166,5,30,0,0,157,158,5,16,0,0,158,162,5,29,0,0,159,161,
        3,14,7,0,160,159,1,0,0,0,161,164,1,0,0,0,162,160,1,0,0,0,162,163,
        1,0,0,0,163,165,1,0,0,0,164,162,1,0,0,0,165,167,5,30,0,0,166,157,
        1,0,0,0,166,167,1,0,0,0,167,19,1,0,0,0,168,169,5,17,0,0,169,170,
        5,1,0,0,170,171,3,22,11,0,171,172,5,2,0,0,172,173,6,10,-1,0,173,
        177,5,29,0,0,174,176,3,14,7,0,175,174,1,0,0,0,176,179,1,0,0,0,177,
        175,1,0,0,0,177,178,1,0,0,0,178,180,1,0,0,0,179,177,1,0,0,0,180,
        181,5,30,0,0,181,21,1,0,0,0,182,183,3,24,12,0,183,190,6,11,-1,0,
        184,185,5,27,0,0,185,186,3,24,12,0,186,187,6,11,-1,0,187,189,1,0,
        0,0,188,184,1,0,0,0,189,192,1,0,0,0,190,188,1,0,0,0,190,191,1,0,
        0,0,191,23,1,0,0,0,192,190,1,0,0,0,193,194,3,26,13,0,194,201,6,12,
        -1,0,195,196,5,26,0,0,196,197,3,26,13,0,197,198,6,12,-1,0,198,200,
        1,0,0,0,199,195,1,0,0,0,200,203,1,0,0,0,201,199,1,0,0,0,201,202,
        1,0,0,0,202,25,1,0,0,0,203,201,1,0,0,0,204,205,5,28,0,0,205,206,
        3,26,13,0,206,207,6,13,-1,0,207,212,1,0,0,0,208,209,3,28,14,0,209,
        210,6,13,-1,0,210,212,1,0,0,0,211,204,1,0,0,0,211,208,1,0,0,0,212,
        27,1,0,0,0,213,214,5,18,0,0,214,226,6,14,-1,0,215,216,5,19,0,0,216,
        226,6,14,-1,0,217,218,5,1,0,0,218,219,3,22,11,0,219,220,5,2,0,0,
        220,221,6,14,-1,0,221,226,1,0,0,0,222,223,3,30,15,0,223,224,6,14,
        -1,0,224,226,1,0,0,0,225,213,1,0,0,0,225,215,1,0,0,0,225,217,1,0,
        0,0,225,222,1,0,0,0,226,29,1,0,0,0,227,228,3,32,16,0,228,229,7,0,
        0,0,229,230,3,38,19,0,230,231,6,15,-1,0,231,31,1,0,0,0,232,233,3,
        34,17,0,233,240,6,16,-1,0,234,235,7,1,0,0,235,236,3,34,17,0,236,
        237,6,16,-1,0,237,239,1,0,0,0,238,234,1,0,0,0,239,242,1,0,0,0,240,
        238,1,0,0,0,240,241,1,0,0,0,241,33,1,0,0,0,242,240,1,0,0,0,243,244,
        3,36,18,0,244,251,6,17,-1,0,245,246,7,2,0,0,246,247,3,36,18,0,247,
        248,6,17,-1,0,248,250,1,0,0,0,249,245,1,0,0,0,250,253,1,0,0,0,251,
        249,1,0,0,0,251,252,1,0,0,0,252,35,1,0,0,0,253,251,1,0,0,0,254,255,
        5,34,0,0,255,261,6,18,-1,0,256,257,5,35,0,0,257,261,6,18,-1,0,258,
        259,5,36,0,0,259,261,6,18,-1,0,260,254,1,0,0,0,260,256,1,0,0,0,260,
        258,1,0,0,0,261,37,1,0,0,0,262,263,3,40,20,0,263,270,6,19,-1,0,264,
        265,7,1,0,0,265,266,3,40,20,0,266,267,6,19,-1,0,267,269,1,0,0,0,
        268,264,1,0,0,0,269,272,1,0,0,0,270,268,1,0,0,0,270,271,1,0,0,0,
        271,39,1,0,0,0,272,270,1,0,0,0,273,274,3,42,21,0,274,281,6,20,-1,
        0,275,276,7,2,0,0,276,277,3,42,21,0,277,278,6,20,-1,0,278,280,1,
        0,0,0,279,275,1,0,0,0,280,283,1,0,0,0,281,279,1,0,0,0,281,282,1,
        0,0,0,282,41,1,0,0,0,283,281,1,0,0,0,284,285,5,34,0,0,285,296,6,
        21,-1,0,286,287,5,35,0,0,287,296,6,21,-1,0,288,289,5,36,0,0,289,
        296,6,21,-1,0,290,291,5,1,0,0,291,292,3,38,19,0,292,293,5,2,0,0,
        293,294,6,21,-1,0,294,296,1,0,0,0,295,284,1,0,0,0,295,286,1,0,0,
        0,295,288,1,0,0,0,295,290,1,0,0,0,296,43,1,0,0,0,297,298,7,3,0,0,
        298,45,1,0,0,0,299,300,7,4,0,0,300,47,1,0,0,0,23,51,63,71,82,93,
        100,116,127,136,153,162,166,177,190,201,211,225,240,251,260,270,
        281,295
    ]

class MiniJavaParser ( Parser ):

    grammarFileName = "MiniJava.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'='", "'+'", "'-'", "'*'", 
                     "'/'", "'public'", "'private'", "'protected'", "'int'", 
                     "'double'", "'void'", "'class'", "'if'", "'else'", 
                     "'while'", "'true'", "'false'", "'=='", "'!='", "'<='", 
                     "'>='", "'<'", "'>'", "'&&'", "'||'", "'!'", "'{'", 
                     "'}'", "','", "';'", "'.'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "PUBLIC", "PRIVATE", "PROTECTED", "INT", "DOUBLE", 
                      "VOID", "CLASS", "IF", "ELSE", "WHILE", "TRUE", "FALSE", 
                      "EQ", "NE", "LE", "GE", "LT", "GT", "AND", "OR", "NOT", 
                      "OCURLYB", "CCURLYB", "COMMA", "SEMICOLON", "DOT", 
                      "CINT", "CFLOAT", "ID", "LINE_COMMENT", "BLOCK_COMMENT", 
                      "WS" ]

    RULE_program = 0
    RULE_classes = 1
    RULE_member = 2
    RULE_property = 3
    RULE_method = 4
    RULE_decl_args = 5
    RULE_decl_local = 6
    RULE_sentences = 7
    RULE_assignment = 8
    RULE_ifStmt = 9
    RULE_whileStmt = 10
    RULE_boolExpr = 11
    RULE_boolAnd = 12
    RULE_boolNot = 13
    RULE_boolAtom = 14
    RULE_cmpNoParen = 15
    RULE_exprNoParen = 16
    RULE_multNoParen = 17
    RULE_atomNoParen = 18
    RULE_expr = 19
    RULE_multExpr = 20
    RULE_atom = 21
    RULE_accesmod = 22
    RULE_tipo = 23

    ruleNames =  [ "program", "classes", "member", "property", "method", 
                   "decl_args", "decl_local", "sentences", "assignment", 
                   "ifStmt", "whileStmt", "boolExpr", "boolAnd", "boolNot", 
                   "boolAtom", "cmpNoParen", "exprNoParen", "multNoParen", 
                   "atomNoParen", "expr", "multExpr", "atom", "accesmod", 
                   "tipo" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    PUBLIC=8
    PRIVATE=9
    PROTECTED=10
    INT=11
    DOUBLE=12
    VOID=13
    CLASS=14
    IF=15
    ELSE=16
    WHILE=17
    TRUE=18
    FALSE=19
    EQ=20
    NE=21
    LE=22
    GE=23
    LT=24
    GT=25
    AND=26
    OR=27
    NOT=28
    OCURLYB=29
    CCURLYB=30
    COMMA=31
    SEMICOLON=32
    DOT=33
    CINT=34
    CFLOAT=35
    ID=36
    LINE_COMMENT=37
    BLOCK_COMMENT=38
    WS=39

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



        # --------- Tipos ---------
        T_INT    = 1
        T_DOUBLE = 2
        T_MIXED  = 3
        T_BOOL   = 4

        # --------- Tablas de símbolos ---------
        class ClassInfo:
            def __init__(self, name):
                self.name = name
                self.attributes = {}   # id -> tipo (int)
                self.methods = {}      # name -> {'ret':int,'params':dict,'locals':dict}

        SymTG = {}   # nombreClase -> ClassInfo
        SymT  = {}   # tabla local del método actual

        # Contexto actual
        currentClass  = None     # str
        currentMethod = None     # dict

        # Salida (inyectable desde IDE)
        _sink = None             # callable(msg:str)
        _logs = []               # respaldo si no hay sink

        def set_output(self, sink):
            """Registrar un sink (callable) para recibir logs."""
            self._sink = sink

        def get_logs(self):
            return "\n".join(self._logs)

        def _log(self, s):
            if self._sink:
                try:
                    self._sink(s)
                except Exception:
                    self._logs.append(s)
            else:
                self._logs.append(s)

        # --------- Helpers semánticos ----------
        def _strTypeToInt(self, t):
            if t == "int":
                return self.T_INT
            if t == "double":
                return self.T_DOUBLE
            if t == "bool":
                return self.T_BOOL
            return self.T_MIXED

        def _pushClass(self, name):
            if name in self.SymTG:
                self._log(f"[ERR] Clase redeclarada: {name}")
            else:
                self.SymTG[name] = self.ClassInfo(name)
                self._log(f"[OK] Clase registrada: {name}")

        def _pushAttribute(self, ident, tipo):
            if self.currentClass is None:
                self._log(f"[ERR] Atributo fuera de clase: {ident}")
                return
            C = self.SymTG.get(self.currentClass)
            if C is None:
                self._log(f"[ERR] Contexto de clase no inicializado: {self.currentClass}")
                return
            if ident in C.attributes:
                self._log(f"[ERR] Atributo redeclarado en {self.currentClass}: {ident}")
                return
            if tipo == "void":
                self._log(f"[ERR] Atributo no puede ser void: {ident}")
                return
            C.attributes[ident] = self._strTypeToInt(tipo)
            self._log(f"[OK] Atributo {self.currentClass}.{ident} : {tipo}")

        def _pushMethod(self, name, retType):
            if self.currentClass is None:
                self._log(f"[ERR] Método fuera de clase: {name}")
                return
            C = self.SymTG.get(self.currentClass)
            if C is None:
                self._log(f"[ERR] Contexto de clase no inicializado: {self.currentClass}")
                return
            if name in C.methods:
                self._log(f"[ERR] Método redeclarado en {self.currentClass}: {name}")
                return
            self.currentMethod = {
                'name': name,
                'ret': self._strTypeToInt(retType),
                'params': {},
                'locals': {}
            }
            C.methods[name] = self.currentMethod
            self._log(f"[OK] Método {self.currentClass}.{name} : {retType}")

        def _pushLocal(self, ident, tipo):
            if ident in self.SymT:
                self._log(f"[ERR] Identificador local redeclarado en método: {ident}")
                return
            if tipo == "void":
                self._log(f"[ERR] Identificador '{ident}' no puede ser de tipo void")
                t = self.T_MIXED
            else:
                t = self._strTypeToInt(tipo)
            self.SymT[ident] = t
            if self.currentMethod is not None:
                self.currentMethod['locals'][ident] = t
            self._log(f"Insertando a TS local: {ident} : {tipo}")

        def _lookupVarType(self, ident):
            # 1) Local
            if ident in self.SymT:
                return self.SymT[ident]
            # 2) Atributos de clase
            if self.currentClass is not None:
                C = self.SymTG.get(self.currentClass)
                if C and ident in C.attributes:
                    return C.attributes[ident]
            # 3) No encontrado
            self._log(f"[ERR] Uso de variable no declarada: {ident}")
            return self.T_MIXED

        def _ensureBool(self, ctx, t):
            if t != self.T_BOOL:
                self._log(f"[ERR] La condición de {ctx} debe ser booleana, no de tipo {t}")
                return self.T_MIXED
            return self.T_BOOL

        def _mixBool(self, a, b, ctx):
            if a == self.T_BOOL and b == self.T_BOOL:
                return self.T_BOOL
            self._log(f"[ERR] {ctx} requiere operandos booleanos (recibidos {a} y {b})")
            return self.T_MIXED

        def _mixTypes(self, a, b, ctx):
            if a == self.T_MIXED or b == self.T_MIXED:
                return self.T_MIXED
            if a != b:
                self._log(f"[ERR] {ctx} entre tipos distintos ({a} vs {b})")
                return self.T_MIXED
            return a



    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MiniJavaParser.EOF, 0)

        def classes(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ClassesContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ClassesContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = MiniJavaParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 48
                self.classes()
                self.state = 51 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 1792) != 0)):
                    break

            self.state = 53
            self.match(MiniJavaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.id_ = None # Token

        def accesmod(self):
            return self.getTypedRuleContext(MiniJavaParser.AccesmodContext,0)


        def CLASS(self):
            return self.getToken(MiniJavaParser.CLASS, 0)

        def OCURLYB(self):
            return self.getToken(MiniJavaParser.OCURLYB, 0)

        def CCURLYB(self):
            return self.getToken(MiniJavaParser.CCURLYB, 0)

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def member(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.MemberContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.MemberContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_classes

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClasses" ):
                listener.enterClasses(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClasses" ):
                listener.exitClasses(self)




    def classes(self):

        localctx = MiniJavaParser.ClassesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_classes)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.accesmod()
            self.state = 56
            self.match(MiniJavaParser.CLASS)
            self.state = 57
            localctx.id_ = self.match(MiniJavaParser.ID)

            self.currentClass = (None if localctx.id is None else localctx.id.text)
            self._pushClass(self.currentClass)
                
            self.state = 59
            self.match(MiniJavaParser.OCURLYB)
            self.state = 63
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1792) != 0):
                self.state = 60
                self.member()
                self.state = 65
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 66
            self.match(MiniJavaParser.CCURLYB)
             self.currentClass = None 
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MemberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def method(self):
            return self.getTypedRuleContext(MiniJavaParser.MethodContext,0)


        def property_(self):
            return self.getTypedRuleContext(MiniJavaParser.PropertyContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_member

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMember" ):
                listener.enterMember(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMember" ):
                listener.exitMember(self)




    def member(self):

        localctx = MiniJavaParser.MemberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_member)
        try:
            self.state = 71
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.method()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 70
                self.property_()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PropertyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.t = None # TipoContext
            self.id1 = None # Token
            self.id2 = None # Token

        def accesmod(self):
            return self.getTypedRuleContext(MiniJavaParser.AccesmodContext,0)


        def SEMICOLON(self):
            return self.getToken(MiniJavaParser.SEMICOLON, 0)

        def tipo(self):
            return self.getTypedRuleContext(MiniJavaParser.TipoContext,0)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.ID)
            else:
                return self.getToken(MiniJavaParser.ID, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.COMMA)
            else:
                return self.getToken(MiniJavaParser.COMMA, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_property

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProperty" ):
                listener.enterProperty(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProperty" ):
                listener.exitProperty(self)




    def property_(self):

        localctx = MiniJavaParser.PropertyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_property)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.accesmod()
            self.state = 74
            localctx.t = self.tipo()
            self.state = 75
            localctx.id1 = self.match(MiniJavaParser.ID)
             self._pushAttribute((None if localctx.id1 is None else localctx.id1.text), (None if localctx.t is None else self._input.getText(localctx.t.start,localctx.t.stop))) 
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==31:
                self.state = 77
                self.match(MiniJavaParser.COMMA)
                self.state = 78
                localctx.id2 = self.match(MiniJavaParser.ID)
                 self._pushAttribute((None if localctx.id2 is None else localctx.id2.text), (None if localctx.t is None else self._input.getText(localctx.t.start,localctx.t.stop))) 
                self.state = 84
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 85
            self.match(MiniJavaParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.t = None # TipoContext
            self.m = None # Token

        def accesmod(self):
            return self.getTypedRuleContext(MiniJavaParser.AccesmodContext,0)


        def OCURLYB(self):
            return self.getToken(MiniJavaParser.OCURLYB, 0)

        def CCURLYB(self):
            return self.getToken(MiniJavaParser.CCURLYB, 0)

        def tipo(self):
            return self.getTypedRuleContext(MiniJavaParser.TipoContext,0)


        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def decl_args(self):
            return self.getTypedRuleContext(MiniJavaParser.Decl_argsContext,0)


        def sentences(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.SentencesContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.SentencesContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_method

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethod" ):
                listener.enterMethod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethod" ):
                listener.exitMethod(self)




    def method(self):

        localctx = MiniJavaParser.MethodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_method)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.accesmod()
            self.state = 88
            localctx.t = self.tipo()
            self.state = 89
            localctx.m = self.match(MiniJavaParser.ID)
            self.state = 90
            self.match(MiniJavaParser.T__0)
             self._pushMethod((None if localctx.m is None else localctx.m.text), (None if localctx.t is None else self._input.getText(localctx.t.start,localctx.t.stop))) 
            self.state = 93
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 14336) != 0):
                self.state = 92
                self.decl_args()


            self.state = 95
            self.match(MiniJavaParser.T__1)
            self.state = 96
            self.match(MiniJavaParser.OCURLYB)
            self.state = 100
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 68719654912) != 0):
                self.state = 97
                self.sentences()
                self.state = 102
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 103
            self.match(MiniJavaParser.CCURLYB)

            self.currentMethod = None
            self.SymT.clear()
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Decl_argsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.t1 = None # TipoContext
            self.id1 = None # Token
            self.t2 = None # TipoContext
            self.id2 = None # Token

        def tipo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.TipoContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.TipoContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.ID)
            else:
                return self.getToken(MiniJavaParser.ID, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.COMMA)
            else:
                return self.getToken(MiniJavaParser.COMMA, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_decl_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDecl_args" ):
                listener.enterDecl_args(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDecl_args" ):
                listener.exitDecl_args(self)




    def decl_args(self):

        localctx = MiniJavaParser.Decl_argsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_decl_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 106
            localctx.t1 = self.tipo()
            self.state = 107
            localctx.id1 = self.match(MiniJavaParser.ID)

            self._pushLocal((None if localctx.id1 is None else localctx.id1.text), (None if localctx.t1 is None else self._input.getText(localctx.t1.start,localctx.t1.stop)))
            if self.currentMethod is not None:
                self.currentMethod['params'][(None if localctx.id1 is None else localctx.id1.text)] = self._strTypeToInt((None if localctx.t1 is None else self._input.getText(localctx.t1.start,localctx.t1.stop)))
                  
            self.state = 116
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==31:
                self.state = 109
                self.match(MiniJavaParser.COMMA)
                self.state = 110
                localctx.t2 = self.tipo()
                self.state = 111
                localctx.id2 = self.match(MiniJavaParser.ID)

                self._pushLocal((None if localctx.id2 is None else localctx.id2.text), (None if localctx.t2 is None else self._input.getText(localctx.t2.start,localctx.t2.stop)))
                if self.currentMethod is not None:
                    self.currentMethod['params'][(None if localctx.id2 is None else localctx.id2.text)] = self._strTypeToInt((None if localctx.t2 is None else self._input.getText(localctx.t2.start,localctx.t2.stop)))
                      
                self.state = 118
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Decl_localContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.t = None # TipoContext
            self.id1 = None # Token
            self.id2 = None # Token

        def SEMICOLON(self):
            return self.getToken(MiniJavaParser.SEMICOLON, 0)

        def tipo(self):
            return self.getTypedRuleContext(MiniJavaParser.TipoContext,0)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.ID)
            else:
                return self.getToken(MiniJavaParser.ID, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.COMMA)
            else:
                return self.getToken(MiniJavaParser.COMMA, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_decl_local

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDecl_local" ):
                listener.enterDecl_local(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDecl_local" ):
                listener.exitDecl_local(self)




    def decl_local(self):

        localctx = MiniJavaParser.Decl_localContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_decl_local)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 119
            localctx.t = self.tipo()
            self.state = 120
            localctx.id1 = self.match(MiniJavaParser.ID)
             self._pushLocal((None if localctx.id1 is None else localctx.id1.text), (None if localctx.t is None else self._input.getText(localctx.t.start,localctx.t.stop))) 
            self.state = 127
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==31:
                self.state = 122
                self.match(MiniJavaParser.COMMA)
                self.state = 123
                localctx.id2 = self.match(MiniJavaParser.ID)
                 self._pushLocal((None if localctx.id2 is None else localctx.id2.text), (None if localctx.t is None else self._input.getText(localctx.t.start,localctx.t.stop))) 
                self.state = 129
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 130
            self.match(MiniJavaParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentencesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(MiniJavaParser.AssignmentContext,0)


        def decl_local(self):
            return self.getTypedRuleContext(MiniJavaParser.Decl_localContext,0)


        def ifStmt(self):
            return self.getTypedRuleContext(MiniJavaParser.IfStmtContext,0)


        def whileStmt(self):
            return self.getTypedRuleContext(MiniJavaParser.WhileStmtContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_sentences

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentences" ):
                listener.enterSentences(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentences" ):
                listener.exitSentences(self)




    def sentences(self):

        localctx = MiniJavaParser.SentencesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_sentences)
        try:
            self.state = 136
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [36]:
                self.enterOuterAlt(localctx, 1)
                self.state = 132
                self.assignment()
                pass
            elif token in [11, 12, 13]:
                self.enterOuterAlt(localctx, 2)
                self.state = 133
                self.decl_local()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 3)
                self.state = 134
                self.ifStmt()
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 4)
                self.state = 135
                self.whileStmt()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.lhs = None # Token
            self.e = None # ExprContext

        def SEMICOLON(self):
            return self.getToken(MiniJavaParser.SEMICOLON, 0)

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = MiniJavaParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            localctx.lhs = self.match(MiniJavaParser.ID)
            self.state = 139
            self.match(MiniJavaParser.T__2)
            self.state = 140
            localctx.e = self.expr()
            self.state = 141
            self.match(MiniJavaParser.SEMICOLON)

            lt = self._lookupVarType((None if localctx.lhs is None else localctx.lhs.text))
            if lt != self.T_MIXED and localctx.e.vType != self.T_MIXED and lt != localctx.e.vType:
                _name = (None if localctx.lhs is None else localctx.lhs.text)
                _et   = localctx.e.vType
                self._log(f"[ERR] Asignación incompatible: {_name} (tipo {lt}) = expr (tipo {_et})")
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.c = None # BoolExprContext

        def IF(self):
            return self.getToken(MiniJavaParser.IF, 0)

        def OCURLYB(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.OCURLYB)
            else:
                return self.getToken(MiniJavaParser.OCURLYB, i)

        def CCURLYB(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.CCURLYB)
            else:
                return self.getToken(MiniJavaParser.CCURLYB, i)

        def boolExpr(self):
            return self.getTypedRuleContext(MiniJavaParser.BoolExprContext,0)


        def sentences(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.SentencesContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.SentencesContext,i)


        def ELSE(self):
            return self.getToken(MiniJavaParser.ELSE, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_ifStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStmt" ):
                listener.enterIfStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStmt" ):
                listener.exitIfStmt(self)




    def ifStmt(self):

        localctx = MiniJavaParser.IfStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_ifStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 144
            self.match(MiniJavaParser.IF)
            self.state = 145
            self.match(MiniJavaParser.T__0)
            self.state = 146
            localctx.c = self.boolExpr()
            self.state = 147
            self.match(MiniJavaParser.T__1)
             self._ensureBool("if", localctx.c.vType) 
            self.state = 149
            self.match(MiniJavaParser.OCURLYB)
            self.state = 153
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 68719654912) != 0):
                self.state = 150
                self.sentences()
                self.state = 155
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 156
            self.match(MiniJavaParser.CCURLYB)
            self.state = 166
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==16:
                self.state = 157
                self.match(MiniJavaParser.ELSE)
                self.state = 158
                self.match(MiniJavaParser.OCURLYB)
                self.state = 162
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 68719654912) != 0):
                    self.state = 159
                    self.sentences()
                    self.state = 164
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 165
                self.match(MiniJavaParser.CCURLYB)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WhileStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.c = None # BoolExprContext

        def WHILE(self):
            return self.getToken(MiniJavaParser.WHILE, 0)

        def OCURLYB(self):
            return self.getToken(MiniJavaParser.OCURLYB, 0)

        def CCURLYB(self):
            return self.getToken(MiniJavaParser.CCURLYB, 0)

        def boolExpr(self):
            return self.getTypedRuleContext(MiniJavaParser.BoolExprContext,0)


        def sentences(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.SentencesContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.SentencesContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_whileStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhileStmt" ):
                listener.enterWhileStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhileStmt" ):
                listener.exitWhileStmt(self)




    def whileStmt(self):

        localctx = MiniJavaParser.WhileStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_whileStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 168
            self.match(MiniJavaParser.WHILE)
            self.state = 169
            self.match(MiniJavaParser.T__0)
            self.state = 170
            localctx.c = self.boolExpr()
            self.state = 171
            self.match(MiniJavaParser.T__1)
             self._ensureBool("while", localctx.c.vType) 
            self.state = 173
            self.match(MiniJavaParser.OCURLYB)
            self.state = 177
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 68719654912) != 0):
                self.state = 174
                self.sentences()
                self.state = 179
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 180
            self.match(MiniJavaParser.CCURLYB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoolExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.a = None # BoolAndContext
            self.b = None # BoolAndContext

        def boolAnd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.BoolAndContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.BoolAndContext,i)


        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.OR)
            else:
                return self.getToken(MiniJavaParser.OR, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_boolExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolExpr" ):
                listener.enterBoolExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolExpr" ):
                listener.exitBoolExpr(self)




    def boolExpr(self):

        localctx = MiniJavaParser.BoolExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_boolExpr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 182
            localctx.a = self.boolAnd()
             localctx.vType = localctx.a.vType 
            self.state = 190
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==27:
                self.state = 184
                self.match(MiniJavaParser.OR)
                self.state = 185
                localctx.b = self.boolAnd()
                 localctx.vType = self._mixBool(localctx.vType, localctx.b.vType, "OR") 
                self.state = 192
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoolAndContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.a = None # BoolNotContext
            self.b = None # BoolNotContext

        def boolNot(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.BoolNotContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.BoolNotContext,i)


        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.AND)
            else:
                return self.getToken(MiniJavaParser.AND, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_boolAnd

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolAnd" ):
                listener.enterBoolAnd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolAnd" ):
                listener.exitBoolAnd(self)




    def boolAnd(self):

        localctx = MiniJavaParser.BoolAndContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_boolAnd)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 193
            localctx.a = self.boolNot()
             localctx.vType = localctx.a.vType 
            self.state = 201
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 195
                self.match(MiniJavaParser.AND)
                self.state = 196
                localctx.b = self.boolNot()
                 localctx.vType = self._mixBool(localctx.vType, localctx.b.vType, "AND") 
                self.state = 203
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoolNotContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.nb = None # BoolNotContext
            self.ba = None # BoolAtomContext

        def NOT(self):
            return self.getToken(MiniJavaParser.NOT, 0)

        def boolNot(self):
            return self.getTypedRuleContext(MiniJavaParser.BoolNotContext,0)


        def boolAtom(self):
            return self.getTypedRuleContext(MiniJavaParser.BoolAtomContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_boolNot

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolNot" ):
                listener.enterBoolNot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolNot" ):
                listener.exitBoolNot(self)




    def boolNot(self):

        localctx = MiniJavaParser.BoolNotContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_boolNot)
        try:
            self.state = 211
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 204
                self.match(MiniJavaParser.NOT)
                self.state = 205
                localctx.nb = self.boolNot()
                 localctx.vType = self._ensureBool("NOT", localctx.nb.vType) 
                pass
            elif token in [1, 18, 19, 34, 35, 36]:
                self.enterOuterAlt(localctx, 2)
                self.state = 208
                localctx.ba = self.boolAtom()
                 localctx.vType = localctx.ba.vType 
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoolAtomContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.b = None # BoolExprContext
            self.c = None # CmpNoParenContext

        def TRUE(self):
            return self.getToken(MiniJavaParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(MiniJavaParser.FALSE, 0)

        def boolExpr(self):
            return self.getTypedRuleContext(MiniJavaParser.BoolExprContext,0)


        def cmpNoParen(self):
            return self.getTypedRuleContext(MiniJavaParser.CmpNoParenContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_boolAtom

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolAtom" ):
                listener.enterBoolAtom(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolAtom" ):
                listener.exitBoolAtom(self)




    def boolAtom(self):

        localctx = MiniJavaParser.BoolAtomContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_boolAtom)
        try:
            self.state = 225
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [18]:
                self.enterOuterAlt(localctx, 1)
                self.state = 213
                self.match(MiniJavaParser.TRUE)
                 localctx.vType = self.T_BOOL 
                pass
            elif token in [19]:
                self.enterOuterAlt(localctx, 2)
                self.state = 215
                self.match(MiniJavaParser.FALSE)
                 localctx.vType = self.T_BOOL 
                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 3)
                self.state = 217
                self.match(MiniJavaParser.T__0)
                self.state = 218
                localctx.b = self.boolExpr()
                self.state = 219
                self.match(MiniJavaParser.T__1)
                 localctx.vType = localctx.b.vType 
                pass
            elif token in [34, 35, 36]:
                self.enterOuterAlt(localctx, 4)
                self.state = 222
                localctx.c = self.cmpNoParen()
                 localctx.vType = localctx.c.vType 
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmpNoParenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.a = None # ExprNoParenContext
            self.op = None # Token
            self.b = None # ExprContext

        def exprNoParen(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprNoParenContext,0)


        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def EQ(self):
            return self.getToken(MiniJavaParser.EQ, 0)

        def NE(self):
            return self.getToken(MiniJavaParser.NE, 0)

        def LE(self):
            return self.getToken(MiniJavaParser.LE, 0)

        def GE(self):
            return self.getToken(MiniJavaParser.GE, 0)

        def LT(self):
            return self.getToken(MiniJavaParser.LT, 0)

        def GT(self):
            return self.getToken(MiniJavaParser.GT, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_cmpNoParen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmpNoParen" ):
                listener.enterCmpNoParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmpNoParen" ):
                listener.exitCmpNoParen(self)




    def cmpNoParen(self):

        localctx = MiniJavaParser.CmpNoParenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_cmpNoParen)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 227
            localctx.a = self.exprNoParen()
            self.state = 228
            localctx.op = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 66060288) != 0)):
                localctx.op = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 229
            localctx.b = self.expr()

            _av = localctx.a.vType
            _bv = localctx.b.vType
            if (_av == self.T_INT and _bv == self.T_INT) or (_av == self.T_DOUBLE and _bv == self.T_DOUBLE):
                localctx.vType = self.T_BOOL
            else:
                self._log(f"[ERR] Comparación entre tipos incompatibles en condición ({_av} vs {_bv})")
                localctx.vType = self.T_MIXED
                
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprNoParenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.m1 = None # MultNoParenContext
            self.m2 = None # MultNoParenContext

        def multNoParen(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.MultNoParenContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.MultNoParenContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_exprNoParen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprNoParen" ):
                listener.enterExprNoParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprNoParen" ):
                listener.exitExprNoParen(self)




    def exprNoParen(self):

        localctx = MiniJavaParser.ExprNoParenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_exprNoParen)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 232
            localctx.m1 = self.multNoParen()
             localctx.vType = localctx.m1.vType 
            self.state = 240
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4 or _la==5:
                self.state = 234
                _la = self._input.LA(1)
                if not(_la==4 or _la==5):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 235
                localctx.m2 = self.multNoParen()
                 localctx.vType = self._mixTypes(localctx.vType, localctx.m2.vType, "Suma/Resta") 
                self.state = 242
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MultNoParenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.a1 = None # AtomNoParenContext
            self.a2 = None # AtomNoParenContext

        def atomNoParen(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.AtomNoParenContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.AtomNoParenContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_multNoParen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultNoParen" ):
                listener.enterMultNoParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultNoParen" ):
                listener.exitMultNoParen(self)




    def multNoParen(self):

        localctx = MiniJavaParser.MultNoParenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_multNoParen)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 243
            localctx.a1 = self.atomNoParen()
             localctx.vType = localctx.a1.vType 
            self.state = 251
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6 or _la==7:
                self.state = 245
                _la = self._input.LA(1)
                if not(_la==6 or _la==7):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 246
                localctx.a2 = self.atomNoParen()
                 localctx.vType = self._mixTypes(localctx.vType, localctx.a2.vType, "Multiplicación") 
                self.state = 253
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtomNoParenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.id_ = None # Token

        def CINT(self):
            return self.getToken(MiniJavaParser.CINT, 0)

        def CFLOAT(self):
            return self.getToken(MiniJavaParser.CFLOAT, 0)

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_atomNoParen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtomNoParen" ):
                listener.enterAtomNoParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtomNoParen" ):
                listener.exitAtomNoParen(self)




    def atomNoParen(self):

        localctx = MiniJavaParser.AtomNoParenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_atomNoParen)
        try:
            self.state = 260
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [34]:
                self.enterOuterAlt(localctx, 1)
                self.state = 254
                self.match(MiniJavaParser.CINT)
                 localctx.vType = self.T_INT 
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 256
                self.match(MiniJavaParser.CFLOAT)
                 localctx.vType = self.T_DOUBLE 
                pass
            elif token in [36]:
                self.enterOuterAlt(localctx, 3)
                self.state = 258
                localctx.id_ = self.match(MiniJavaParser.ID)
                 localctx.vType = self._lookupVarType((None if localctx.id is None else localctx.id.text)) 
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.m1 = None # MultExprContext
            self.m2 = None # MultExprContext

        def multExpr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.MultExprContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.MultExprContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = MiniJavaParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 262
            localctx.m1 = self.multExpr()
             localctx.vType = localctx.m1.vType 
            self.state = 270
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4 or _la==5:
                self.state = 264
                _la = self._input.LA(1)
                if not(_la==4 or _la==5):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 265
                localctx.m2 = self.multExpr()
                 localctx.vType = self._mixTypes(localctx.vType, localctx.m2.vType, "Suma/Resta") 
                self.state = 272
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MultExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.a1 = None # AtomContext
            self.a2 = None # AtomContext

        def atom(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.AtomContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.AtomContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_multExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultExpr" ):
                listener.enterMultExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultExpr" ):
                listener.exitMultExpr(self)




    def multExpr(self):

        localctx = MiniJavaParser.MultExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_multExpr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            localctx.a1 = self.atom()
             localctx.vType = localctx.a1.vType 
            self.state = 281
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==6 or _la==7:
                self.state = 275
                _la = self._input.LA(1)
                if not(_la==6 or _la==7):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 276
                localctx.a2 = self.atom()
                 localctx.vType = self._mixTypes(localctx.vType, localctx.a2.vType, "Multiplicación") 
                self.state = 283
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtomContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.vType = None
            self.id_ = None # Token
            self._expr = None # ExprContext

        def CINT(self):
            return self.getToken(MiniJavaParser.CINT, 0)

        def CFLOAT(self):
            return self.getToken(MiniJavaParser.CFLOAT, 0)

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_atom

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtom" ):
                listener.enterAtom(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtom" ):
                listener.exitAtom(self)




    def atom(self):

        localctx = MiniJavaParser.AtomContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_atom)
        try:
            self.state = 295
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [34]:
                self.enterOuterAlt(localctx, 1)
                self.state = 284
                self.match(MiniJavaParser.CINT)
                 localctx.vType = self.T_INT 
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 286
                self.match(MiniJavaParser.CFLOAT)
                 localctx.vType = self.T_DOUBLE 
                pass
            elif token in [36]:
                self.enterOuterAlt(localctx, 3)
                self.state = 288
                localctx.id_ = self.match(MiniJavaParser.ID)
                 localctx.vType = self._lookupVarType((None if localctx.id is None else localctx.id.text)) 
                pass
            elif token in [1]:
                self.enterOuterAlt(localctx, 4)
                self.state = 290
                self.match(MiniJavaParser.T__0)
                self.state = 291
                localctx._expr = self.expr()
                self.state = 292
                self.match(MiniJavaParser.T__1)
                 localctx.vType = localctx._expr.vType 
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AccesmodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PUBLIC(self):
            return self.getToken(MiniJavaParser.PUBLIC, 0)

        def PRIVATE(self):
            return self.getToken(MiniJavaParser.PRIVATE, 0)

        def PROTECTED(self):
            return self.getToken(MiniJavaParser.PROTECTED, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_accesmod

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAccesmod" ):
                listener.enterAccesmod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAccesmod" ):
                listener.exitAccesmod(self)




    def accesmod(self):

        localctx = MiniJavaParser.AccesmodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_accesmod)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 297
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1792) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(MiniJavaParser.INT, 0)

        def DOUBLE(self):
            return self.getToken(MiniJavaParser.DOUBLE, 0)

        def VOID(self):
            return self.getToken(MiniJavaParser.VOID, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_tipo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipo" ):
                listener.enterTipo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipo" ):
                listener.exitTipo(self)




    def tipo(self):

        localctx = MiniJavaParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_tipo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 299
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 14336) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





