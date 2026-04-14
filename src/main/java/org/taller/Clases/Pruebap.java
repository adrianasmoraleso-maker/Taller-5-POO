package org.taller.Clases;

public class Pruebap {
    public static void main(String[] args) {

        System.out.println("=== Ejercicio 1: Producto (acceso de paquete) ===");
        Producto prod = new Producto("Silla ergonómica", 350000, 8);
        prod.mostrarInfo();
        // Desde esta clase (mismo paquete) podemos acceder directamente:
        System.out.println("Acceso directo a nombre (mismo paquete): " + prod.nombre);
        prod.stock = 10; // modificación directa permitida en el mismo paquete
        prod.mostrarInfo();
    }
}