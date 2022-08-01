package com.patrones.service;

import com.patrones.dto.Persona;
import com.patrones.util.EventManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private EventManager eventManager;

    public void guardarPersona(Persona persona) {
        eventManager.notify("guardar", persona);
    }

    public void actualizarPersona(Persona persona) {
        eventManager.notify("actualizar", persona);
    }

}
