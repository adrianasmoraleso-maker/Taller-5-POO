package org.taller.Vehiculos;

public class Moto extends Vehiculo {

    public Moto(String tipo) {
        super(tipo);
    }

    public void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }
}