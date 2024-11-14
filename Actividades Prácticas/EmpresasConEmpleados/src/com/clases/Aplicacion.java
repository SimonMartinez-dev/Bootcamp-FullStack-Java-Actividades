package com.clases;

public class Aplicacion {
	public static void main(String[] args) {

        Empleado empleado = new Empleado("Juan Pérez", 1, 25);
        Gerente gerente = new Gerente("Ana García", 2, 25, 5000);
        Director director = new Director("Carlos López", 3, 25, 5000, 20000);

        empleado.mostrarInformacion();
        System.out.println("--------------------");
        gerente.mostrarInformacion();
        System.out.println("--------------------");
        director.mostrarInformacion();
    }
}
