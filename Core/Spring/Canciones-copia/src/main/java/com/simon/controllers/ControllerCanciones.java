package com.simon.controllers;

import com.simon.models.Cancion;
import com.simon.services.ServiceArtistas;
import com.simon.services.ServiceCanciones;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerCanciones {

	@Autowired
    private ServiceArtistas serviceArtistas;

   	@Autowired
	private ServiceCanciones serviceCanciones;

	@GetMapping("/canciones")
	public String mostrarCanciones(Model model) {
        	model.addAttribute("canciones", serviceCanciones.obtenerCanciones());
        	return "canciones.jsp";
    	}

	@GetMapping("canciones/detalle/{idCancion}")
    	public String detalleCancion(@PathVariable Long idCancion, Model model) {
        	Cancion cancion = serviceCanciones.obtenerCancionPorId(idCancion);
        	model.addAttribute("cancion", cancion);
        	return "detalleCancion.jsp";
    	}

	@GetMapping("/canciones/formulario/agregar")
	public String formularioAgregarCancion(@ModelAttribute Cancion cancion, Model modelo) {
		modelo.addAttribute("cancion", new Cancion());
		modelo.addAttribute("listaArtistas", serviceArtistas.obtenerArtistas());
		return "agregarCancion.jsp";
		
	}

	@PostMapping("/canciones/procesa/agregar")
    	public String procesarAgregarCancion(@Validated @ModelAttribute Cancion cancion, BindingResult 	bindingResult) {
        if (bindingResult.hasErrors()) {
            return "agregarCancion.jsp";
        }
        serviceCanciones.agregarCancion(cancion);
        return "redirect:/canciones.jsp";
	}

	@GetMapping("/canciones/formulario/editar/{id}")
	public String formularioEditarCancion(@PathVariable("id") Long id, @ModelAttribute("cancion") Cancion cancion, Model modelo) {
		cancion = serviceCanciones.obtenerCancionPorId(id);
        	if (cancion != null) {
            	modelo.addAttribute("cancion", cancion);
            	modelo.addAttribute("listaArtistas", serviceArtistas.obtenerArtistas());
           	return "editarCancion.jsp";
        }
        return "redirect:/canciones.jsp";
    }
	

	@PutMapping("/canciones/procesa/editar/{id}")
	public String procesarEditarCancion(@PathVariable("id") Long id, @Validated  @ModelAttribute("cancion") Cancion cancion, BindingResult validaciones) {
		if (validaciones.hasErrors()) {
			return "editarCancion.jsp";
		}
		serviceArtistas.obtenerArtistaPorId(id);
		serviceCanciones.actualizaCancion(cancion);
		return "redirect:/canciones.jsp";
		
		
	}
	public String EliminarCancion(@PathVariable("idCancion") Long idCancion) {
    	this.serviceCanciones.eliminarCancion(idCancion);
    	
    	return "redirect:/canciones.jsp";
    } 	
	
}

