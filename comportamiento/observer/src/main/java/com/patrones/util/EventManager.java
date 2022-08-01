package com.patrones.util;

import com.patrones.dto.Persona;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EventManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();

    @PostConstruct
    public void init() {
        this.listeners.put("guardar", new ArrayList<>());
        this.listeners.put("actualizar", new ArrayList<>());
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, Persona persona) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, persona);
        }
    }

}
