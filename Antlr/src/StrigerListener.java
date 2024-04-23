// Generated from C:/Users/91807/Desktop/GitHub/SER502-Striger-Team9/Antlr/src/Striger.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrigerParser}.
 */
public interface StrigerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrigerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrigerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrigerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#initializations}.
	 * @param ctx the parse tree
	 */
	void enterInitializations(StrigerParser.InitializationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#initializations}.
	 * @param ctx the parse tree
	 */
	void exitInitializations(StrigerParser.InitializationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(StrigerParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(StrigerParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#computations}.
	 * @param ctx the parse tree
	 */
	void enterComputations(StrigerParser.ComputationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#computations}.
	 * @param ctx the parse tree
	 */
	void exitComputations(StrigerParser.ComputationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#computation}.
	 * @param ctx the parse tree
	 */
	void enterComputation(StrigerParser.ComputationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#computation}.
	 * @param ctx the parse tree
	 */
	void exitComputation(StrigerParser.ComputationContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(StrigerParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(StrigerParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(StrigerParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(StrigerParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(StrigerParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(StrigerParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(StrigerParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(StrigerParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#elif_part}.
	 * @param ctx the parse tree
	 */
	void enterElif_part(StrigerParser.Elif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#elif_part}.
	 * @param ctx the parse tree
	 */
	void exitElif_part(StrigerParser.Elif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else(StrigerParser.If_then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else(StrigerParser.If_then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#terinary}.
	 * @param ctx the parse tree
	 */
	void enterTerinary(StrigerParser.TerinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#terinary}.
	 * @param ctx the parse tree
	 */
	void exitTerinary(StrigerParser.TerinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StrigerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StrigerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(StrigerParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(StrigerParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(StrigerParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(StrigerParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#for_inrange}.
	 * @param ctx the parse tree
	 */
	void enterFor_inrange(StrigerParser.For_inrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#for_inrange}.
	 * @param ctx the parse tree
	 */
	void exitFor_inrange(StrigerParser.For_inrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(StrigerParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(StrigerParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StrigerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StrigerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(StrigerParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(StrigerParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#arthexpr}.
	 * @param ctx the parse tree
	 */
	void enterArthexpr(StrigerParser.ArthexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#arthexpr}.
	 * @param ctx the parse tree
	 */
	void exitArthexpr(StrigerParser.ArthexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrigerParser#asnmt_op}.
	 * @param ctx the parse tree
	 */
	void enterAsnmt_op(StrigerParser.Asnmt_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrigerParser#asnmt_op}.
	 * @param ctx the parse tree
	 */
	void exitAsnmt_op(StrigerParser.Asnmt_opContext ctx);
}