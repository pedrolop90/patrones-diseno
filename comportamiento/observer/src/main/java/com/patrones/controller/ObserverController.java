package com.patrones.controller;

import com.patrones.dto.Persona;
import com.patrones.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "observer")
public class ObserverController {

    @Autowired
    private PersonaService personaService;

    @PostMapping
    public String guardarPersona(@RequestBody Persona persona) {
        personaService.guardarPersona(persona);
        return "Persona guardada";
    }

    @PutMapping
    public String actualizarPersona(@RequestBody Persona persona) {
        personaService.actualizarPersona(persona);
        return "Persona actualizada";
    }

}
