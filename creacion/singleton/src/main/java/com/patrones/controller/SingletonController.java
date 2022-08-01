package com.patrones.controller;

import com.patrones.service.Contador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "singleton")
public class SingletonController {

    @GetMapping(value = "aumentar")
    public Long aumentarContador() {
        return Contador.obtenerContador().aumentar();
    }

    @GetMapping(value = "decrementar")
    public Long decrementarContador() {
        return Contador.obtenerContador().decrementar();
    }

}
