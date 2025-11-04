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
        int a = entrada.nextInt();
        
        System.out.println("Ahora, introduzca el segundo número: ");
        int b = entrada.nextInt();
        
        System.out.println("Introduzca el tercer número: ");
        int c = entrada.nextInt();
        
        System.out.println("Por último, introduzca el cuarto número: ");
        int d = entrada.nextInt();
        
        //Llamar al método
        ejercicio7Tema4(a, b, c, d);
    }
    
}
