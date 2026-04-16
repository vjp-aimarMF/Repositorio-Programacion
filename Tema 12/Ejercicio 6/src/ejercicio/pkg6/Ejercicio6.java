/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcion;

        System.out.println("=== VOLUMEN DE NÚMEROS PARES A FICHERO ===\n");

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Volcado de los 100 primeros números pares a un fichero");
            System.out.println("2. Mostrar contenido del fichero");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(entrada.nextLine().trim());

                switch (opcion) {
                    case 1:
                        volcarNumerosPares();
                        break;
                    case 2:
                        mostrarContenidoFichero();
                        break;
                    case 3:
                        System.out.println("¡Gracias por usar el programa! Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija entre 1 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe introducir un número entero válido.");
                opcion = 0;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }
        } while (opcion != 3);
    }
    
    
    // MÉTODOS
    public static void volcarNumerosPares() throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nIntroduce el nombre del fichero (ejemplo: pares.txt): ");
        String nombreFichero = entrada.nextLine().trim();

        if (nombreFichero.isEmpty()) {
            throw new IOException("El nombre del fichero no puede estar vacío.");
        }

        // Crear array con los 100 primeros números pares (2, 4, 6, ..., 200)
        int[] numerosPares = new int[100];
        for (int i = 0; i < 100; i++) {
            numerosPares[i] = 2 * (i + 1);   // 2, 4, 6, ..., 200
        }

        // Volcar el array al fichero
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            for (int numero : numerosPares) {
                bw.write(String.valueOf(numero));
                bw.newLine();
            }
            System.out.println("¡Volcado completado correctamente!");
            System.out.println("Se han guardado 100 números pares en el fichero: " + nombreFichero);
        }
    }
    
    public static void mostrarContenidoFichero() throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre del fichero que deseas leer: ");
        String nombreFichero = entrada.nextLine().trim();

        if (nombreFichero.isEmpty()) {
            throw new IOException("El nombre del fichero no puede estar vacío.");
        }

        File fichero = new File(nombreFichero);

        if (!fichero.exists()) {
            throw new IOException("El fichero '" + nombreFichero + "' no existe.");
        }

        System.out.println("\n--- CONTENIDO DEL FICHERO: " + nombreFichero + " ---");

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            int contador = 0;
            boolean vacio = true;

            while ((linea = br.readLine()) != null) {
                System.out.printf("%3d: %s%n", ++contador, linea);
                vacio = false;
            }

            if (vacio) {
                System.out.println("El fichero está vacío.");
            } else {
                System.out.println("\nTotal de líneas leídas: " + contador);
            }
        }
    }

}