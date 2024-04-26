package src;

import java.util.HashMap;
import java.util.Map;

public class StrigerInterpreter extends StrigerBaseVisitor {
    static HashMap<String, Map<String, String>> store = new HashMap<>();

    @Override
    public Object visitProgram(StrigerParser.ProgramContext ctx) {
        Map<String, String> intMap = new HashMap<>();
        Map<String, String> strMap = new HashMap<>();
        Map<String, String> boolMap = new HashMap<>();

        store.put("Integer", intMap);
        store.put("String", strMap);
        store.put("Boolean", boolMap);

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitInitializations(StrigerParser.InitializationsContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitInitialization(StrigerParser.InitializationContext ctx) {
        String type = ctx.getChild(0).getText();
        String varName = ctx.Variable_name().getText();

        if (type.equals("int")) {
            String value = "";
            if (ctx.Int() != null){
                value = ctx.Int().getText();
            } else if (ctx.arthexpr() != null){
                value = String.valueOf(evaluateArithmeticExpression(ctx.arthexpr().getText()));
            } else if (ctx.terinary() != null){
                value = String.valueOf(visitTerinary(ctx.terinary()));
            } else {
                value = "0";
            }
            store.get("Integer").put(varName, value);
        } else if (type.equals("String")) {
            String value = ctx.Str().getText();
            store.get("String").put(varName, value);
        } else if (type.equals("bool")) {
            String value = String.valueOf(evaluateBooleanExpression(ctx.boolexpr().getText()));
            store.get("Boolean").put(varName, value);
        } else if (type.equals("var")) {
            // do nothing, just declare the variable
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComputations(StrigerParser.ComputationsContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitComputation(StrigerParser.ComputationContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitConclusion(StrigerParser.ConclusionContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitPrint_statement(StrigerParser.Print_statementContext ctx) {
        if (ctx.getChildCount() == 2 && (ctx.Variable_name()!=null)) {
            // print Variable_name
            String varName = ctx.Variable_name().getText();
            if (store.get("Integer").containsKey(varName)) {
                System.out.println(store.get("Integer").get(varName));
            } else if (store.get("String").containsKey(varName)) {
                System.out.println(store.get("String").get(varName));
            } else if (store.get("Boolean").containsKey(varName)) {
                System.out.println(store.get("Boolean").get(varName));
            }
        } else if (ctx.getChildCount() == 4 && (ctx.Variable_name() != null)) {
            // print (Variable_name)
            String varName = ctx.Variable_name().getText();
            if (store.get("Integer").containsKey(varName)) {
                System.out.println(store.get("Integer").get(varName));
            } else if (store.get("String").containsKey(varName)) {
                System.out.println(store.get("String").get(varName));
            } else if (store.get("Boolean").containsKey(varName)) {
                System.out.println(store.get("Boolean").get(varName));
            }
        } else if (ctx.getChildCount() == 4 && (ctx.Str() != null)) {
            // print (Str)
            String stringValue = ctx.Str().getText();
            System.out.println(stringValue);
        } else if (ctx.getChildCount() == 4 && (ctx.Int() != null)) {
            // print (Int)
            int intValue = Integer.parseInt(ctx.Int().getText());
            System.out.println(intValue);
        } else if (ctx.getChildCount() == 4 && (ctx.boolexpr() != null)) {
            // print (boolexpr)
            boolean boolValue = evaluateBooleanExpression(ctx.boolexpr().getText());
            System.out.println(boolValue);
        } else if (ctx.getChildCount() == 2 && (ctx.Str()!=null)) {
            // print Str
            String stringValue = ctx.Str().getText();
            System.out.println(stringValue);
        } else if (ctx.getChildCount() == 2 && (ctx.Int()!=null)) {
            // print Int
            int intValue = Integer.parseInt(ctx.Int().getText());
            System.out.println(intValue);
        } else if (ctx.getChildCount() == 2 && (ctx.boolexpr() != null)) {
            // print boolexpr
            boolean boolValue = evaluateBooleanExpression(ctx.boolexpr().getText());
            System.out.println(boolValue);
        }
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitConditionals(StrigerParser.ConditionalsContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitIf_condition(StrigerParser.If_conditionContext ctx) {
        String condition = ctx.boolexpr().getText();
        boolean condValue = evaluateBooleanExpression(condition);
        if (condValue) {
           visitComputations(ctx.computations());
        }
        if (ctx.elif_part() != null){
            return super.visitElif_part(ctx.elif_part());
        }
        if (ctx.else_part() != null) {
            return super.visitChildren(ctx.else_part());
        }
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitElif_part(StrigerParser.Elif_partContext ctx) {
        String condition = ctx.boolexpr().getText();
        boolean condValue = evaluateBooleanExpression(condition);
        if (condValue) {
            visitComputations(ctx.computations());
        }
        return super.visitChildren(ctx);
    }

    @Override public Object visitElse_part(StrigerParser.Else_partContext ctx) {
        visitComputations(ctx.computations());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitIf_then_else(StrigerParser.If_then_elseContext ctx) {
        String condition = ctx.getChild(1).getText();
        boolean condValue = evaluateBooleanExpression(condition);
        if (condValue) {
            return super.visit(ctx.getChild(3));
        } else {
            return super.visit(ctx.getChild(5));
        }
    }

    @Override
    public Object visitTerinary(StrigerParser.TerinaryContext ctx) {
        String condition = ctx.boolexpr().getText();
        boolean condValue = evaluateBooleanExpression(condition);
        if (condValue) {
//            System.out.print(ctx.getChild(2));
            if (ctx.arthexpr() != null){
                return super.visit(ctx.arthexpr(0));
            } else if (ctx.Str() != null) {
                return  super.visit(ctx.Str(0));
            } else {
                return  super.visit(ctx.Variable_name(0));
            }
        } else {
            if (ctx.arthexpr() != null){
                return super.visit(ctx.arthexpr(1));
            } else if (ctx.Str() != null) {
                return  super.visit(ctx.Str(1));
            } else {
                return  super.visit(ctx.Variable_name(1));
            }
        }
    }

    @Override
    public Object visitAssignment(StrigerParser.AssignmentContext ctx) {
        String varName = ctx.Variable_name().getText();
        String value;
        if (ctx.expression() != null){
            if (ctx.expression().boolexpr() != null){
                value = String.valueOf(evaluateBooleanExpression(ctx.expression().boolexpr().getText()));
            } else {
                value = String.valueOf(evaluateArithmeticExpression(ctx.expression().boolexpr().getText()));
            }
        }
        else if (ctx.getChild(2) instanceof StrigerParser.TerinaryContext) {
            value = visitTerinary((StrigerParser.TerinaryContext) ctx.terinary()).toString();
        }
        else {
            String flag = (ctx.arthexpr().getText());
            if (ctx.getChild(1).getText().equals("++")){
                flag = flag + " + 1";
            } else if (ctx.getChild(1).getText().equals("--")) {
                flag = flag + " + 1";
            } else if (ctx.getChild(1).getText().equals("--")) {
                flag = "1 - " + flag;
            } else {
                flag = "1 + " + flag;
            }
            value = flag;
        }

        if (store.get("Integer").containsKey(varName)) {
            store.get("Integer").put(varName, value);
        } else if (store.get("String").containsKey(varName)) {
            store.get("String").put(varName, value);
        } else if (store.get("Boolean").containsKey(varName)) {
            store.get("Boolean").put(varName, value);
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitLoops(StrigerParser.LoopsContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFor_loop(StrigerParser.For_loopContext ctx) {
        String initialization = ctx.getChild(2).getText();
        String condition = ctx.getChild(4).getText();
        String assignment = ctx.getChild(6).getText();

        if (initialization.contains("++")) {
            String varName = initialization.substring(0, initialization.indexOf("++"));
            int varValue = Integer.parseInt(store.get("Integer").get(varName));
            store.get("Integer").put(varName, Integer.toString(varValue + 1));
        } else if (initialization.contains("--")) {
            String varName = initialization.substring(0, initialization.indexOf("--"));
            int varValue = Integer.parseInt(store.get("Integer").get(varName));
            store.get("Integer").put(varName, Integer.toString(varValue - 1));
        }

        while (evaluateBooleanExpression(condition)) {
            super.visit(ctx.getChild(7));

            if (assignment.contains("++")) {
                String varName = assignment.substring(0, assignment.indexOf("++"));
                int varValue = Integer.parseInt(store.get("Integer").get(varName));
                store.get("Integer").put(varName, Integer.toString(varValue + 1));
            } else if (assignment.contains("--")) {
                String varName = assignment.substring(0, assignment.indexOf("--"));
                int varValue = Integer.parseInt(store.get("Integer").get(varName));
                store.get("Integer").put(varName, Integer.toString(varValue - 1));
            }
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFor_inrange(StrigerParser.For_inrangeContext ctx) {
        String varName = ctx.getChild(1).getText();
        String start = ctx.getChild(5).getText();
        String end = ctx.getChild(7).getText();

        for (int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++) {
            store.get("Integer").put(varName, Integer.toString(i));
            super.visit(ctx.getChild(6));
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitWhile_loop(StrigerParser.While_loopContext ctx) {
        String condition = ctx.getChild(1).getText();

        while (evaluateBooleanExpression(condition)) {
            super.visit(ctx.getChild(3));
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitExpression(StrigerParser.ExpressionContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitBoolexpr(StrigerParser.BoolexprContext ctx) {
        if (ctx.getChildCount() == 1) {
            return evaluateBooleanExpression(ctx.getChild(0).getText());
        } else if (ctx.getChildCount() == 2) {
            return !evaluateBooleanExpression(ctx.getChild(1).getText());
        } else if (ctx.getChild(2) instanceof StrigerParser.BoolexprContext) {
            return evaluateBooleanExpression(ctx.getChild(2).getText());
        }

        String operator = ctx.getChild(1).getText();
        String left = ctx.getChild(0).getText();
        String right = ctx.getChild(2).getText();

        if (operator.equals("==")) {
            return evaluateArithmeticExpression(left) == (evaluateArithmeticExpression(right));
        } else if (operator.equals("!=")) {
            return evaluateArithmeticExpression(left) != (evaluateArithmeticExpression(right));
        } else if (operator.equals(">")) {
            return evaluateArithmeticExpression(left) > evaluateArithmeticExpression(right);
        } else if (operator.equals(">=")) {
            return evaluateArithmeticExpression(left) >= evaluateArithmeticExpression(right);
        } else if (operator.equals("<")) {
            return evaluateArithmeticExpression(left) < evaluateArithmeticExpression(right);
        } else if (operator.equals("<=")) {
            return evaluateArithmeticExpression(left) <= evaluateArithmeticExpression(right);
        }

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitArthexpr(StrigerParser.ArthexprContext ctx) {
        if (ctx.getChildCount() == 1) {
            if (ctx.getChild(0) instanceof StrigerParser.ArthexprContext) {
                String varName = ctx.getChild(0).getText();
                if (store.get("Integer").containsKey(varName)) {
                    return store.get("Integer").get(varName);
                } else if (store.get("String").containsKey(varName)) {
                    return store.get("String").get(varName);
                } else if (store.get("Boolean").containsKey(varName)) {
                    return store.get("Boolean").get(varName);
                }
            } else {
                return Integer.parseInt(ctx.getChild(0).getText());
            }
        }

        String operator = ctx.getChild(1).getText();
        String left = ctx.getChild(0).getText();
        String right = ctx.getChild(2).getText();

        if (operator.equals("+")) {
            return evaluateArithmeticExpression(left) + evaluateArithmeticExpression(right);
        } else if (operator.equals("-")) {
            return evaluateArithmeticExpression(left) - evaluateArithmeticExpression(right);
        } else if (operator.equals("*")) {
            return evaluateArithmeticExpression(left) * evaluateArithmeticExpression(right);
        } else if (operator.equals("/")) {
            return evaluateArithmeticExpression(left) / evaluateArithmeticExpression(right);
        }
        return super.visitChildren(ctx);
    }

    private boolean evaluateBooleanExpression(String expr) {
        if (expr.equals("true")) {
            return true;
        } else if (expr.equals("false")) {
            return false;
        }

        return evaluateArithmeticExpression(expr) == (1);
    }

    private int evaluateArithmeticExpression(String expr) {
        expr = expr.replaceAll("\\s", "");
        if (expr.isEmpty()) {
            throw new IllegalArgumentException("Empty expression");
        }
        // Handling Simple Numbers
        if (expr.matches("[-+]?\\d+")) {
            return Integer.parseInt(expr);
        }
        // Variable Lookup
        if (expr.matches("\\w+")) {
            String variable = expr;
            if (!store.get("Integer").containsKey(variable)) {
                throw new IllegalArgumentException("Variable not found: " + variable);
            }
            return Integer.parseInt(store.get("Integer").get(variable));
        }
        if (expr.startsWith("(") && expr.endsWith(")")) {
            return evaluateArithmeticExpression(expr.substring(1, expr.length() - 1));
        }
        if (expr.contains("+")) {
            String[] parts = expr.split("\\+");
            return evaluateArithmeticExpression(parts[0]) + evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("-")) {
            String[] parts = expr.split("-");
            return evaluateArithmeticExpression(parts[0]) - evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*");
            return evaluateArithmeticExpression(parts[0]) * evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("/")) {
            String[] parts = expr.split("/");
            int divisor = evaluateArithmeticExpression(parts[1]);
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return evaluateArithmeticExpression(parts[0]) / divisor;
        }
        return 0;
    }
}