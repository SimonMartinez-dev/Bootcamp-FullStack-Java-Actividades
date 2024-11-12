package clases;

public class Aplicacion {
	 public static void main(String[] args) {
	        System.out.println("El número 4 es par? " + Algoritmos.esPar(4)); 
	        System.out.println("El número 7 es par? " + Algoritmos.esPar(7));

	        System.out.println("7 es un número primo? " + Algoritmos.esPrimo(7)); 
	        System.out.println("10 es un número primo? " + Algoritmos.esPrimo(10)); 
	        
	        System.out.println("'Hola' en reversa: " + Algoritmos.stringEnReversa("Hola")); 
	        System.out.println("'Mundo' en reversa: " + Algoritmos.stringEnReversa("Mundo")); 

	        System.out.println("'ana' es un palíndromo? " + Algoritmos.esPalindromo("ana"));
	        System.out.println("'java' es un palíndromo? " + Algoritmos.esPalindromo("java"));

	        System.out.print("Secuencia FizzBuzz hasta 15: ");
	        Algoritmos.secuenciaFizzBuzz(15);
	    }
}
