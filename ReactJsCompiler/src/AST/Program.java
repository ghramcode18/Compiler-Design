package AST;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Node> nodes;

    public Program(List<Node> statements) {
        this.nodes = statements;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Node node : this.nodes){
            builder.append(node);
            builder.append("\n");
        }
        return builder.toString();
    }
}
