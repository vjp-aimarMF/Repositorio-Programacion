/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();
    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("---- MENÚ DE OPCIONES ----");
            System.out.println("1. Realizar sorteo hoy");
            System.out.println("2. Repetir sorteo de hoy");
            System.out.println("3. Mostrar sorteos del mes actual");
            System.out.println("4. Mostrar sorteo por fecha");
            System.out.println("5. Realizar sorteo por fecha");
            System.out.println("6. Mostrar todos los sorteos");
            System.out.println("7. Salir");
            opcion = leerEntero("Elige una opción: ");

                switch (opcion) {
                    case 1 -> realizarSorteoHoy();
                    case 2 -> repetirSorteo();
                    case 3 -> mostrarSorteosMesActual();
                    case 4 -> mostrarSorteoPorFecha();
                    case 5 -> realizarSorteoPorFecha();
                    case 6 -> mostrarTodos();
                    case 7 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida");
                }

            } while (opcion != 7);
        }
    
    
    public static void realizarSorteoHoy() {
        LocalDate hoy = LocalDate.now();
        
        if(sorteos.containsKey(hoy)) {
            System.out.println("Ya existe un sorteo hoy.");
            return;
        }
        
        Sorteo s = new Sorteo(hoy);
        sorteos.put(hoy, s);

        System.out.println("Sorteo realizado: " + s);
    }
    
    public static void repetirSorteo() {
        LocalDate hoy = LocalDate.now();

        if (!sorteos.containsKey(hoy)) {
            System.out.println("No existe sorteo hoy.");
            return;
        }

        sorteos.remove(hoy);
        Sorteo nuevo = new Sorteo(hoy);
        sorteos.put(hoy, nuevo);

        System.out.println("Sorteo repetido: " + nuevo);
    }

    public static void mostrarSorteosMesActual() {
        LocalDate hoy = LocalDate.now();
        int mes = hoy.getMonthValue();
        int año = hoy.getYear();

        boolean encontrado = false;

        for (Sorteo s : sorteos.values()) {
            if (s.getFecha().getMonthValue() == mes &&
                s.getFecha().getYear() == año) {

                System.out.println(s);
                encontrado = true;
            }
        }

        if (!encontrado) {
           System.out.println("No hay sorteos este mes.");
        }
    }

    public static void mostrarSorteoPorFecha() {
        LocalDate fecha = leerFecha("Introduce la fecha (dd/MM/yyyy): ");

        Sorteo s = sorteos.get(fecha);

        if (s == null) {
            System.out.println("No existe sorteo en esa fecha.");
        } else {
            System.out.println(s);
        }
    }

    public static void realizarSorteoPorFecha() {
        LocalDate fecha = leerFecha("Introduce la fecha del sorteo: ");
        
        if (sorteos.containsKey(fecha)) {
            System.out.println("Ya existe un sorteo en esa fecha.");
            return;
        }

        Sorteo s = new Sorteo(fecha);
        sorteos.put(fecha, s);

        System.out.println("Sorteo realizado: " + s);
    }
    
    public static void mostrarTodos() {
        if (sorteos.isEmpty()) {
            System.out.println("No hay sorteos registrados.");
            return;
        }

        for (Sorteo s : sorteos.values()) {
            System.out.println(s);
        }
    }

    public static int leerEntero(String msg) {
        System.out.print(msg);
        return Integer.parseInt(entrada.nextLine());
    }

    public static LocalDate leerFecha(String msg) {
        System.out.print(msg);
        String texto = entrada.nextLine();
        return LocalDate.parse(texto, fmt);
    }
}
