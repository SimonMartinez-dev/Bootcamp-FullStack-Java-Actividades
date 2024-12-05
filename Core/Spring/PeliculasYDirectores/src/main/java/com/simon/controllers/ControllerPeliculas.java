package com.simon.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPeliculas {
    private static HashMap<String, String> listaPeliculas = new HashMap<String, String>();

    public ControllerPeliculas() {
        listaPeliculas.put("Winnie the Pooh", "Don Hall");	
        listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
        listaPeliculas.put("Tarzán", "Kevin Lima");		
        listaPeliculas.put("Mulán", "Barry Cook");
        listaPeliculas.put("Oliver", "Kevin Lima");	
        listaPeliculas.put("Big Hero 6", "Don Hall");	
    }

    @GetMapping("/peliculas")
    public String obtenerPeliculas() {
        String resultado = "Lista de películas:\n";
        for (Map.Entry<String, String> pelicula : listaPeliculas.entrySet()) {
            resultado += "Película: " + pelicula.getKey() + " - Director: " + pelicula.getValue() + "<br>";
        }
        return resultado.toString();
    }
    @GetMapping("/peliculas/{nombre}")
    public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
        if (listaPeliculas.containsKey(nombre)) {
            String director = listaPeliculas.get(nombre);
            return "Película: " + nombre + " - Director: " + director;
        } else {
            return "La película " + nombre + " no se encontró.";
        }
    
    }
    @GetMapping("/peliculas/director/{nombre}")
    public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
    String peliculasDirector = "Películas de " + nombre + ": ";
    boolean encontrado = false;
    for (Map.Entry<String, String> pelicula : listaPeliculas.entrySet()) {
        if (pelicula.getValue().equalsIgnoreCase(nombre)) {
            peliculasDirector += (pelicula.getKey())+"-";
            encontrado = true;
        }
    }
    if (!encontrado) {
        return "No existe esa película, ingrese de nuevo un nombre.";
    }
    return peliculasDirector.toString();
    }
}
