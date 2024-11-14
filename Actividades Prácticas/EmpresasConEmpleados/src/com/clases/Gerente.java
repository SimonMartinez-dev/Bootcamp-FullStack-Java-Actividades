package com.clases;

public class Gerente extends Empleado {
	protected double bono;

	public Gerente(String nombre, int id, int salarioBase, double bono) {
		super(nombre, id, salarioBase);
		this.bono = bono;
	}
	

	    @Override
	    public double calcularSalarioTotal() {
	        return super.calcularSalarioTotal() + bono;
	    }

	    @Override
	    public void mostrarInformacion() {
	    	 System.out.println("Nombre: " + this.nombre + " ,ID: " + this.id + " ,Salario Base: " + this.salarioBase + " ,Bono: " + this.bono + " ,Salario Total (con bono): " + calcularSalarioTotal());
	    }
	}
	   


