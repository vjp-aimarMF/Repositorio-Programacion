/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear los dos objetos de la clase Coche
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer modelo, marca y color en miCoche
        miCoche.establecerMarca("Toyota");
        miCoche.establecerModelo("Corolla");
        miCoche.establecerColor("Rojo");

        // Establecer modelo, marca y color en cochePadre
        cochePadre.establecerMarca("Ford");
        cochePadre.establecerModelo("Focus");
        cochePadre.establecerColor("Azul");

        // Arrancar ambos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelerar 5 veces miCoche
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        // Frenar 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar 3 veces cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estado de ambos coches
        System.out.println("=== Estado de miCoche ===");
        miCoche.obtenerEstado();

        System.out.println("\n=== Estado de cochePadre ===");
        cochePadre.obtenerEstado();
    }
    
}
