/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       
       //Bucle que se repite hasta que haya número mayor que 1
       do {
           System.out.println("Introduce un número mayor que 1: ");
           numero = entrada.nextInt();
           
           if (numero <= 1) {
                System.out.println("Error: El número debe ser mayor que 1.");
           }
       } while (numero <= 1); // Se repite mientras el número sea menor o igual a 1

        // Imprimimos todos los números desde 1 hasta el número introducido
        System.out.println("✅ Números entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
    }
    
}
