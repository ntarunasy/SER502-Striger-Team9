// Generated from C:/Users/91807/Desktop/GitHub/SER502-Striger-Team9/src.StrigerGrammar/Striger.g4 by ANTLR 4.13.1
package src;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrigerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrigerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrigerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrigerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#initializations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializations(StrigerParser.InitializationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(StrigerParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#computations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputations(StrigerParser.ComputationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#computation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputation(StrigerParser.ComputationContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(StrigerParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(StrigerParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#conditionals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionals(StrigerParser.ConditionalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(StrigerParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#elif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_part(StrigerParser.Elif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(StrigerParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#if_then_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else(StrigerParser.If_then_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#terinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerinary(StrigerParser.TerinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StrigerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(StrigerParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(StrigerParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#for_inrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_inrange(StrigerParser.For_inrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(StrigerParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StrigerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(StrigerParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrigerParser#arthexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArthexpr(StrigerParser.ArthexprContext ctx);
}