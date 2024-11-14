package com.clases;

public class ProductoElectrodomestico {
	public String nombreProducto;
	public int precio;
	public int cantidadDisponible = 0;
	
	public ProductoElectrodomestico(String nombreProducto, int precio, int cantidadDisponible) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre del producto" + this.nombreProducto + " ,precio: " + this.precio + ",cantidad disponible" + this.cantidadDisponible);
	}
	
}
