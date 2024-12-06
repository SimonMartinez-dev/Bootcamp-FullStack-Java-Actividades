package com.simon.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerRecetas {
    private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<>();

   
    public ControllerRecetas() {
	String [] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
	recetasConIngredientes.put("Pizza", pizza);
	String [] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
	recetasConIngredientes.put("Espagueti", espagueti);
	String [] lasaña = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
	recetasConIngredientes.put("Lasaña", lasaña);


    }


	@GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model model) {
        model.addAttribute("listaRecetas", listaRecetas);
        return "recetas.jsp";
    }

	@GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable ("nombre") String nombre, Model model) {
    	String[] ingredientes = recetasConIngredientes.get(nombre);
        if(recetasConIngredientes.containsKey(nombre)) {
            model.addAttribute("nombre", nombre);
            model.addAttribute("ingredientes", ingredientes);
        } else {
            model.addAttribute("error", "La receta no está en la lista.");
        }
        return "detallesReceta.jsp";
    }
}

