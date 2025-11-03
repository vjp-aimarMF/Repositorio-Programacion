/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    
    // Método que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }
         // Comprobamos si tiene algún divisor entre 2 y numero-1
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; // Si tiene divisor, no es primo
            }
        }

        return true; // Si no se encontró divisor, es primo
    }
    // Método principal para probar el método esPrimo
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 10, 13, 17, 20};
        
        for (int n : numeros) {
            System.out.println("¿" + n + " es primo? " + esPrimo(n));
        }
    }
    
}
