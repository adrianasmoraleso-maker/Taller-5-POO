package org.taller.personas;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona();

        // p.nombre = "Ana"; da un error (private)
        p.setNombre("Ana"); // forma correcta

        System.out.println(p.getNombre());

        // Acceso a edad (default)
        p.edad = 25; //permitido
        System.out.println(p.edad);
    }
}

/*
 * Diferencias entre private y default:
 *
 * | Accesible desde              | private | default |
 * |------------------------------|-------- |---------|
 * | La misma clase               |   Si    |   Si    |
 * | Otra clase del mismo paquete |   No    |   Si    |
 * | Subclase en otro paquete     |   No    |   No    |
 * | Cualquier clase externa      |   No    |   No    |
 *
 * 'private' es el nivel más restrictivo: solo la clase que define el atributo
 *  puede leerlo o modificarlo. Obliga a usar getters/setters.
 *
 * 'default' (sin modificador) permite acceso libre dentro del paquete, lo que
 *  puede ser conveniente para colaboración entre clases del mismo módulo, pero
 *  expone los datos sin protección a todas las clases del paquete.
 */