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


    # Enter a parse tree produced by MiniJavaParser#classes.
    def enterClasses(self, ctx:MiniJavaParser.ClassesContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#classes.
    def exitClasses(self, ctx:MiniJavaParser.ClassesContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#member.
    def enterMember(self, ctx:MiniJavaParser.MemberContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#member.
    def exitMember(self, ctx:MiniJavaParser.MemberContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#property.
    def enterProperty(self, ctx:MiniJavaParser.PropertyContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#property.
    def exitProperty(self, ctx:MiniJavaParser.PropertyContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#method.
    def enterMethod(self, ctx:MiniJavaParser.MethodContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#method.
    def exitMethod(self, ctx:MiniJavaParser.MethodContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#decl_args.
    def enterDecl_args(self, ctx:MiniJavaParser.Decl_argsContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#decl_args.
    def exitDecl_args(self, ctx:MiniJavaParser.Decl_argsContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#decl_local.
    def enterDecl_local(self, ctx:MiniJavaParser.Decl_localContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#decl_local.
    def exitDecl_local(self, ctx:MiniJavaParser.Decl_localContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#sentences.
    def enterSentences(self, ctx:MiniJavaParser.SentencesContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#sentences.
    def exitSentences(self, ctx:MiniJavaParser.SentencesContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#assignment.
    def enterAssignment(self, ctx:MiniJavaParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#assignment.
    def exitAssignment(self, ctx:MiniJavaParser.AssignmentContext):
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


    # Enter a parse tree produced by MiniJavaParser#boolExpr.
    def enterBoolExpr(self, ctx:MiniJavaParser.BoolExprContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#boolExpr.
    def exitBoolExpr(self, ctx:MiniJavaParser.BoolExprContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#boolAnd.
    def enterBoolAnd(self, ctx:MiniJavaParser.BoolAndContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#boolAnd.
    def exitBoolAnd(self, ctx:MiniJavaParser.BoolAndContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#boolNot.
    def enterBoolNot(self, ctx:MiniJavaParser.BoolNotContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#boolNot.
    def exitBoolNot(self, ctx:MiniJavaParser.BoolNotContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#boolAtom.
    def enterBoolAtom(self, ctx:MiniJavaParser.BoolAtomContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#boolAtom.
    def exitBoolAtom(self, ctx:MiniJavaParser.BoolAtomContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#cmpNoParen.
    def enterCmpNoParen(self, ctx:MiniJavaParser.CmpNoParenContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#cmpNoParen.
    def exitCmpNoParen(self, ctx:MiniJavaParser.CmpNoParenContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#exprNoParen.
    def enterExprNoParen(self, ctx:MiniJavaParser.ExprNoParenContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#exprNoParen.
    def exitExprNoParen(self, ctx:MiniJavaParser.ExprNoParenContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#multNoParen.
    def enterMultNoParen(self, ctx:MiniJavaParser.MultNoParenContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#multNoParen.
    def exitMultNoParen(self, ctx:MiniJavaParser.MultNoParenContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#atomNoParen.
    def enterAtomNoParen(self, ctx:MiniJavaParser.AtomNoParenContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#atomNoParen.
    def exitAtomNoParen(self, ctx:MiniJavaParser.AtomNoParenContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#expr.
    def enterExpr(self, ctx:MiniJavaParser.ExprContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#expr.
    def exitExpr(self, ctx:MiniJavaParser.ExprContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#multExpr.
    def enterMultExpr(self, ctx:MiniJavaParser.MultExprContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#multExpr.
    def exitMultExpr(self, ctx:MiniJavaParser.MultExprContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#atom.
    def enterAtom(self, ctx:MiniJavaParser.AtomContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#atom.
    def exitAtom(self, ctx:MiniJavaParser.AtomContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#accesmod.
    def enterAccesmod(self, ctx:MiniJavaParser.AccesmodContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#accesmod.
    def exitAccesmod(self, ctx:MiniJavaParser.AccesmodContext):
        pass


    # Enter a parse tree produced by MiniJavaParser#tipo.
    def enterTipo(self, ctx:MiniJavaParser.TipoContext):
        pass

    # Exit a parse tree produced by MiniJavaParser#tipo.
    def exitTipo(self, ctx:MiniJavaParser.TipoContext):
        pass



del MiniJavaParser