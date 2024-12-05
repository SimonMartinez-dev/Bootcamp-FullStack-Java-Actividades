package com.simon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorInformacion {


    @GetMapping("/bienvenido")
    public String bienvenida() {
        return "¡Bienvenido!";
    }

    @GetMapping("/acerca")
    public String acercaDe() {
        return "Blablabla";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "241500-03";
    }
    

}
