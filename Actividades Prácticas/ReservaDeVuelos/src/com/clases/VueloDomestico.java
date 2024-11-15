package com.clases;

public class VueloDomestico extends Vuelo{
	protected int descuento;

	public VueloDomestico(String numeroVuelo, String origen, String destino, double duracionHoras,int descuento) {
		super(numeroVuelo, origen, destino,duracionHoras);
		this.descuento = descuento;
	}
	@Override
	public double calcularPrecio(int  precioBase){
		
        return precioBase * descuento / 100;
	}
	@Override
	public void mostrarInformacionDeVuelo() {
		System.out.println("Número - Vuelo Doméstico: " + this.numeroVuelo + " ,Origen: " + this.origen + " ,Destino: " + this.destino + " ,Duración: " + this.duracionHoras +" horas, Descuento: " + this.descuento + "%");
	}
}
