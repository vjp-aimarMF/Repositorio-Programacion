/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Vector (array) con los meses del año
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Conjuntos
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Insertar los meses en ambos conjuntos
        for (String mes : meses) {
            hashSet.add(mes);
            linkedHashSet.add(mes);
        }

        // Mostrar contenido
        System.out.println("Contenido de HashSet:");
        for (String mes : hashSet) {
            System.out.println(mes);
        }

        System.out.println("\nContenido de LinkedHashSet:");
        for (String mes : linkedHashSet) {
            System.out.println(mes);
        }
    }
}
