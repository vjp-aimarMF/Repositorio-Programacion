/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetos creados con constructor con parámetros
        Taxi taxi = new Taxi("1234ABC", "Toyota Prius", 110, "LIC-789");
        Autobus bus = new Autobus("5678XYZ", "Mercedes Sprinter", 150, 30);

        // Objetos creados con constructor por defecto
        taxi.setMatricula("4321DEF");
        taxi.setModelo("Seat Toledo");
        taxi.setPotenciaCV(95);
        taxi.setNumeroLicencia("LIC-456");

        bus.setMatricula("8765LMN");
        bus.setModelo("Iveco Urbanway");
        bus.setPotenciaCV(180);
        bus.setNumeroPlazas(45);

        // Mostrar información de todos los objetos
        System.out.println("TAXI 1:");
        taxi.mostrarInformacion();
        System.out.println("\nTAXI 2:");
        taxi.mostrarInformacion();
        System.out.println("\nAUTOBÚS 1:");
        bus.mostrarInformacion();
        System.out.println("\nAUTOBÚS 2:");
        bus.mostrarInformacion();
    }
}
    

