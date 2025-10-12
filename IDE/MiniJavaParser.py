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
        4,1,38,185,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,4,0,38,8,0,11,0,12,0,
        39,1,0,1,0,1,1,3,1,45,8,1,1,1,1,1,1,1,1,1,5,1,51,8,1,10,1,12,1,54,
        9,1,1,1,1,1,1,2,1,2,3,2,60,8,2,1,3,5,3,63,8,3,10,3,12,3,66,9,3,1,
        3,1,3,1,3,1,3,1,4,5,4,73,8,4,10,4,12,4,76,9,4,1,4,1,4,1,4,1,4,3,
        4,82,8,4,1,4,1,4,1,4,1,5,1,5,1,5,5,5,90,8,5,10,5,12,5,93,9,5,1,6,
        1,6,1,6,1,7,1,7,1,7,5,7,101,8,7,10,7,12,7,104,9,7,1,8,1,8,5,8,108,
        8,8,10,8,12,8,111,9,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,3,
        9,123,8,9,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,12,1,12,1,12,
        1,12,1,12,1,12,1,12,3,12,140,8,12,1,13,1,13,1,13,1,13,1,13,1,13,
        1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,3,14,158,8,14,
        1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,5,14,
        172,8,14,10,14,12,14,175,9,14,1,15,1,15,1,16,1,16,1,17,1,17,3,17,
        183,8,17,1,17,0,1,28,18,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,0,6,1,0,13,14,1,0,15,16,1,0,17,22,1,0,23,24,2,0,1,1,27,
        28,1,0,29,31,192,0,37,1,0,0,0,2,44,1,0,0,0,4,59,1,0,0,0,6,64,1,0,
        0,0,8,74,1,0,0,0,10,86,1,0,0,0,12,94,1,0,0,0,14,97,1,0,0,0,16,105,
        1,0,0,0,18,122,1,0,0,0,20,124,1,0,0,0,22,128,1,0,0,0,24,132,1,0,
        0,0,26,141,1,0,0,0,28,157,1,0,0,0,30,176,1,0,0,0,32,178,1,0,0,0,
        34,182,1,0,0,0,36,38,3,2,1,0,37,36,1,0,0,0,38,39,1,0,0,0,39,37,1,
        0,0,0,39,40,1,0,0,0,40,41,1,0,0,0,41,42,5,0,0,1,42,1,1,0,0,0,43,
        45,5,1,0,0,44,43,1,0,0,0,44,45,1,0,0,0,45,46,1,0,0,0,46,47,5,2,0,
        0,47,48,5,33,0,0,48,52,5,3,0,0,49,51,3,4,2,0,50,49,1,0,0,0,51,54,
        1,0,0,0,52,50,1,0,0,0,52,53,1,0,0,0,53,55,1,0,0,0,54,52,1,0,0,0,
        55,56,5,4,0,0,56,3,1,0,0,0,57,60,3,6,3,0,58,60,3,8,4,0,59,57,1,0,
        0,0,59,58,1,0,0,0,60,5,1,0,0,0,61,63,3,30,15,0,62,61,1,0,0,0,63,
        66,1,0,0,0,64,62,1,0,0,0,64,65,1,0,0,0,65,67,1,0,0,0,66,64,1,0,0,
        0,67,68,3,32,16,0,68,69,3,14,7,0,69,70,5,5,0,0,70,7,1,0,0,0,71,73,
        3,30,15,0,72,71,1,0,0,0,73,76,1,0,0,0,74,72,1,0,0,0,74,75,1,0,0,
        0,75,77,1,0,0,0,76,74,1,0,0,0,77,78,3,34,17,0,78,79,5,33,0,0,79,
        81,5,6,0,0,80,82,3,10,5,0,81,80,1,0,0,0,81,82,1,0,0,0,82,83,1,0,
        0,0,83,84,5,7,0,0,84,85,3,16,8,0,85,9,1,0,0,0,86,91,3,12,6,0,87,
        88,5,8,0,0,88,90,3,12,6,0,89,87,1,0,0,0,90,93,1,0,0,0,91,89,1,0,
        0,0,91,92,1,0,0,0,92,11,1,0,0,0,93,91,1,0,0,0,94,95,3,32,16,0,95,
        96,5,33,0,0,96,13,1,0,0,0,97,102,5,33,0,0,98,99,5,8,0,0,99,101,5,
        33,0,0,100,98,1,0,0,0,101,104,1,0,0,0,102,100,1,0,0,0,102,103,1,
        0,0,0,103,15,1,0,0,0,104,102,1,0,0,0,105,109,5,3,0,0,106,108,3,18,
        9,0,107,106,1,0,0,0,108,111,1,0,0,0,109,107,1,0,0,0,109,110,1,0,
        0,0,110,112,1,0,0,0,111,109,1,0,0,0,112,113,5,4,0,0,113,17,1,0,0,
        0,114,123,3,20,10,0,115,116,3,22,11,0,116,117,5,5,0,0,117,123,1,
        0,0,0,118,123,3,24,12,0,119,123,3,26,13,0,120,123,3,16,8,0,121,123,
        5,5,0,0,122,114,1,0,0,0,122,115,1,0,0,0,122,118,1,0,0,0,122,119,
        1,0,0,0,122,120,1,0,0,0,122,121,1,0,0,0,123,19,1,0,0,0,124,125,3,
        32,16,0,125,126,3,14,7,0,126,127,5,5,0,0,127,21,1,0,0,0,128,129,
        5,33,0,0,129,130,5,9,0,0,130,131,3,28,14,0,131,23,1,0,0,0,132,133,
        5,10,0,0,133,134,5,6,0,0,134,135,3,28,14,0,135,136,5,7,0,0,136,139,
        3,18,9,0,137,138,5,11,0,0,138,140,3,18,9,0,139,137,1,0,0,0,139,140,
        1,0,0,0,140,25,1,0,0,0,141,142,5,12,0,0,142,143,5,6,0,0,143,144,
        3,28,14,0,144,145,5,7,0,0,145,146,3,18,9,0,146,27,1,0,0,0,147,148,
        6,14,-1,0,148,149,5,6,0,0,149,150,3,28,14,0,150,151,5,7,0,0,151,
        158,1,0,0,0,152,158,5,33,0,0,153,158,5,34,0,0,154,158,5,35,0,0,155,
        158,5,25,0,0,156,158,5,26,0,0,157,147,1,0,0,0,157,152,1,0,0,0,157,
        153,1,0,0,0,157,154,1,0,0,0,157,155,1,0,0,0,157,156,1,0,0,0,158,
        173,1,0,0,0,159,160,10,10,0,0,160,161,7,0,0,0,161,172,3,28,14,11,
        162,163,10,9,0,0,163,164,7,1,0,0,164,172,3,28,14,10,165,166,10,8,
        0,0,166,167,7,2,0,0,167,172,3,28,14,9,168,169,10,7,0,0,169,170,7,
        3,0,0,170,172,3,28,14,8,171,159,1,0,0,0,171,162,1,0,0,0,171,165,
        1,0,0,0,171,168,1,0,0,0,172,175,1,0,0,0,173,171,1,0,0,0,173,174,
        1,0,0,0,174,29,1,0,0,0,175,173,1,0,0,0,176,177,7,4,0,0,177,31,1,
        0,0,0,178,179,7,5,0,0,179,33,1,0,0,0,180,183,3,32,16,0,181,183,5,
        32,0,0,182,180,1,0,0,0,182,181,1,0,0,0,183,35,1,0,0,0,16,39,44,52,
        59,64,74,81,91,102,109,122,139,157,171,173,182
    ]

