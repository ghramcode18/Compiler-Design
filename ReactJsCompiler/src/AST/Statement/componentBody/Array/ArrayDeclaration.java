package AST.Statement.componentBody.Array;

import AST.Statement.Statement;

import java.util.List;

public class ArrayDeclaration extends Statement {
    public String type;

    public String identifier;
    public List<ArrayContent> arrayContents;

    public ArrayDeclaration(String type, String identifier, List<ArrayContent> arrayContents) {
        this.type = type;
        this.identifier = identifier;
        this.arrayContents = arrayContents;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (ArrayContent array : this.arrayContents) {
            builder.append(array);
            builder.append("\n");
        }
        return "ArrayDeclaration{" +
                "type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                ", arrayContents=" + builder +
                '}';
    }
}
