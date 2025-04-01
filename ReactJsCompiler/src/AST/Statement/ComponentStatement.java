package AST.Statement;

import java.util.List;

public class ComponentStatement extends Statement{
   public String identifier;
   public Parameters parameters;
   public List<Statement> ComponentBody;
   public ReturnBody returnBody;

   public ComponentStatement(String identifier, Parameters parameters, List<Statement> componentBody, ReturnBody returnBody) {
      this.identifier = identifier;
      this.parameters = parameters;
      ComponentBody = componentBody;
      this.returnBody = returnBody;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      for (Statement component : this.ComponentBody) {
         builder.append(component);
         builder.append("\n");
      }
      return "ComponentStatement{" +
              "\nidentifier='" + identifier + '\'' +
              ", parameters=" + parameters +
              ",\n ComponentBody=" + builder +
              ", returnBody=" + returnBody +
              '}';
   }
}
