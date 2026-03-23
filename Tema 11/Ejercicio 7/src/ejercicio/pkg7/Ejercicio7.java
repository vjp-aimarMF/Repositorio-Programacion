/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcion = 0;
        
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir campaña");
            System.out.println("2. Añadir donación");
            System.out.println("3. Mostrar campañas con donaciones");
            System.out.println("4. Mostrar campaña por nombre");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Mostrar mayor donación");
            System.out.println("7. Salir");
            opcion = leerEntero("Elige una opción: ");
            
            switch(opcion) {
                case 1 -> anadirCampania();
                case 2 -> anadirDonacion();
                case 3 -> mostrarCampanias();
                case 4 -> mostrarCampaniaPorNombre();
                case 5 -> mostrarTotalRecaudado();
                case 6 -> mostrarMayorDonacion();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        
        } while(opcion != 7);
    }
    //---------------- MÉTODOS DEL MENÚ ----------------
    public static void anadirCampania() {
        System.out.print("Nombre de la campaña: ");
        String nombre = entrada.nextLine();
        campanias.add(new Campania(nombre));
        System.out.println("Campaña añadida.");
    }
    
    public static void anadirDonacion() {
        System.out.print("Nombre de la campaña: ");
        String nombreCampania = entrada.nextLine();

        Campania c = buscarCampania(nombreCampania);

        if (c == null) {
            System.out.println("No existe esa campaña.");
            return;
        }

        System.out.print("Nombre del donante: ");
        String nombre = entrada.nextLine();
        double cantidad = leerDouble("Cantidad donada: ");

        c.addDonacion(new Donacion(nombre, cantidad));
        System.out.println("Donación añadida.");
    }
    
    public static void mostrarCampanias() {
        if (campanias.isEmpty()) {
            System.out.println("No hay campañas registradas.");
            return;
        }

        for (Campania c : campanias) {
            System.out.println(c);
        }
    }
    
    public static void mostrarCampaniaPorNombre() {
        System.out.println("Nombre de la campaña: ");
        String nombre = entrada.nextLine();
        
        Campania c = buscarCampania(nombre);
        
        if (c == null) {
            System.out.println("No existe esa campaña.");
        } else {
            System.out.println(c);
        }
    }
    
    public static void mostrarTotalRecaudado() {
        double total = 0;
        
        for(Campania c : campanias) {
            total += c.getTotal();
        }
        
        System.out.println("Total recaudado entre todas las campañas: " + total + " €");
    }
    
    public static void mostrarMayorDonacion() {
        Donacion mayor = null;
        String campaniaMayor = "";

        for (Campania c : campanias) {
            Donacion d = c.getMayorDonacion();
            if (d != null && (mayor == null || d.getCantidad() > mayor.getCantidad())) {
                mayor = d;
                campaniaMayor = c.getNombre();
            }
        }

        if (mayor == null) {
            System.out.println("No hay donaciones registradas.");
        } else {
            System.out.println("Mayor donación:");
            System.out.println(mayor + " | Campaña: " + campaniaMayor);
        }
    }
    // ---------------- MÉTODOS AUXILIARES ----------------

    private static Campania buscarCampania(String nombre) {
        for (Campania c : campanias) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
    
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
    static ArrayList<Campania> campanias = new ArrayList<>();
}
