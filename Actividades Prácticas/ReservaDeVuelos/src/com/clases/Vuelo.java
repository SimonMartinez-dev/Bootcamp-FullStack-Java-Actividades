package com.clases;

public abstract class Vuelo {
	protected String numeroVuelo;
	protected String origen;
	protected String destino; 
	protected double duracionHoras;
	
	
	public Vuelo(String numeroVuelo, String origen, String destino, double duracionHoras) {
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.duracionHoras = duracionHoras;
	}
	  
	abstract double calcularPrecio(int precioBase);
	abstract void mostrarInformacionDeVuelo();
}
