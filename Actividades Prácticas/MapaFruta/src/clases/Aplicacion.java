package clases;
import java.util.HashMap;
public class Aplicacion {
	 public static void main(String[] args) {
	        HashMap<String, Integer> frutas = new HashMap<>();
	        frutas.put("Manzana", 10);
	        frutas.put("Plátano", 5);
	        frutas.put("Naranja", 8);
	        frutas.put("Pera", 3);
	        frutas.put("Sandía", 2);

	        System.out.println("Cantidad de Manzanas: " + frutas.get("Manzana"));
	        System.out.println("Listado de frutas:");
	        for (String fruta : frutas.keySet()) {
	            System.out.println(fruta + ": " + frutas.get(fruta));
	        }
	 }
}
