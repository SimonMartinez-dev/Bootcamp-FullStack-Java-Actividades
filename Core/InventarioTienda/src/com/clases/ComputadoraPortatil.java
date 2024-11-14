package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	private String marca;
	private String memoriaRam;
	private int numeroSerie;
	

	public ComputadoraPortatil(String nombreProducto, int precio, int cantidadDisponible, String marca, String memoriaRam, int numeroSerie) {
		super(nombreProducto, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRam = memoriaRam;
		this.numeroSerie = numeroSerie;
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre del producto: " + this.nombreProducto + " ,precio: " + this.precio + " ,marca: " + this.marca + " ,memoria: " + this.memoriaRam + " ,número de serie" + this.numeroSerie);
	}
	@Override
	public String toString() {
		return "Nombre: " + this.getNombreProducto() + " ,Precio: " + this.precio + " ,Cantidad: " + this.cantidadDisponible + " ,Marca:" + this.marca + ", memoriaRam=" + this.memoriaRam + ", numeroSerie=" + this.numeroSerie;
		}
}
