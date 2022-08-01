package com.patrones.controller;

import com.patrones.dto.Persona;
import com.patrones.dto.PersonaBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "builder")
public class BuilderController {

    @GetMapping("mal")
    public Persona obtenerPersonaMal() {
        return new Persona(
                "Pedro",
                null,
                null,
                null,
                null,
                null
        );
    }

    @GetMapping("bien")
    public Persona obtenerPersonaBien() {
        return PersonaBuilder
                .obtenerPersonaBuilder()
                .nombre("Pedro")
                .build();
    }


}
