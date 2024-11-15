package com.clases;

public class Aplicacion {
	public static void main(String[] args) {
	VueloDomestico vueloDomestico = new VueloDomestico("001", "Ciudad A", "Ciudad B", 2, 15);
	 VueloInternacional vueloInternacional = new VueloInternacional("002", "Ciudad X", "Ciudad Y", 5.5, 20);
	 VueloCarga vueloCarga = new VueloCarga("003", "Ciudad M", "Ciudad N", 3.0, 10, 20);
	 
	 vueloDomestico.mostrarInformacionDeVuelo();
	 System.out.println("Precio  Vuelo Doméstico: $" + vueloDomestico.calcularPrecio(100));
     System.out.println("----------------------------");
	 vueloInternacional.mostrarInformacionDeVuelo();
     System.out.println("Precio Vuelo Internacional: $" + vueloInternacional.calcularPrecio(200));
     System.out.println("----------------------------");
     vueloCarga.mostrarInformacionDeVuelo();
     System.out.println("Precio Vuelo de Carga: $" + vueloCarga.calcularPrecio(300));
    
	}
}
