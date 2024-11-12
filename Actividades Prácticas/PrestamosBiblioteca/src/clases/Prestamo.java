package clases;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Iterator;

public class Prestamo {
	private String nombreUsuario;
	private ArrayList<Libro> libros;
	private boolean estatus;
	
	public Prestamo() {
		this.nombreUsuario = "invitado";
		this.libros = new ArrayList<Libro>();
		this.estatus = true;
	}

	public Prestamo(String nombreUsuario, boolean estatus) {
		this.nombreUsuario = nombreUsuario;
		this.libros = new ArrayList<Libro>();
		this.estatus = estatus;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	public void mostrarEstatus() {
		if(estatus) {
			System.out.println("El prestamo está activo");
		}else {
			System.out.println("El prestamo está inactivo");
		}
	}
	public String mostrarDetalle() {
		return "Nombre persona: " + getNombreUsuario() + " ,Estatus: " + getEstatus() + " ,Libros: " + getLibros();
	}
	public double calcularTotalDeReemplazo() {
		double total = 0;
		for (int i = 0; i < libros.size(); i++) {
			total += libros.get(i).getPrecioDeReemplazo();		
		}
		return total;
	}
}
