package org.taller.prueba;

import vehiculos.Moto;
// import vehiculos.Vehiculo; (Esto dará error)

public class PruebaVehiculo {

    public static void main(String[] args) {
        Moto m = new Moto("Deportiva");

        m.mostrarTipo();

        System.out.println(m.tipo); // Error
    }
}

//Este error ocurre porque la clase vehiculo no es public,
// y solo existen dentro de su paquete. Para que sea accesible
// desde fuera habría que marcarlo como 'public' o proveer un
// getter public.
//