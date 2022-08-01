package com.patrones.service;

import com.patrones.dto.Persona;
import com.patrones.util.EventListener;
import com.patrones.util.EventManager;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Log
public class LogActualizadaPersonaService implements EventListener {

    @Autowired
    private EventManager eventManager;

    @PostConstruct
    public void init() {
        eventManager.subscribe("actualizar", this);
    }

    @Override
    public void update(String eventType, Persona persona) {
        log.info(
                String.format("%s - %s", "Persona actualizada", persona.toString())
        );
    }
}
