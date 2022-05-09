// Generated from C:/Users/arsen/IdeaProjects/Formal languages/ANTLR_Homework/src/antlr\Lang.g4 by ANTLR 4.10.1

package ru.itmo.fl.lang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramState ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(LangParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(LangParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(LangParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(LangParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(LangParser.SimpleExpressionContext ctx);
}