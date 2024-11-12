package clases;

public class AdivinaNumero {
	   public static String compararNumeros(int numeroUsuario, int numeroRandom) {
	        if (numeroUsuario == numeroRandom) {
	            return "¡Has conseguido adivinar el número!";
	        } else if (numeroUsuario < numeroRandom) {
	            return "Intenta con un número más grande.";
	        } else {
	            return "Intenta con un número más pequeño.";
	        }
	    }
}
