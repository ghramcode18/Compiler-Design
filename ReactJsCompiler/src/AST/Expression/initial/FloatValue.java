package AST.Expression.initial;

import AST.Expression.Expression;

public class FloatValue extends Initial {
    public float Float;

    public FloatValue(float aFloat) {
        Float = aFloat;
    }

    @Override
    public String toString() {
        return "FloatValue{" +
                "Float=" + Float +
                '}';
    }
}
