package clases;
import clases.AdivinaNumero;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Aplicacion {
	 public static void main(String[] args) {
	        int numeroRandom = (int) (Math.random() * 100) + 1;
	        ArrayList<Integer> intentos = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);	        
	        System.out.println("Por favor ingresa un número entre 1 - 100 para adivinar.");

	        int numeroUsuario = 0;
	        
	        while (numeroUsuario != numeroRandom) {
	            System.out.print("Por favor ingresa el número: ");
	            String linea = scanner.nextLine();
	            try {
	            	int num = Integer.parseInt(linea);   
	            	numeroUsuario = num;
	                intentos.add(numeroUsuario); 
	             
	                String mensaje = AdivinaNumero.compararNumeros(numeroUsuario, numeroRandom);
	                System.out.println(mensaje);

	                if (mensaje.equals("¡Has conseguido adivinar el número!")) {
	                    
	                    System.out.println("Te tomó " + intentos.size() + " veces adivinar el número.");
	                    System.out.print("Intentos: ");
	                    for (int intento : intentos) {
	                        System.out.print(intento + " ");
	                    }
	                    System.out.println(); 
	                    break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Por favor ingresa un número válido entre 1 y 100.");
	            }
	        }
	    }

	    public static String compararNumeros(int userNumber, int randomNumber) {
	        if (userNumber < randomNumber) {
	            return "El número es mayor.";
	        } else if (userNumber > randomNumber) {
	            return "El número es menor.";
	        } else {
	            return "¡Has conseguido adivinar el número!";
	        }
	    }
	
	   }

