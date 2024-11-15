package com.clases;

public class VueloCarga extends Vuelo{
	protected double pesoCarga ;
	protected double tarifaKilogramo;
	
	public VueloCarga(String numeroVuelo, String origen, String destino, double duracionHoras,double pesoCarga,double tarifaKilogramo) {
		super(numeroVuelo, origen, destino,duracionHoras);
		this.pesoCarga = pesoCarga ;
		this.tarifaKilogramo = tarifaKilogramo;
	}
	
	@Override
	public double calcularPrecio(int precioBase){
		return precioBase + (tarifaKilogramo * pesoCarga);
	}
	
	@Override
	public void mostrarInformacionDeVuelo() {
		System.out.println("Número - Vuelo Carga: " + this.numeroVuelo + " ,Origen: " + this.origen + " ,Destino: " + this.destino + " ,Duración: " + this.duracionHoras +" horas, Tarifa por kilo:"+ this.tarifaKilogramo + " ,Peso de la carga: " + this.pesoCarga);
	}
}	
