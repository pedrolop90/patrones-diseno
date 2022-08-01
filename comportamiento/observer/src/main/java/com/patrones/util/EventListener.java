package com.patrones.util;

import com.patrones.dto.Persona;

public interface EventListener {
    void update(String eventType, Persona persona);
}
