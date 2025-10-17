/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Creamos el objeto Scanner para leer la entrada del usuario
        double numero; // Variable para almacenar el número introducido
        
        // Bucle do...while que se ejecuta al menos una vez
         do {
            System.out.print("Introduce un número positivo para calcular su raíz cuadrada: ");
            numero = entrada.nextDouble(); // Leemos el número

            // Si el número es negativo, mostramos un mensaje de error
            if (numero < 0) {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
            }
        } while (numero < 0); // Repetimos mientras el número sea negativo
         
         // Calculamos la raíz cuadrada usando Math.sqrt()
        double raiz = Math.sqrt(numero);
        
        // Mostramos el resultado
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
    
}
