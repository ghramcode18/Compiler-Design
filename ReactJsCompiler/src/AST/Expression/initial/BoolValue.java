package AST.Expression.initial;


import AST.Expression.Expression;

public class BoolValue extends Initial {
    public boolean bool;

    public BoolValue(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "BoolValue{" +
                "bool=" + bool +
                '}';
    }
}
