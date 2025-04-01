package AST.Statement.imports;

import java.util.List;

public class HooksImport extends ImportStatement {
    public List<String> singleHooksImport;
    public String stringLiteral;

    public HooksImport(List<String> singleHooksImport, String stringLiteral) {
        this.singleHooksImport = singleHooksImport;
        this.stringLiteral = stringLiteral;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String hooks : this.singleHooksImport) {
            builder.append(hooks);
            builder.append("\n");
        }
        return "HooksImport{" +
                "singleHooksImport=" +  builder  +
                ", stringLiteral='" + stringLiteral + '\'' +
                '}';
    }
}
