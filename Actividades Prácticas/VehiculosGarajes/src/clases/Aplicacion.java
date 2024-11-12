package clases;

public class Aplicacion {
	public static void main(String[] args) {
		Garaje garaje = new Garaje(3);
//		
		Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2010);
		Vehiculo vehiculo2 = new Vehiculo("Toyota", "Yaris", 2010);
		Vehiculo vehiculo3 = new Vehiculo("Ford", "Mustang", 2020);
		Vehiculo vehiculo4 = new Vehiculo("Ford", "4x4", 2022);
//		
		garaje.agregarVehiculo(vehiculo1);
		garaje.agregarVehiculo(vehiculo2);
		garaje.agregarVehiculo(vehiculo3);
		garaje.agregarVehiculo(vehiculo4);
		
		garaje.mostrarVehiculos();
	}
}
