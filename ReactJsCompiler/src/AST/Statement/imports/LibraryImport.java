package AST.Statement.imports;

public class LibraryImport extends ImportStatement {
    public String identifier;
    public String stringLiteral;

    public LibraryImport(String identifier, String stringLiteral) {
        this.identifier = identifier;
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "\nLibraryImport{" +
                "identifier='" + identifier + '\'' +
                ", stringLiteral='" + stringLiteral + '\'' +
                '}';
    }
}
