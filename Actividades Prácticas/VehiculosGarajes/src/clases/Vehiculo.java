package clases;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	
	public Vehiculo(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	 public String despliegaInformacion() {
	        return "Vehículo: Marca = " + marca + ", Modelo = " + modelo + ", Año = " + año;
	    }
	
	
}
