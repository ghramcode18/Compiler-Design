package AST.Statement.componentBody.Array;

public class ArrayElement {
    public String identifier;
    public String stringLiteral;


    public ArrayElement(String identifier, String stringLiteral) {
        this.identifier = identifier;
        this.stringLiteral = stringLiteral;
    }
    @Override
    public String toString() {

        return "ArrayElement{" +
                "identifier='" + identifier + '\'' +
                ", stringLiteral='" + stringLiteral + '\'' +
                '}';
    }


}
