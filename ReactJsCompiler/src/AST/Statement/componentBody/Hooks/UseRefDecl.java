package AST.Statement.componentBody.Hooks;

public class UseRefDecl extends HooksDeclaration{

    public String identifier;

    public UseRefDecl(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "UseRefDecl{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
