// Generated from //wsl$/Ubuntu/home/arsen/FormalLanguages/ANTLR_Homework/src/antlr\Lang.g4 by ANTLR 4.10.1

package ru.itmo.fl.lang.antlr;

import java.util.LinkedList;
import ru.itmo.fl.lang.tree.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(LangParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(LangParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(LangParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(LangParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(LangParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(LangParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(LangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(LangParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(LangParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(LangParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(LangParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(LangParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LangParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LangParser.InputContext ctx);
}