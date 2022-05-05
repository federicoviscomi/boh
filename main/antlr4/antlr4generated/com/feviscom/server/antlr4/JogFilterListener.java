// Generated from /Users/feviscom/workspace/jogFun/src/main/antlr4/JogFilter.g4 by ANTLR 4.7
package com.feviscom.server.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JogFilterParser}.
 */
public interface JogFilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(JogFilterParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(JogFilterParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(JogFilterParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(JogFilterParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JogFilterParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JogFilterParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(JogFilterParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(JogFilterParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(JogFilterParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(JogFilterParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(JogFilterParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(JogFilterParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(JogFilterParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(JogFilterParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(JogFilterParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(JogFilterParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(JogFilterParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(JogFilterParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(JogFilterParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(JogFilterParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(JogFilterParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(JogFilterParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(JogFilterParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(JogFilterParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(JogFilterParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(JogFilterParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(JogFilterParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(JogFilterParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(JogFilterParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(JogFilterParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(JogFilterParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(JogFilterParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(JogFilterParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(JogFilterParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(JogFilterParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(JogFilterParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(JogFilterParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(JogFilterParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(JogFilterParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(JogFilterParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(JogFilterParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(JogFilterParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(JogFilterParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(JogFilterParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(JogFilterParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(JogFilterParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(JogFilterParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(JogFilterParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JogFilterParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(JogFilterParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JogFilterParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(JogFilterParser.Any_nameContext ctx);
}