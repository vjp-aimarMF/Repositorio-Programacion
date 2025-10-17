/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0; // Contador de números impares
        int inicio = 21;  // Primer número impar mayor que 20
        int fin = 159;    // Último número impar menor que 160
        
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
        
        // Bucle para recorrer e imprimir los impares
        for (int i = inicio; i <= fin; i += 2) {
            System.out.print(i + " – ");
            contador++; // Incrementamos el contador por cada número impar
        }
        
        // Salto de línea y mensaje final
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
    }
    
}
