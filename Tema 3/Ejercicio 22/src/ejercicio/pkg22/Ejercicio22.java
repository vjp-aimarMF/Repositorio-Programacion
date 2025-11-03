/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg22;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        try {
            // Solicitar el primer número entero
            System.out.println("Introduce el primer número entero: ");
        int num1 = entrada.nextInt();
        
            // Solicitar el segundo número entero
            System.out.println("Introduce el segundo número entero: ");
        int num2 = entrada.nextInt();
        
            // Calcular y mostrar la suma
        int suma = num1 + num2;
            System.out.println("La suma de los dos números es: " + suma);
        }catch (NumberFormatException e) {
            // Captura si el texto no es un número válido
            System.out.println("Error: Has introducido un valor no numérico");
        }
    }
    
}
