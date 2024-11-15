package com.clases;
public class Aplicacion {
 public static void main(String[] args) {
	 
	Inventario inventario = new Inventario();
	Producto producto1 = new Producto(1, "Telefono", 1200);
	Producto producto2 = new Producto(2, "Tablet", 1500);
	Producto producto3 = new Producto(3, "Computador", 2000);
	
	inventario.agregarProducto(producto1);
	inventario.agregarProducto(producto2);
	inventario.agregarProducto(producto3);
	
	inventario.mostrarProductos();
	
	inventario.eliminarProducto(producto1);
	inventario.mostrarProductos();

	System.out.println("Producto por Id: " + inventario.buscarProducto(2));
	
	inventario.mostrarProductos();
}
}
