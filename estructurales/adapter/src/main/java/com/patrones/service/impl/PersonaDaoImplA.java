package com.patrones.service.impl;

import com.patrones.dto.Persona;
import com.patrones.service.IPersonaDao;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonaDaoImplA implements IPersonaDao {

    private List<Persona> data = null;

    @PostConstruct
    public void init() {
        data = Arrays.asList(
                Persona.builder().id(1L).nombre("Pedro").build(),
                Persona.builder().id(2L).nombre("Sebastian").build(),
                Persona.builder().id(3L).nombre("Andres").build()
        );
    }

    @Override
    public Persona obtenerPersona(Long id) {
        for (Persona persona : data) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }
}
