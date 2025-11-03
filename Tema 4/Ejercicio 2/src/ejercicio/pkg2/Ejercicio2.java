/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;
import ejercicio2Tema4.ejercicio2Tema4;
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
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar el primer número
        System.out.println("Por favor, introduzca un número: ");
        int num1 = entrada.nextInt();
        
        //Solicitar el segundo número
        System.out.println("Ahora, introduzca un segundo número: ");
        int num2 = entrada.nextInt();
        
        //Lógica para decidir qué operación realizar
        if (num1 > 10) {
            ejercicio2Tema4.multiplicar(num1, num2);
        }else {
            ejercicio2Tema4.sumar(num1, num2);
        }
    }
    
}
