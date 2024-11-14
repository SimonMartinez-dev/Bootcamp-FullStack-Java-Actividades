package com.clases;


import java.util.ArrayList;


public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos;
	
	public TiendaElectronica() {
		listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	public void mostrarProductos() {
		if (listaDeProductos.isEmpty()) {
			System.out.println("No existen productos");
		}else {
			System.out.println("Lista de productos disponibles: ");
			for (ProductoElectrodomestico producto : listaDeProductos) {
				System.out.println(producto);				
			}
		}
		
	}
	public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombreProducto().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        System.out.println("Producto no encontrado.");
        return null;
    }
	public void realizarVenta(String nombreProducto, int cantidadVenta) {
	    for (ProductoElectrodomestico producto : listaDeProductos) {
	        if (producto.getNombreProducto().equalsIgnoreCase(nombreProducto)) {
	            if (producto.getCantidadDisponible() >= cantidadVenta) {
	                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidadVenta);
	                System.out.println("Venta realizada, quedan " + producto.getCantidadDisponible() + " unidades disponibles.");
	            } else {
	                System.out.println("No hay cantidad suficiente.");
	            }
	            return;
	        }
	    System.out.println("Producto no encontrado.");	
	    }
	}

	
	
}
