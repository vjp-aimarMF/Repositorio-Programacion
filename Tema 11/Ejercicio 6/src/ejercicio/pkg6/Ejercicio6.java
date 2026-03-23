/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir donación");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Ordenar donaciones");
            System.out.println("7. Salir");
            opcion = leerEntero("Elige una opción: ");
            
            switch(opcion) {
                case 1 -> anadirDonacion();
                case 2 -> mostrarDonaciones();
                case 3 -> mostrarPorNombre();
                case 4 -> mostrarNumeroDonaciones();
                case 5 -> mostrarTotalRecaudado();
                case 6 -> ordenarDonaciones();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        
        } while(opcion != 7);
    }
    //---------------- MÉTODOS DEL MENÚ ----------------
    
    public static void anadirDonacion() {
        System.out.print("Nombre del donante: ");
        String nombre = entrada.nextLine();

        double cantidad = leerDouble("Cantidad donada: ");

        campania.addDonacion(new Donacion(nombre, cantidad));
        System.out.println("Donación añadida correctamente.");
    }
    
    public static void mostrarDonaciones() {
        campania.mostrarDonaciones();
    }
    
    public static void mostrarPorNombre() {
        System.out.println("Introduce el nombre del donante: ");
        String nombre = entrada.nextLine();
        campania.mostrarPorNombre(nombre);
    }
    
    public static void mostrarNumeroDonaciones() {
        System.out.println("Número de donaciones: " + campania.getNumeroDonaciones());
    }
    
    public static void mostrarTotalRecaudado() {
        System.out.println("Total recaudado: " + campania.getTotalRecaudado() + "€");
    }
    
    public static void ordenarDonaciones() {
    campania.ordenarDonaciones();
        System.out.println("Donaciones ordenadas.");
    }
    
    // ---------------- MÉTODOS AUXILIARES ----------------

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int num = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        return num;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        double num = entrada.nextDouble();
        entrada.nextLine(); // limpiar buffer
        return num;
    }
    
    static Scanner entrada = new Scanner(System.in);
    static Campania campania = new Campania("Campaña COVID-19");
}
