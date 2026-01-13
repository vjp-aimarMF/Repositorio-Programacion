/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = pedirNumeros(); // Llamamos al método que pide los 10 números 
        mostrarPares(numeros); // Llamamos al método que muestra los pares
    }

    // Método que pide 10 números enteros y los guarda en un array 
    public static int[] pedirNumeros() {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Introduce 10 numeros enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            array[i] = entrada.nextInt();
        }
        return array;
    }

    // Método que muestra solo los números pares del array 
    public static void mostrarPares(int[] array) { 
        System.out.println("\nNumeros pares en el array:");
        for (int num : array) { 
            if (num % 2 == 0) { 
                System.out.println(num); 
            } 
        } 
    }
}
