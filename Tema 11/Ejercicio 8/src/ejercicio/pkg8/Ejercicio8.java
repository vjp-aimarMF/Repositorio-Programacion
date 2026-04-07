/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Ciudad> ciudades = new ArrayList<>();
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("---- MENÚ DE OPCIONES ----");
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Mostrar ciudades y sedes");
            System.out.println("3. Sedes con ingresos superiores a la media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Añadir sede a una ciudad");
            System.out.println("6. Mostrar todas las sedes ordenadas por ingresos");
            System.out.println("7. Salir");
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> añadirCiudad();
                case 2 -> mostrarCiudades();
                case 3 -> mostrarSedesSuperioresMedia();
                case 4 -> buscarSede();
                case 5 -> añadirSede();
                case 6 -> mostrarSedesOrdenadas();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 7);
    }
    
    public static void añadirCiudad() {
    System.out.print("Nombre de la ciudad: ");
    String nombreCiudad = entrada.nextLine();

    Ciudad c = new Ciudad(nombreCiudad);

    boolean seguir;
    do {
        System.out.print("Nombre de la sede: ");
        String nombreSede = entrada.nextLine();
        double ingresos = leerDouble("Ingresos anuales: ");

        c.addSede(new Sede(nombreSede, ingresos));

        System.out.print("¿Añadir otra sede? (s/n): ");
        seguir = entrada.nextLine().equalsIgnoreCase("s");

    } while (seguir);

    ciudades.add(c);
}
    
    public static void mostrarCiudades() {
    if (ciudades.isEmpty()) {
        System.out.println("No hay ciudades registradas.");
        return;
    }

    ciudades.forEach(System.out::println);
}

    private static void mostrarSedesSuperioresMedia() {
    double suma = 0;
    int contador = 0;

    for (Ciudad c : ciudades) {
        for (Sede s : c.getSedes()) {
            suma += s.getIngresosAnuales();
            contador++;
        }
    }

    if (contador == 0) {
        System.out.println("No hay sedes registradas.");
        return;
    }

    double media = suma / contador;
    System.out.println("Media de ingresos: " + media);

    System.out.println("Sedes con ingresos superiores a la media:");
    for (Ciudad c : ciudades) {
        for (Sede s : c.getSedes()) {
            if (s.getIngresosAnuales() > media) {
                System.out.println("- " + s.getNombre());
            }
        }
    }
}

    private static void buscarSede() {
    System.out.print("Nombre de la sede a buscar: ");
    String nombre = entrada.nextLine();

    boolean encontrada = false;

    for (Ciudad c : ciudades) {
        for (Sede s : c.getSedes()) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                encontrada = true;
                break;
            }
        }
    }

    System.out.println("Resultado: " + encontrada);
}

    private static void añadirSede() {
    System.out.print("Nombre de la ciudad: ");
    String nombreCiudad = entrada.nextLine();

    for (Ciudad c : ciudades) {
        if (c.getNombre().equalsIgnoreCase(nombreCiudad)) {

            System.out.print("Nombre de la nueva sede: ");
            String nombreSede = entrada.nextLine();
            double ingresos = leerDouble("Ingresos anuales: ");

            c.addSede(new Sede(nombreSede, ingresos));
            System.out.println("Sede añadida correctamente.");
            return;
        }
    }

    System.out.println("La ciudad no existe.");
}

    private static void mostrarSedesOrdenadas() {
    TreeSet<Sede> ordenadas = new TreeSet<>();

    for (Ciudad c : ciudades) {
        ordenadas.addAll(c.getSedes());
    }

    if (ordenadas.isEmpty()) {
        System.out.println("No hay sedes registradas.");
        return;
    }

    ordenadas.forEach(System.out::println);
}

    private static int leerEntero(String msg) {
    System.out.print(msg);
    return Integer.parseInt(entrada.nextLine());
}

private static double leerDouble(String msg) {
    System.out.print(msg);
    return Double.parseDouble(entrada.nextLine());
}

}
