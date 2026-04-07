/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);
    static Set<Alumno> alumnos = new HashSet<>();
    
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("---- MENÚ DE OPCIONES ----");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Mostrar alumnos (ordenados por expediente)");
            System.out.println("3. Buscar por número de expediente");
            System.out.println("4. Mostrar alumnos por nota");
            System.out.println("5. Salir");
            opcion = leerEntero("Elige una opción: ");

            switch (opcion) {
                case 1 -> añadirAlumno();
                case 2 -> mostrarOrdenados();
                case 3 -> buscarPorExpediente();
                case 4 -> mostrarPorNota();
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 5);
    }
    
    public static void añadirAlumno() {
        System.out.print("DNI: ");
        String dni = entrada.nextLine();

        int expediente = leerEntero("Número de expediente: ");
        float nota = leerFloat("Nota media: ");

        Alumno a = new Alumno(dni, expediente, nota);

        if (alumnos.add(a)) {
            System.out.println("Alumno añadido.");
        } else {
            System.out.println("Ya existe un alumno con ese número de expediente.");
        }
    }

    public static void mostrarOrdenados() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos.");
            return;
        }

        TreeSet<Alumno> ordenados = new TreeSet<>(alumnos);

        for (Alumno a : ordenados) {
            System.out.println(a);
        }
    }

    public static void buscarPorExpediente() {
        int exp = leerEntero("Introduce el número de expediente: ");

        for (Alumno a : alumnos) {
            if (a.getExpediente() == exp) {
                System.out.println("Alumno encontrado: " + a);
                return;
            }
        }

        System.out.println("No existe alumno con ese expediente.");
    }

    public static void mostrarPorNota() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos.");
            return;
        }

        List<Alumno> lista = new ArrayList<>(alumnos);

        lista.sort((a, b) -> Float.compare(b.getNotaMedia(), a.getNotaMedia()));

        for (Alumno a : lista) {
            System.out.println(a);
        }
    }

    public static int leerEntero(String msg) {
        System.out.print(msg);
        return Integer.parseInt(entrada.nextLine());
    }

    public static float leerFloat(String msg) {
        System.out.print(msg);
        return Float.parseFloat(entrada.nextLine());
    }

}
