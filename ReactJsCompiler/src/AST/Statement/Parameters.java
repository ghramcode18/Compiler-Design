package AST.Statement;

import java.util.ArrayList;
import java.util.List;

public class Parameters {
    public List<String> identifier = new ArrayList<>();

    public Parameters() {
    }

    public Parameters(List<String> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (identifier!=null) {
            for (String pram : this.identifier) {
                builder.append(pram);
                builder.append(",\n");
            }
        }
        return "Parameters{" +
                "params=" + builder +
                '}';
    }


}
