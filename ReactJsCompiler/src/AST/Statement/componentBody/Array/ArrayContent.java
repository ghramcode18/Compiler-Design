package AST.Statement.componentBody.Array;

import java.util.List;

public class ArrayContent {
    public  List<ArrayElement> arrayElements;

    public ArrayContent(List<ArrayElement> arrayElements) {
        this.arrayElements = arrayElements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (ArrayElement element : this.arrayElements) {
            builder.append(element);
            builder.append("\n");
        }
        return "ArrayContent{" +
                "arrayElements=" + builder +
                '}';
    }


}
