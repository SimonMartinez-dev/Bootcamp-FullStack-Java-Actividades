package com.clases;

public class Televisor extends ProductoElectrodomestico {
	private String  tamañoPantalla;
	private String resolucion;
	
	public Televisor(String nombreProducto, int precio, int cantidadDisponible, String tamañoPantalla, String resolucion) {
		super(nombreProducto, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre del producto" + this.nombreProducto + " ,precio: " + this.precio + " ,cantidad disponible: " + this.cantidadDisponible + " ,tamaño de la pantalla: " + this.tamañoPantalla + " ,resolucion: " + this.resolucion);
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombreProducto() + " ,Precio: " + this.precio + " ,Cantidad: " + this.cantidadDisponible + " ,tamaño de la pantalla: " + this.tamañoPantalla + " ,resolucion: " + this.resolucion;
	}
	
}
