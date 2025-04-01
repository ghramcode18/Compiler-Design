package AST.Expression.initial;

import AST.Expression.Expression;

public class IntValue extends Initial {
    public int Int;

    public IntValue(int anInt) {
        Int = anInt;
    }

    @Override
    public String toString() {
        return "IntValue{" +
                "Int=" + Int +
                '}';
    }
}
