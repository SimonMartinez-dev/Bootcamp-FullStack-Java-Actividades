package com.clases;


import com.interfaces.Validable;

public class Producto implements Validable {
	public int idProducto;
	public String nombreProducto;
	public int precio;
	
	public Producto(int idProducto, String nombreProducto, int precio) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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
	
	 	@Override
	    public boolean validarInformacion() {
	        return idProducto > 0 &&
	               nombreProducto != null && !nombreProducto.isEmpty() &&
	               precio > 0;
	 	}
	 	

	 	
	 	@Override
	 	public String toString() {
	 	    return "id Producto: " + idProducto + ", nombre: " + this.nombreProducto + ", precio: " + this.precio;
	 	}
}

