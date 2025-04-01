package AST.Statement.componentBody.Hooks;

import AST.Expression.initial.Initial;

public class UseStateDecl extends HooksDeclaration{
   public String identifier1;
   public String identifier2;
   public Initial initial;

    public UseStateDecl(String identifier1, String identifier2, Initial initial) {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
        this.initial = initial;
    }

    @Override
    public String toString() {
        return "UseStateDecl{" +
                "identifier1='" + identifier1 + '\'' +
                ", identifier2='" + identifier2 + '\'' +
                ", initial='" + initial + '\'' +
                '}';
    }
}
