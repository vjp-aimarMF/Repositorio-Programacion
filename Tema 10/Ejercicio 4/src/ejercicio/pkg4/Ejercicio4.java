/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();
        
        rellenarLista(numero);

        System.out.println("\nLista antes de modificar:");
        mostrarLista(numero);

        sustituirRepetidosPorCero(numero);

        System.out.println("\nLista despues de modificar:");
        mostrarLista(numero);
    }
    
    // Método para rellenar la lista
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce numeros positivos (negativo para terminar):");

        do {
            num = sc.nextInt();
            if (num > 0) {
                lista.add(num);
            }
        } while (num >= 0);
    }

    // Método para mostrar la lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }

    // Método que sustituye los repetidos por 0
    public static void sustituirRepetidosPorCero(ArrayList<Integer> lista) {
    for (int i = 0; i < lista.size(); i++) {
        boolean repetido = false;

        // Buscar si el elemento aparece en otra posición
        for (int j = 0; j < lista.size(); j++) {
            if (i != j && lista.get(i).equals(lista.get(j))) {
                repetido = true;
                break;
                }
            }
            if (repetido) {
                lista.set(i, 0);
            }
        }
    }
    
    //Este es el metodo en el que sustituye solo los numeros repetidos, sin contar el primer numero repetido
//    public static void sustituirRepetidosPorCero(ArrayList<Integer> lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            for (int j = i + 1; j < lista.size(); j++) {
//                if (lista.get(i).equals(lista.get(j))) {
//                    lista.set(j, 0);
//                }
//            }
//        }
//    }
}
