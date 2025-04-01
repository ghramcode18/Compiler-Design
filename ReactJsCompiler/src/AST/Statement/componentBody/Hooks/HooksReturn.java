package AST.Statement.componentBody.Hooks;

import AST.Expression.Expression;
import AST.Statement.Statement;

import java.util.List;

public class HooksReturn extends HooksDeclaration {
    List<Expression> expressions;

    public HooksReturn(List<Expression> expressions) {

        this.expressions = expressions;
    }

    public HooksReturn() {

    }

    @Override
    public String toString() {
        return "HooksReturn{" +
                "expressions=" + expressions +
                '}';
    }
}
