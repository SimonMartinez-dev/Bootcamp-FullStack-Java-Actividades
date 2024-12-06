package com.simon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.simon.models.Artista;
import com.simon.services.ServiceArtistas;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ControllerArtistas {
    @Autowired
    private ServiceArtistas serviceArtistas;

    @GetMapping("/artistas")
    public String mostrarArtistas(Model modelo) {
        modelo.addAttribute("artistas", serviceArtistas.obtenerArtistas());
        return "artistas.jsp";
    }
    @GetMapping("/artistas/detalle/{idArtista}")
    public String mostrarDetalleArtistas(@PathVariable("idArtista") Long id, Model modelo) {
        modelo.addAttribute("artista", serviceArtistas.obtenerArtistaPorId(id));
        return "detalleArtista.jsp";
    }

      @GetMapping("/artistas/formulario/agregar/{idArtista}")
        public String formularioAgregarArtista(@PathVariable Long idArtista, Model modelo) {
        modelo.addAttribute("artista", new Artista());
            return "agregarArtista.jsp";
        }

        @PostMapping("/artistas/procesa/agregar")
        public String procesarAgregarArtista(@Valid @ModelAttribute Artista artista, BindingResult 							validaciones) {
            if (validaciones.hasErrors()) {
                return "agregarArtista.jsp";
            }
            serviceArtistas.agregarArtista(artista);
            return "redirect:/artistas.jsp";
}
	
}