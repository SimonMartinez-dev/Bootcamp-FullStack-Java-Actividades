package com.simon.controllers;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerLibros {
	
	private static HashMap<String, String> listaLibros = new HashMap<String, String>();
	
	public ControladorLibros() {
		listaLibros.put("Odisea", "Homero");	
		listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
		listaLibros.put("El Código Da Vinci", "Dan Brown");		
		listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
		listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
		listaLibros.put("El alquimista", "Paulo Coelho");	

	}
	
@GetMapping("/libros")
public String obtenerLibros(Model modelo){
	modelo.addAtributte("libros",listaLibros);
	return "libros.jsp";
}

@GetMapping("/libros/{nombre}")
public String obtenerLibroPorNombre(Model modelo, @PathVariable(value="nombre") String nombre{
	if (listaLibros.containsKey(nombre)) {
            model.addAttribute("nombre", nombre);
            model.addAttribute("autor", listaLibros.get(nombre));
        } else {
            model.addAttribute("mensaje", "El libro no está en la lista.");
        }
        return "detalleLibro.jsp";
    }

 @GetMapping("/libros/formulario")
    public String formularioLibro() {
        return "formularioLibros.jsp";
    }

     @PostMapping("/libros/procesa")
    public String procesaLibro(@RequestParam("nombreLibro") String nombreLibro, 
                               @RequestParam("nombreAutor") String nombreAutor) {
        listaLibros.put(nombreLibro, nombreAutor);
        return "redirect:/libros.jsp";
    }
}