package clases;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Garaje {
	private ArrayList<Vehiculo> vehiculos;
	private int capacidad;
	
	public Garaje(int capacidad) {		
		this.vehiculos =  new ArrayList<>();
		this.capacidad = capacidad;
	}
	public void agregarVehiculo(Vehiculo vehiculo) {
		 if (vehiculos.size() < capacidad) {
	            vehiculos.add(vehiculo);
	            System.out.println("Vehículo agregado: " + vehiculo.despliegaInformacion());
	        } else {
	            System.out.println("No hay espacio disponible en el garaje.");
	        }
	}
	public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("El garaje está vacío.");
        } else {
            System.out.println("Vehículos en el garaje:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo.despliegaInformacion());
            }
        }
	}
}
