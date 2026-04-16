/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {
public final static String FICHERO = "agenda.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("=== AGENDA CON FICHERO DE TEXTO ===\n");

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir un contacto al fichero");
            System.out.println("2. Mostrar contenido del fichero");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(entrada.nextLine().trim());

                switch (opcion) {
                    case 1:
                        anadirContacto();
                        break;
                    case 2:
                        mostrarContenidoFichero();
                        break;
                    case 3:
                        System.out.println("¡Gracias por usar la agenda! Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija entre 1 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número entero válido.");
                opcion = 0; // Para que no salga del bucle
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
                opcion = 0;
            }
        } while (opcion != 3);
    }
    
    // MÉTODOS
    public static void anadirContacto() throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n--- AÑADIR NUEVO CONTACTO ---");

        
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine().trim();
        if (nombre.isEmpty()) {
            throw new IOException("El nombre no puede estar vacío.");
        }

        System.out.print("Edad: ");
        String edadStr = entrada.nextLine().trim();
        int edad;
        try {
            edad = Integer.parseInt(edadStr);
            if (edad < 0) {
                throw new IOException("La edad no puede ser negativa.");
            }
        } catch (NumberFormatException e) {
            throw new IOException("La edad debe ser un número entero válido.");
        }

        System.out.print("Número de teléfono: ");
        String telefono = entrada.nextLine().trim();
        if (telefono.isEmpty()) {
            throw new IOException("El número de teléfono no puede estar vacío.");
        }

        // Escribir en el fichero (modo append = true)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))) {
            bw.write(nombre + " | " + edad + " | " + telefono);
            bw.newLine();
            System.out.println("¡Contacto añadido correctamente al fichero!");
        }
    }
    
    public static void mostrarContenidoFichero() throws IOException {
        File fichero = new File(FICHERO);

        if (!fichero.exists()) {
            throw new IOException("El fichero 'agenda.txt' aún no existe. Añada al menos un contacto primero.");
        }

        System.out.println("\n--- CONTENIDO DE LA AGENDA ---");

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            boolean vacio = true;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                vacio = false;
            }

            if (vacio) {
                System.out.println("El fichero está vacío.");
            }
        }
    }
    
    
    public static void crearFicheroSiNoExiste() {
        try {
            File fichero = new File(FICHERO);
            if (!fichero.exists()) {
                fichero.createNewFile();
                System.out.println("Se ha creado el fichero 'agenda.txt' automáticamente.");
            }
        } catch (IOException e) {
            System.out.println("No se pudo crear el fichero automáticamente.");
        }
    }
}
