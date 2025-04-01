package AST.Expression;

public class ExpressionOper extends Expression{
    public Expression left;
    public Expression right;
    public String op;

    public ExpressionOper(Expression left, Expression right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    @Override
    public String toString() {
        return "ExpressionOper{" +
                "left=" + left +
                ", right=" + right +
                ", op='" + op + '\'' +
                '}';
    }
}
