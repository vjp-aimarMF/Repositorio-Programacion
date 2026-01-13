/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = introducirDatos(); // Pedimos los 7 números 
        
        System.out.println("Array original:"); 
        mostrarDatos(numeros); // Mostramos el array original 
        
        intercambiar(numeros); // Intercambiamos 2ª y 4ª posición 
        
        System.out.println("\nArray despues del intercambio:"); 
        mostrarDatos(numeros); // Mostramos el array modificado
    }
    // Método para introducir los 7 números 
    public static int[] introducirDatos() { 
        Scanner entrada = new Scanner(System.in); 
        int[] array = new int[7]; 
        
        System.out.println("Introduce 7 numeros enteros:"); 
        for (int i = 0; i < array.length; i++) { 
            System.out.print("Numero " + (i + 1) + ": "); 
            array[i] = entrada.nextInt(); 
        } 
        return array; 
    }
    
    // Método para mostrar los datos del array 
    public static void mostrarDatos(int[] array) { 
        for (int num : array) { 
            System.out.print(num + " "); 
        } 
        
        System.out.println(); 
    }
    
    // Método para intercambiar la 2ª y 4ª posición (índices 1 y 3) 
    public static void intercambiar(int[] array) { 
        int temp = array[1]; 
        array[1] = array[3]; 
        array[3] = temp; 
    }
}
