package clases;
import java.time.LocalDate;
public class Cajero {
	 public static String retirarDinero(double cantidad) {
	        if (cantidad > 8000) {
	            return "Estás tratando de retirar mucho dinero, el límite es $8000";
	        } else {
	            return "Retiraste exitosamente la cantidad de $" + cantidad;
	        }
	    }
	 
	    public static String pagarFactura(double totalFactura, double cantidadPagada) {
	        LocalDate fechaActual = LocalDate.now();
	        if (cantidadPagada < totalFactura) {
	            double restante = totalFactura - cantidadPagada;
	            return "El día de hoy" + fechaActual + " pagaste $" + cantidadPagada + ", aún te hacen falta $" + restante;
	        } else if (cantidadPagada == totalFactura) {
	            return "Gracias por tu pago completo el día de " + fechaActual;
	        } else {
	            double cambio = cantidadPagada - totalFactura;
	            return "Gracias por tu pago el día de hoy" + fechaActual + ", tu cambio es de $" + cambio;
	        }
	    }
	    
	    public static boolean cambiarBilletes(int total, int denominacion) {
	        return total % denominacion == 0;
	    }
	    
	    public static String totalDeBilletesYMonedas(int cantidad) {
	    	int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
	    	String resultado = "";
	    	for (int denominacion : denominaciones) {
	    	    int cantidadBilletesOMonedas = cantidad / denominacion;
	    	    if (cantidadBilletesOMonedas > 0) {
	    	        resultado += cantidadBilletesOMonedas + (denominacion >= 20 ? " billetes" : " monedas") +" de " + denominacion + ", ";
	    	        cantidad %= denominacion;
	    	    }
	    	}
	    	resultado = resultado.isEmpty() ? resultado : resultado.substring(0, resultado.length() - 2);
	    	return resultado;
	    }
}
