/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer número: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("Por favor, introduzca el tercer número: ");
        int num3 = entrada.nextInt();

        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;
        
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
    }
    
}
