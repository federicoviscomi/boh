// Generated from /Users/feviscom/workspace/jogFun/src/main/antlr4/JogFilter.g4 by ANTLR 4.7
package com.feviscom.server.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JogFilterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JogFilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(JogFilterParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(JogFilterParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JogFilterParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(JogFilterParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(JogFilterParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(JogFilterParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(JogFilterParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(JogFilterParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(JogFilterParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(JogFilterParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(JogFilterParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(JogFilterParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(JogFilterParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(JogFilterParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(JogFilterParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(JogFilterParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(JogFilterParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(JogFilterParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(JogFilterParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(JogFilterParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(JogFilterParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(JogFilterParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(JogFilterParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(JogFilterParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JogFilterParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(JogFilterParser.Any_nameContext ctx);
}