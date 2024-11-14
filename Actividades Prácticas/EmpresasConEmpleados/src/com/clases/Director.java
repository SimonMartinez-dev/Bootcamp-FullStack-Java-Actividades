package com.clases;

public class Director extends Gerente{
	private int acciones;

	public Director(String nombre, int id, int salarioBase, double bono, int acciones) {
		super(nombre, id, salarioBase, bono);
		this.acciones = acciones;
	}
	  @Override
	    public double calcularSalarioTotal() {
	        return super.calcularSalarioTotal() + acciones;
	    }
	    @Override
	    public void mostrarInformacion() {
	    	 System.out.println("Nombre: " + this.nombre + " ,ID: " + this.id + " ,Salario Base: " + this.salarioBase + " ,Bono: " + this.bono + " ,Acciones: " + this.acciones + " ,Salario Total (con acciones): " + calcularSalarioTotal() );
 	 
	    }
	}

