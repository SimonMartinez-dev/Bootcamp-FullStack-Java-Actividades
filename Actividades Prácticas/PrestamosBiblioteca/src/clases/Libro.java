package clases;

public class Libro {
	private String titulo; 
	private String autor;
	private double precioDeReemplazo;
	public Libro(String titulo, String autor, double precioDeReemplazo) {
		this.titulo = titulo;
		this.autor = autor;
		this.precioDeReemplazo = precioDeReemplazo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecioDeReemplazo() {
		return precioDeReemplazo;
	}
	public void setPrecioDeReemplazo(double precioDeReemplazo) {
		this.precioDeReemplazo = precioDeReemplazo;
	}
	@Override
	public String toString() {
		return "Titulo: " + getTitulo() + ", Autor: " + getAutor() +  ", Precio reemplazo: " + getPrecioDeReemplazo() ;
	}
	
	
}
