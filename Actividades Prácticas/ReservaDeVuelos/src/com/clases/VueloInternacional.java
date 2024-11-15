package com.clases;

public class VueloInternacional extends Vuelo {
	protected double impuestoInternacional;
	
	public VueloInternacional(String numeroVuelo, String origen, String destino, double duracionHoras, double impuestoInternacional) {
		super(numeroVuelo, origen, destino,duracionHoras);
		this.impuestoInternacional = impuestoInternacional;
	}
	
	@Override
	public double calcularPrecio(int precioBase){
        return precioBase - (precioBase * (impuestoInternacional / 100));
	}
	@Override
	public void mostrarInformacionDeVuelo() {
		System.out.println("Número - Vuelo Internacional: " + this.numeroVuelo + " ,Origen: " + this.origen + " ,Destino: " + this.destino + " ,Duración: " + this.duracionHoras +" horas, Impuesto: " + this.impuestoInternacional +"%");
	}
}
