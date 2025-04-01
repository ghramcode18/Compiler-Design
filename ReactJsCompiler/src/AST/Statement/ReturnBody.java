package AST.Statement;

public class ReturnBody {
   public String jsxElement;

    public ReturnBody() {

    }
    public ReturnBody(String jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "ReturnBody{" +
                "jsxElement"  +
                '}';
    }
}
