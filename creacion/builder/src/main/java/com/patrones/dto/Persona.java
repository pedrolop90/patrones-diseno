package com.patrones.dto;

import java.time.LocalDate;


public class Persona {

    private String nombre;
    private String cedula;
    private LocalDate fechaNacimiento;
    private String tipoSangre;
    private String direccion;
    private String correoElectronico;

    public Persona(String nombre, String cedula, LocalDate fechaNacimiento, String tipoSangre, String direccion, String correoElectronico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }



}
