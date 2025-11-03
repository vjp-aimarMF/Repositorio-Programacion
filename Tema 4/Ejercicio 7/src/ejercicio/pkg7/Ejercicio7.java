/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;
import static ejercicio7Tema4.ejercicio7Tema4.ejercicio7Tema4;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Pedir los 4 números al usuario
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca el segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer número: ");
        int num3 = entrada.nextInt();
        
        System.out.println("Por último, introduzca el cuarto número: ");
        int num4 = entrada.nextInt();
        
        //Llamar al método
        ejercicio7Tema4(num1, num2, num3, num4);
    }
    
}
