/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    //Método principal
    public static void main(String[] args) {
      int primero = PedirPrimerNumero();
        int segundo = PedirSegundoNumero(primero);
        MostrarSumaPares(primero, segundo);
    }
     public static int PedirPrimerNumero() {
         Scanner entrada = new Scanner (System.in);
         System.out.println("Introduce el primer número: ");
         return entrada.nextInt();
     }
     
     public static int PedirSegundoNumero(int primero) {
         Scanner entrada = new Scanner (System.in);
         int segundo;
         
         do {
            System.out.print("Introduce el segundo número (mayor que " + primero + "): ");
            segundo = entrada.nextInt();
            if (segundo <= primero) {
                System.out.println("El segundo número debe ser mayor que el primero. Inténtalo de nuevo.");
            }
        } while (segundo <= primero);

        return segundo;
    }
     // Método que calcula y muestra la suma de los números pares entre dos valores
    public static void MostrarSumaPares(int inicio, int fin) {
        int suma = 0;

        for (int i = inicio + 1; i < fin; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares entre " + inicio + " y " + fin + " es: " + suma);
    }
}
