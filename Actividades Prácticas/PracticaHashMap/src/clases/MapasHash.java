package clases;
import java.util.HashMap;

public class MapasHash {
   public static void main(String[] args) {
       HashMap<String, Integer> personas = new HashMap<String, Integer>();

       personas.put("Juan", 30);
       personas.put("María", 25);
       personas.put("Pedro", 35);

       int edadDeJuan = personas.get("Juan");
       System.out.println("La edad de Juan es: " + edadDeJuan);
   }
}