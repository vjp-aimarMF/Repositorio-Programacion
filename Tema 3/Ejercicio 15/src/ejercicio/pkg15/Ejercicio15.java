/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos al usuario que introduzca un número
        System.out.println("Introduzca un número para calcular su tabla de multiplicar: ");
        int numero = entrada.nextInt(); // Guardamos el número introducido
        
         // Usamos un bucle for para recorrer del 0 al 10
         for (int i = 0; i <= 10; i++){
         int resultado = numero * i; //Calculamos el producto
             System.out.println(numero + " x " + i + " = " + resultado); // Imprimimos la línea de la tabla
         }
    }
    
}
