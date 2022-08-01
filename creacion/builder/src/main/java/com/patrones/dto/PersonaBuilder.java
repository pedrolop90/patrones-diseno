package com.patrones.dto;

import java.time.LocalDate;

public class PersonaBuilder {

    private static PersonaBuilder PERSONA_BUILDER = null;

    private PersonaBuilder() {
    }

    public static PersonaBuilder obtenerPersonaBuilder(){
        if(PERSONA_BUILDER == null){
            PERSONA_BUILDER = new PersonaBuilder();
        }
        return PERSONA_BUILDER;
    }

    private String nombre;
    private String cedula;
    private LocalDate fechaNacimiento;
    private String tipoSangre;
    private String direccion;
    private String correoElectronico;

    public PersonaBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonaBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PersonaBuilder fechaNacimiento(String fechaNacimientoNueva) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public PersonaBuilder tipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
        return this;
    }

    public PersonaBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PersonaBuilder correoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    public Persona build() {
        return new Persona(
                nombre,
                cedula,
                fechaNacimiento,
                tipoSangre,
                direccion,
                correoElectronico
        );

    }

}
