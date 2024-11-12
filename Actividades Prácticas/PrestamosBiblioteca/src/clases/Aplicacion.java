package clases;
import clases.Libro;
import clases.Prestamo;
public class Aplicacion {
	public static void main(String[] args) {
		Libro libro1 = new Libro("Ella y yo", "Romeo Santos", 22.25);
		Libro libro2 = new Libro("El farsante", "Ozuna", 10.15);
		
		Prestamo prestamo1 = new Prestamo();
		Prestamo prestamo2 = new Prestamo();
		Prestamo prestamo3 = new Prestamo("Simon", true);
		Prestamo prestamo4 = new Prestamo("Isidora", false);
		Prestamo prestamo5 = new Prestamo("Margot", true);
		
		prestamo1.agregarLibro(libro1);
		prestamo1.agregarLibro(libro2);
		prestamo2.agregarLibro(libro1);
		prestamo2.agregarLibro(libro2);
		prestamo3.agregarLibro(libro1);
		prestamo3.agregarLibro(libro2);
		prestamo4.agregarLibro(libro1);
		prestamo4.agregarLibro(libro2);
		prestamo5.agregarLibro(libro1);
		prestamo5.agregarLibro(libro2);
		
		System.out.println(prestamo1.mostrarDetalle());
		System.out.println(prestamo2.mostrarDetalle());
		System.out.println(prestamo3.mostrarDetalle());
		System.out.println(prestamo4.mostrarDetalle());
		System.out.println(prestamo5.mostrarDetalle());

		prestamo3.mostrarEstatus();
		prestamo4.mostrarEstatus();
		prestamo5.mostrarEstatus();
		
		System.out.println("Precio reemplazo prestamo 2: $" + prestamo2.calcularTotalDeReemplazo());
	}
}
