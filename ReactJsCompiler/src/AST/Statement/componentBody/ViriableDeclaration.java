package AST.Statement.componentBody;

import AST.Expression.Expression;
import AST.Statement.Statement;
import AST.Statement.componentBody.Array.ArrayContent;

import java.util.List;

public  class ViriableDeclaration extends Statement {
 public String type;

 public String identifier;

 public Expression expression;
    public ViriableDeclaration(String type, String identifier, Expression expression) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "NormalVar{" +
                "type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }
}
