package org.taller.personas;

public class Persona {

    private String nombre; // privado
    int edad;              // default

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}