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
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar al usuario que introduzca un número
        System.out.print("Por favor, introduzca un numero: ");
        int numero = entrada.nextInt();
        
         // Determinar si el número es positivo o negativo
        if (numero >= 0) {
            System.out.println("El número introducido es positivo");
        } else {
            System.out.println("El número introducido es negativo");
        }
    }
    
}
