package AST.Expression;

public class ExpressionIncDec extends Expression{
 public Expression expression;
 public String op;

    public ExpressionIncDec(Expression expression, String op) {
        this.expression = expression;
        this.op = op;
    }

    @Override
    public String toString() {
        return "ExpressionIncDec{" +
                "expression=" + expression +
                ", op='" + op + '\'' +
                '}';
    }
}
