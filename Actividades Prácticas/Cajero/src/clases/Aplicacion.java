package clases;

public class Aplicacion {
	public static void main(String[] args) {    
        System.out.println(Cajero.retirarDinero(5000));  
        System.out.println(Cajero.retirarDinero(9000));  

        System.out.println(Cajero.pagarFactura(1000, 800)); 
        System.out.println(Cajero.pagarFactura(1000, 1000));
        System.out.println(Cajero.pagarFactura(1000, 1200));

        System.out.println(Cajero.cambiarBilletes(2000, 50)); 
        System.out.println(Cajero.cambiarBilletes(2010, 50)); 

        System.out.println(Cajero.totalDeBilletesYMonedas(1999)); 
    }
	}
	

