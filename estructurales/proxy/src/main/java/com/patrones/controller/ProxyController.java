package com.patrones.controller;

import com.patrones.common.ProxyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "proxy")
public class ProxyController {

    @Autowired
    private ProxyLogger proxyLogger;

    @PostMapping()
    public void guardarPersona() {
        proxyLogger.info("Data guardada.");
    }

}
