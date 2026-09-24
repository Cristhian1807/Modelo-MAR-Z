package com.proyecto.entities;

public class Rol {
    private String nombre;
    private String necesidadPrincipal;
    private String limite;

    // Constructor vacío
    public Rol() {}

    // Constructor con parámetros
    public Rol(String nombre, String necesidadPrincipal, String limite) {
        this.nombre = nombre;
        this.necesidadPrincipal = necesidadPrincipal;
        this.limite = limite;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNecesidadPrincipal() {
        return necesidadPrincipal;
    }

    public void setNecesidadPrincipal(String necesidadPrincipal) {
        this.necesidadPrincipal = necesidadPrincipal;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
}