package com.patrones.service.impl;

import com.patrones.dto.Persona;
import com.patrones.service.IPersonaDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.TreeMap;

@Service
@Primary
public class PersonaDaoImplB implements IPersonaDao {

    private Map<Long, Persona> data = new TreeMap<>();

    @PostConstruct
    public void init() {
        data.put(1L, Persona.builder().id(1L).nombre("Pedro").build());
        data.put(2L, Persona.builder().id(2L).nombre("Sebastian").build());
        data.put(3L, Persona.builder().id(3L).nombre("Andres").build());
    }

    @Override
    public Persona obtenerPersona(Long id) {
        return data.get(id);
    }
}
