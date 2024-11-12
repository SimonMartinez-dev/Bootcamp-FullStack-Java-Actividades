package com.proyectotienda;

public class Aplicacion {
	 public static void main(String[] args) {
	       // VARIABLES DE LA TIENDA
	       // Mensajes de la aplicación
	       String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
	       String mensajeConfirmacion = ", tu pedido ha sido confirmado";
	       String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
	       String mensajeMostrarTotal = "El total de tu compra es: $";
	      
	       // Variables de productos (agrega las tuyas a continuación)
	       double precioLibro = 15.99;
	       double precioCamiseta = 25.50;
	       double precioPantalones = 12.25;
	       double precioZapatos = 30.20;
	  
	       // Variables de clientes (agrega las tuyas a continuación)
	       String cliente1 = "Ana";
	       String cliente2 = "Alex";
	       String cliente3 = "Miguel";
	  
	      
	       boolean pedidoConfirmadoCliente1 = true;
	       boolean pedidoConfirmadoCliente2 = true;
	       boolean pedidoConfirmadoCliente3 = true;
	  
	       // INTERACCIÓN DE LA APLICACIÓN
	       System.out.println(mensajeBienvenida + cliente1); 
	       System.out.println(mensajeBienvenida + cliente2);
	       System.out.println(mensajeBienvenida + cliente3);
	       
	       if (pedidoConfirmadoCliente1 == true) {
	    	   System.out.println("Ana " + mensajeConfirmacion);
	       }
	       else{
				System.out.println("Ana " + mensajeRechazo);
	       }
	       
	       if (pedidoConfirmadoCliente3 == true) {
	    	   System.out.println("Miguel " + mensajeConfirmacion + ", has pedido un libro y unos zapatos");
	       }
	       else{
				System.out.println("Miguel " + mensajeRechazo);
	       }
	       
	       if (pedidoConfirmadoCliente2 == true) {
	    	   System.out.println("Alex " + mensajeConfirmacion + " " + mensajeMostrarTotal + (precioZapatos*2)+precioPantalones+precioCamiseta );
	       }else {
	    	   System.out.println("Alex, " + mensajeRechazo);
		}
	       double compra1 = precioPantalones+precioCamiseta;
	       double compra2 = precioZapatos+precioLibro;
	       double total = compra1 - compra2;
	       System.out.println("Miguel, el total de tu compra anterior es de: $" + precioPantalones+precioCamiseta);
	       System.out.println("El total real es: $" + precioZapatos+precioLibro);
	       System.out.println("La diferencia entre ambas compras es igual a: $" + total);
		}
		}


