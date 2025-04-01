package AST.Statement.componentBody.Hooks;

import AST.Expression.Expression;

import java.util.List;

public class UseEffectDecl extends HooksDeclaration{
    public Expression expressions;
    public HooksReturn hooksReturn;

    public String identifier;

    public UseEffectDecl(Expression expressions, HooksReturn hooksReturn, String identifier) {
        this.expressions = expressions;
        this.hooksReturn = hooksReturn;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "UseEffectDecl{" +
                "expressions=" + expressions +
                ", hooksReturn=" + hooksReturn +
                ", identifier='" + identifier + '\'' +
                '}';
    }
}
