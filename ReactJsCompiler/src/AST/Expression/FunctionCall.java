package AST.Expression;

public class FunctionCall extends Expression{
    public String identifier;
    public Expression expression;
    public FunctionCall(String identifier, Expression expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }
}
