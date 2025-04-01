package AST.Statement.imports;

import AST.Node;

import java.util.List;

public class Import extends Node {
    public List<ImportStatement> importStatements;

    public Import(List<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ImportStatement Imports : this.importStatements) {
            builder.append(Imports);
            builder.append("\n");
        }
        return "\nImport{" +
                "\nimportStatements=" + builder +
                '}';
    }
}
