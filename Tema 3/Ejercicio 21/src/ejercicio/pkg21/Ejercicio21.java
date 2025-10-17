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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dividendo, divisor;
        double resultado;
        
        // Solicitar el dividendo
        System.out.print("Introduce el dividendo: ");
        dividendo = entrada.nextInt();
        
        // Solicitar el divisor
        System.out.print("Introduce el divisor: ");
        divisor = entrada.nextInt();
        
        
        //Intentar realizar la división
        try {
        resultado = (double) dividendo / divisor;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre 0.");
        }
    }
    
}
