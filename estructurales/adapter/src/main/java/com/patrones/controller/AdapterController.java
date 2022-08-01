package com.patrones.controller;

import com.patrones.dto.Persona;
import com.patrones.service.IPersonaDao;
import com.patrones.service.impl.PersonaDaoImplA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "adapter")
public class AdapterController {

    @Autowired
    private IPersonaDao personaDao;

    @Autowired
    private PersonaDaoImplA PersonaDaoImplA;

    @GetMapping(value = "A")
    public Persona obtenerPersonaA() {
        return PersonaDaoImplA.obtenerPersona(1L);
    }

    @GetMapping(value = "B")
    public Persona obtenerPersonaB() {
        return personaDao.obtenerPersona(1L);
    }

}
