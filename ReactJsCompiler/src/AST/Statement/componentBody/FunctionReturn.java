package AST.Statement.componentBody;

import AST.Expression.Expression;
import AST.Statement.Statement;

import java.util.List;

public class FunctionReturn extends Statement {
    List<Expression> expressions;

    public FunctionReturn(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public FunctionReturn() {

    }

    @Override
    public String toString() {
        return "FunctionReturn{" +
                "\nexpressions=" + expressions +
                '}';
    }
}
