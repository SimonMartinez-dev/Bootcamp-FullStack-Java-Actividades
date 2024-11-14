package com.clases;
import com.clases.TiendaElectronica;
public class Aplicacion {
	public static void main(String[] args) {
		TiendaElectronica tienda = new TiendaElectronica();
		Televisor televisor = new Televisor("Televisor", 2000, 2, "500x500", "1920x800");
		ComputadoraPortatil computadora = new ComputadoraPortatil("Computadora", 1000, 2, "Lenovo", "4GB", 12345);
		
		tienda.agregarProducto(computadora);
		tienda.agregarProducto(televisor);
		
		System.out.println("Cantidad de televisores: " + televisor.getCantidadDisponible());
		System.out.println("Cantidad de computadoras: " + computadora.getCantidadDisponible());
		
		tienda.realizarVenta("Computadora", 2);		
		tienda.realizarVenta("Computadora", 1);
		
		tienda.mostrarProductos();

	}
}
