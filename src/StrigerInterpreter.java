package src;

import java.util.*;

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
        String condition = ctx.getChild(1).getText();
        boolean condValue = evaluateBooleanExpression(condition);
        if (condValue) {
            return visitChildren(ctx.computations());
        } else if (ctx.elif_part() != null) {
            List<StrigerParser.Elif_partContext> elifParts = ctx.elif_part();
            for (StrigerParser.Elif_partContext elifPart : elifParts) {
                condition = elifPart.boolexpr().getText();
                condValue = evaluateBooleanExpression(condition);
                if (condValue) {
                     return visitChildren(elifPart.computations());
                }
            }
        } else if (ctx.else_part() != null) {
            List<StrigerParser.Elif_partContext> elifParts = ctx.elif_part();
            for (StrigerParser.Elif_partContext elifPart : elifParts) {
                condition = elifPart.boolexpr().getText();
                condValue = evaluateBooleanExpression(condition);
                if (condValue) {
                    return visitChildren(elifPart.computations());
                }
            }
            return visitChildren(ctx.else_part().computations());
        }
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
        if (ctx.getChildCount()==3) {
            String value = "";
            if (ctx.expression() != null) {
                if (ctx.expression().boolexpr() != null) {
                    value = String.valueOf(evaluateBooleanExpression(ctx.expression().boolexpr().getText()));
                } else {
                    value = String.valueOf(evaluateArithmeticExpression(ctx.expression().arthexpr().getText()));
                }
            } else if (ctx.terinary() != null) {
                value = visitTerinary((StrigerParser.TerinaryContext) ctx.terinary()).toString();
            }
            if (store.get("Integer").containsKey(varName)) {
                store.get("Integer").put(varName, value);
            } else if (store.get("String").containsKey(varName)) {
                store.get("String").put(varName, value);
            } else if (store.get("Boolean").containsKey(varName)) {
                store.get("Boolean").put(varName, value);
            }
        } else if (ctx.getChildCount()==2) {
            int x = 0;
            if (ctx.getChild(1).getText().equals("++")) {
                x = Integer.parseInt(store.get("Integer").get(varName)) + 1;
            } else if (ctx.getChild(1).getText().equals("--")) {
                x = Integer.parseInt(store.get("Integer").get(varName)) - 1;
            } else if (ctx.getChild(0).getText().equals("--")) {
                x = 1 - Integer.parseInt(store.get("Integer").get(varName));
            } else {
                x = 1 + Integer.parseInt(store.get("Integer").get(varName));
            }
            store.get("Integer").put(ctx.Variable_name().getText(), String.valueOf(x));
        }
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitLoops(StrigerParser.LoopsContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitFor_loop(StrigerParser.For_loopContext ctx) {
        for(visit(ctx.initialization());(boolean) visit(ctx.boolexpr());visit(ctx.assignment())){
            visit(ctx.computations());
        }
        return 0;
    }

    @Override
    public Object visitFor_inrange(StrigerParser.For_inrangeContext ctx) {
        int start;
        int end;

        if (ctx.Int()!= null){
            start = Integer.parseInt(ctx.Int(0).getText());
            end = Integer.parseInt(ctx.Int(1).getText());
        } else {
            start = Integer.parseInt(store.get("Integer").get(ctx.Variable_name(1).getText()));
            end = Integer.parseInt(store.get("Integer").get(ctx.Variable_name(2).getText()));
        }
        String varName = ctx.Variable_name(0).getText();
        for (int i = start; i <= end; i++) {
            store.get("Integer").put(varName, Integer.toString(i));
            visit(ctx.computations());
        }

        return 0;
    }

    @Override
    public Object visitWhile_loop(StrigerParser.While_loopContext ctx) {
        String condition = ctx.getChild(1).getText();
        while (evaluateBooleanExpression(condition)) {
            super.visit(ctx.getChild(3));
        }
        return 0;
    }

    @Override
    public Object visitExpression(StrigerParser.ExpressionContext ctx) {
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitBoolexpr(StrigerParser.BoolexprContext ctx) {
        String x= ctx.getText();
        return evaluateBooleanExpression(x);
    }

    @Override
    public Object visitArthexpr(StrigerParser.ArthexprContext ctx) {
        String x = ctx.getText();
        return evaluateArithmeticExpression(x);
//        return super.visitChildren(ctx);
    }


    private boolean evaluateBooleanExpression(String expr) {
        if (expr.equals("true")) {
            return true;
        } else if (expr.equals("false")) {
            return false;
        }  else if (expr.matches("\\w+")) {
            String variable = expr;
            if (!store.get("Boolean").containsKey(variable)) {
                throw new IllegalArgumentException("Variable not found: " + variable);
            }
            return Boolean.parseBoolean(store.get("Boolean").get(variable));
        } else if (expr.startsWith("(") && expr.endsWith(")")) {
            return evaluateBooleanExpression(expr.substring(1, expr.length() - 1));
        } else if (expr.contains("and")) {
            String[] parts = expr.split("and",2);
            return evaluateBooleanExpression(parts[0]) && evaluateBooleanExpression(parts[1]);
        } else if (expr.contains("or")) {
            String[] parts = expr.split("or",2);
            return evaluateBooleanExpression(parts[0]) || evaluateBooleanExpression(parts[1]);
        } else if (expr.contains("<")) {
            String[] parts = expr.split("<",2);
            return evaluateArithmeticExpression(parts[0]) < evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("<=")) {
            String[] parts = expr.split("<=",2);
            return evaluateArithmeticExpression(parts[0]) <= evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains(">=")) {
            String[] parts = expr.split(">=",2);
            return evaluateArithmeticExpression(parts[0]) >= evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains(">")) {
            String[] parts = expr.split(">",2);
            return evaluateArithmeticExpression(parts[0]) > evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("!=")) {
            String[] parts = expr.split("!=",2);
            return evaluateArithmeticExpression(parts[0]) != evaluateArithmeticExpression(parts[1]);
        }
        return false;
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
            String[] parts = expr.split("\\+",2);
            return evaluateArithmeticExpression(parts[0]) + evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("-")) {
            String[] parts = expr.split("-",2);
            return evaluateArithmeticExpression(parts[0]) - evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*",2);
            return evaluateArithmeticExpression(parts[0]) * evaluateArithmeticExpression(parts[1]);
        } else if (expr.contains("/")) {
            String[] parts = expr.split("/",2);
            int divisor = evaluateArithmeticExpression(parts[1]);
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return evaluateArithmeticExpression(parts[0]) / divisor;
        }
        return 0;
    }
}