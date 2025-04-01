package AST.Expression.initial;

import AST.Expression.Expression;

public class StringValue extends Initial {
    public String string;

    public StringValue(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringValue{" +
                "string='" + string + '\'' +
                '}';
    }

}
