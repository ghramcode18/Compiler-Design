package AST.Statement.componentBody;

import AST.Expression.Expression;
import AST.Statement.Parameters;
import AST.Statement.Statement;

import java.util.List;

public class FunctionDeclaration extends Statement {
    public String identifier;
    public Parameters parameters;
    public List<Expression> expressions1;
    public FunctionReturn functionReturn;

    public FunctionDeclaration(String identifier, Parameters parameters, List<Expression> expressions1, FunctionReturn functionReturn) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.expressions1 = expressions1;
        this.functionReturn = functionReturn;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Expression exp1 : this.expressions1) {
            builder.append(exp1);
            builder.append("\n");
        }

        return "FunctionDeclaration{" +
                "\nidentifier='" + identifier + '\'' +
                ", parameters=" + parameters +
                ",\n expressions1=" + builder +
                ", functionReturn=" + functionReturn +
                '}';
    }
}
