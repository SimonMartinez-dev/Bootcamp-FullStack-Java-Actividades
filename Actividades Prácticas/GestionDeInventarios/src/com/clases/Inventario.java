package com.clases;

import java.util.ArrayList;

import com.interfaces.Auditable;
import com.interfaces.Validable;

public class Inventario implements Validable, Auditable{
	private ArrayList<Producto> productos;

	public Inventario() {
		this.productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
		registrarAccion("Producto agregado: " + producto.getNombreProducto());
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
		registrarAccion("Producto eliminado: " + producto.getNombreProducto());
	}
	
	 public Producto buscarProducto(int idProducto) {
	        for (Producto producto : productos) {
	            if (producto.getIdProducto() == idProducto) {
	                return producto;
	            }
	        }
	      return null;
	    }
	 
	 	@Override
	    public void registrarAccion(String accion) {
	        System.out.println("Inventario - Acción registrada: " + accion);
	    }

	    @Override
	    public boolean validarInformacion() {
	        for (Producto producto : productos) {
	            if (!producto.validarInformacion()) {
	                System.out.println("Producto inválido: " + producto);
	                return false;
	            }
	        }
	        System.out.println("Todos los productos son válidos");
	        return true;
	    }
	    
	    public void mostrarProductos() {
	        if (productos.isEmpty()) {
	            System.out.println("El inventario está vacío");
	        } else {
	            System.out.println("Listado de productos en el inventario:");
	            for (Producto producto : productos) {
	                System.out.println(producto);
	            }
	        }
	    }
}