class MiniJavaParser ( Parser ):

    grammarFileName = "MiniJava.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'class'", "'{'", "'}'", "';'", 
                     "'('", "')'", "','", "'='", "'if'", "'else'", "'while'", 
                     "'*'", "'/'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", 
                     "'=='", "'!='", "'&&'", "'||'", "'true'", "'false'", 
                     "'private'", "'protected'", "'int'", "'double'", "'bool'", 
                     "'void'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "ID", "INT", "DOUBLE", "WS", "LINE_COMMENT", 
                      "BLOCK_COMMENT" ]

    RULE_program = 0
    RULE_classDecl = 1
    RULE_memberDecl = 2
    RULE_fieldDecl = 3
    RULE_methodDecl = 4
    RULE_params = 5
    RULE_param = 6
    RULE_varList = 7
    RULE_block = 8
    RULE_stmt = 9
    RULE_varDecl = 10
    RULE_assignStmt = 11
    RULE_ifStmt = 12
    RULE_whileStmt = 13
    RULE_expr = 14
    RULE_modifier = 15
    RULE_type = 16
    RULE_typeOrVoid = 17

    ruleNames =  [ "program", "classDecl", "memberDecl", "fieldDecl", "methodDecl", 
                   "params", "param", "varList", "block", "stmt", "varDecl", 
                   "assignStmt", "ifStmt", "whileStmt", "expr", "modifier", 
                   "type", "typeOrVoid" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    ID=33
    INT=34
    DOUBLE=35
    WS=36
    LINE_COMMENT=37
    BLOCK_COMMENT=38

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MiniJavaParser.EOF, 0)

        def classDecl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ClassDeclContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ClassDeclContext,i)


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
            self.state = 37 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 36
                self.classDecl()
                self.state = 39 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1 or _la==2):
                    break

            self.state = 41
            self.match(MiniJavaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def memberDecl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.MemberDeclContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.MemberDeclContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_classDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassDecl" ):
                listener.enterClassDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassDecl" ):
                listener.exitClassDecl(self)




    def classDecl(self):

        localctx = MiniJavaParser.ClassDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_classDecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==1:
                self.state = 43
                self.match(MiniJavaParser.T__0)


            self.state = 46
            self.match(MiniJavaParser.T__1)
            self.state = 47
            self.match(MiniJavaParser.ID)
            self.state = 48
            self.match(MiniJavaParser.T__2)
            self.state = 52
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 8455716866) != 0):
                self.state = 49
                self.memberDecl()
                self.state = 54
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 55
            self.match(MiniJavaParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MemberDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def fieldDecl(self):
            return self.getTypedRuleContext(MiniJavaParser.FieldDeclContext,0)


        def methodDecl(self):
            return self.getTypedRuleContext(MiniJavaParser.MethodDeclContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_memberDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMemberDecl" ):
                listener.enterMemberDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMemberDecl" ):
                listener.exitMemberDecl(self)




    def memberDecl(self):

        localctx = MiniJavaParser.MemberDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_memberDecl)
        try:
            self.state = 59
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 57
                self.fieldDecl()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 58
                self.methodDecl()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FieldDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MiniJavaParser.TypeContext,0)


        def varList(self):
            return self.getTypedRuleContext(MiniJavaParser.VarListContext,0)


        def modifier(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ModifierContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ModifierContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_fieldDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFieldDecl" ):
                listener.enterFieldDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFieldDecl" ):
                listener.exitFieldDecl(self)




    def fieldDecl(self):

        localctx = MiniJavaParser.FieldDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_fieldDecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 402653186) != 0):
                self.state = 61
                self.modifier()
                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 67
            self.type_()
            self.state = 68
            self.varList()
            self.state = 69
            self.match(MiniJavaParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typeOrVoid(self):
            return self.getTypedRuleContext(MiniJavaParser.TypeOrVoidContext,0)


        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def block(self):
            return self.getTypedRuleContext(MiniJavaParser.BlockContext,0)


        def modifier(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ModifierContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ModifierContext,i)


        def params(self):
            return self.getTypedRuleContext(MiniJavaParser.ParamsContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_methodDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMethodDecl" ):
                listener.enterMethodDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMethodDecl" ):
                listener.exitMethodDecl(self)




    def methodDecl(self):

        localctx = MiniJavaParser.MethodDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_methodDecl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 402653186) != 0):
                self.state = 71
                self.modifier()
                self.state = 76
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 77
            self.typeOrVoid()
            self.state = 78
            self.match(MiniJavaParser.ID)
            self.state = 79
            self.match(MiniJavaParser.T__5)
            self.state = 81
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 3758096384) != 0):
                self.state = 80
                self.params()


            self.state = 83
            self.match(MiniJavaParser.T__6)
            self.state = 84
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def param(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ParamContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ParamContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParams" ):
                listener.enterParams(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParams" ):
                listener.exitParams(self)




    def params(self):

        localctx = MiniJavaParser.ParamsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.param()
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 87
                self.match(MiniJavaParser.T__7)
                self.state = 88
                self.param()
                self.state = 93
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MiniJavaParser.TypeContext,0)


        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_param

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParam" ):
                listener.enterParam(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParam" ):
                listener.exitParam(self)




    def param(self):

        localctx = MiniJavaParser.ParamContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_param)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self.type_()
            self.state = 95
            self.match(MiniJavaParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MiniJavaParser.ID)
            else:
                return self.getToken(MiniJavaParser.ID, i)

        def getRuleIndex(self):
            return MiniJavaParser.RULE_varList

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarList" ):
                listener.enterVarList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarList" ):
                listener.exitVarList(self)




    def varList(self):

        localctx = MiniJavaParser.VarListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_varList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 97
            self.match(MiniJavaParser.ID)
            self.state = 102
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 98
                self.match(MiniJavaParser.T__7)
                self.state = 99
                self.match(MiniJavaParser.ID)
                self.state = 104
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.StmtContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.StmtContext,i)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)




    def block(self):

        localctx = MiniJavaParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(MiniJavaParser.T__2)
            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 12348036136) != 0):
                self.state = 106
                self.stmt()
                self.state = 111
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 112
            self.match(MiniJavaParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def varDecl(self):
            return self.getTypedRuleContext(MiniJavaParser.VarDeclContext,0)


        def assignStmt(self):
            return self.getTypedRuleContext(MiniJavaParser.AssignStmtContext,0)


        def ifStmt(self):
            return self.getTypedRuleContext(MiniJavaParser.IfStmtContext,0)


        def whileStmt(self):
            return self.getTypedRuleContext(MiniJavaParser.WhileStmtContext,0)


        def block(self):
            return self.getTypedRuleContext(MiniJavaParser.BlockContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_stmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStmt" ):
                listener.enterStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStmt" ):
                listener.exitStmt(self)




    def stmt(self):

        localctx = MiniJavaParser.StmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_stmt)
        try:
            self.state = 122
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29, 30, 31]:
                self.enterOuterAlt(localctx, 1)
                self.state = 114
                self.varDecl()
                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 115
                self.assignStmt()
                self.state = 116
                self.match(MiniJavaParser.T__4)
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 3)
                self.state = 118
                self.ifStmt()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 119
                self.whileStmt()
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 5)
                self.state = 120
                self.block()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 6)
                self.state = 121
                self.match(MiniJavaParser.T__4)
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


    class VarDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MiniJavaParser.TypeContext,0)


        def varList(self):
            return self.getTypedRuleContext(MiniJavaParser.VarListContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_varDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarDecl" ):
                listener.enterVarDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarDecl" ):
                listener.exitVarDecl(self)




    def varDecl(self):

        localctx = MiniJavaParser.VarDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_varDecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 124
            self.type_()
            self.state = 125
            self.varList()
            self.state = 126
            self.match(MiniJavaParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_assignStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignStmt" ):
                listener.enterAssignStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignStmt" ):
                listener.exitAssignStmt(self)




    def assignStmt(self):

        localctx = MiniJavaParser.AssignStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_assignStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.match(MiniJavaParser.ID)
            self.state = 129
            self.match(MiniJavaParser.T__8)
            self.state = 130
            self.expr(0)
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

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def stmt(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.StmtContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.StmtContext,i)


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
        self.enterRule(localctx, 24, self.RULE_ifStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.match(MiniJavaParser.T__9)
            self.state = 133
            self.match(MiniJavaParser.T__5)
            self.state = 134
            self.expr(0)
            self.state = 135
            self.match(MiniJavaParser.T__6)
            self.state = 136
            self.stmt()
            self.state = 139
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.state = 137
                self.match(MiniJavaParser.T__10)
                self.state = 138
                self.stmt()


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

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def stmt(self):
            return self.getTypedRuleContext(MiniJavaParser.StmtContext,0)


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
        self.enterRule(localctx, 26, self.RULE_whileStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 141
            self.match(MiniJavaParser.T__11)
            self.state = 142
            self.match(MiniJavaParser.T__5)
            self.state = 143
            self.expr(0)
            self.state = 144
            self.match(MiniJavaParser.T__6)
            self.state = 145
            self.stmt()
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


        def getRuleIndex(self):
            return MiniJavaParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class DoubleLitContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def DOUBLE(self):
            return self.getToken(MiniJavaParser.DOUBLE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDoubleLit" ):
                listener.enterDoubleLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDoubleLit" ):
                listener.exitDoubleLit(self)


    class MulDivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMulDiv" ):
                listener.enterMulDiv(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMulDiv" ):
                listener.exitMulDiv(self)


    class AddSubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddSub" ):
                listener.enterAddSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddSub" ):
                listener.exitAddSub(self)


    class CmpContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmp" ):
                listener.enterCmp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmp" ):
                listener.exitCmp(self)


    class FalseLitContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFalseLit" ):
                listener.enterFalseLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFalseLit" ):
                listener.exitFalseLit(self)


    class TrueLitContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTrueLit" ):
                listener.enterTrueLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTrueLit" ):
                listener.exitTrueLit(self)


    class IdRefContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(MiniJavaParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIdRef" ):
                listener.enterIdRef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIdRef" ):
                listener.exitIdRef(self)


    class IntLitContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(MiniJavaParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIntLit" ):
                listener.enterIntLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIntLit" ):
                listener.exitIntLit(self)


    class BoolBinContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniJavaParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniJavaParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolBin" ):
                listener.enterBoolBin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolBin" ):
                listener.exitBoolBin(self)


    class ParenContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a MiniJavaParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(MiniJavaParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParen" ):
                listener.enterParen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParen" ):
                listener.exitParen(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniJavaParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 28
        self.enterRecursionRule(localctx, 28, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 157
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                localctx = MiniJavaParser.ParenContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 148
                self.match(MiniJavaParser.T__5)
                self.state = 149
                self.expr(0)
                self.state = 150
                self.match(MiniJavaParser.T__6)
                pass
            elif token in [33]:
                localctx = MiniJavaParser.IdRefContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 152
                self.match(MiniJavaParser.ID)
                pass
            elif token in [34]:
                localctx = MiniJavaParser.IntLitContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 153
                self.match(MiniJavaParser.INT)
                pass
            elif token in [35]:
                localctx = MiniJavaParser.DoubleLitContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 154
                self.match(MiniJavaParser.DOUBLE)
                pass
            elif token in [25]:
                localctx = MiniJavaParser.TrueLitContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 155
                self.match(MiniJavaParser.T__24)
                pass
            elif token in [26]:
                localctx = MiniJavaParser.FalseLitContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 156
                self.match(MiniJavaParser.T__25)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 173
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,14,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 171
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
                    if la_ == 1:
                        localctx = MiniJavaParser.MulDivContext(self, MiniJavaParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 159
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 160
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==13 or _la==14):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 161
                        self.expr(11)
                        pass

                    elif la_ == 2:
                        localctx = MiniJavaParser.AddSubContext(self, MiniJavaParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 162
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 163
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==15 or _la==16):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 164
                        self.expr(10)
                        pass

                    elif la_ == 3:
                        localctx = MiniJavaParser.CmpContext(self, MiniJavaParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 165
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 166
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 8257536) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 167
                        self.expr(9)
                        pass

                    elif la_ == 4:
                        localctx = MiniJavaParser.BoolBinContext(self, MiniJavaParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 168
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 169
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==23 or _la==24):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 170
                        self.expr(8)
                        pass

             
                self.state = 175
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,14,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ModifierContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MiniJavaParser.RULE_modifier

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterModifier" ):
                listener.enterModifier(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitModifier" ):
                listener.exitModifier(self)




    def modifier(self):

        localctx = MiniJavaParser.ModifierContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_modifier)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 402653186) != 0)):
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


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MiniJavaParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)




    def type_(self):

        localctx = MiniJavaParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 178
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3758096384) != 0)):
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


    class TypeOrVoidContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type_(self):
            return self.getTypedRuleContext(MiniJavaParser.TypeContext,0)


        def getRuleIndex(self):
            return MiniJavaParser.RULE_typeOrVoid

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeOrVoid" ):
                listener.enterTypeOrVoid(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeOrVoid" ):
                listener.exitTypeOrVoid(self)




    def typeOrVoid(self):

        localctx = MiniJavaParser.TypeOrVoidContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_typeOrVoid)
        try:
            self.state = 182
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [29, 30, 31]:
                self.enterOuterAlt(localctx, 1)
                self.state = 180
                self.type_()
                pass
            elif token in [32]:
                self.enterOuterAlt(localctx, 2)
                self.state = 181
                self.match(MiniJavaParser.T__31)
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



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[14] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 8)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 7)
         




