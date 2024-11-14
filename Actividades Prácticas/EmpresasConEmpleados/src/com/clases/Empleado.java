package com.clases;

public class Empleado {
	protected String nombre;
	protected int id;
	protected double salarioBase;
	
	public Empleado(String nombre, int id, double salarioBase) {
		this.nombre = nombre;
		this.id = id;
		this.salarioBase = salarioBase;
	} 
	 
	public double calcularSalarioTotal() {
	        return salarioBase * 160; 
	    }

	    public void mostrarInformacion() {
	    	System.out.println("Nombre: " + this.nombre + " ,ID: " + this.id + " ,Salario Base: " + salarioBase + " ,Salario total: " + calcularSalarioTotal());
	    }
}
