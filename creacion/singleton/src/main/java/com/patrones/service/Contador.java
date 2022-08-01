package com.patrones.service;

public class Contador {

    private static Contador CONTADOR = null;

    public static Contador obtenerContador(){
        if(CONTADOR == null){
            CONTADOR = new Contador(0L);
        }
        return CONTADOR;
    }

    private Long contador;

    private Contador(Long valorInicial){
        this.contador = valorInicial;
    }

    public Long aumentar() {
        this.contador += 1;
        return this.contador;
    }

    public Long decrementar(){
        this.contador -= 1;
        return this.contador;
    }

}
