/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg27;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar dos números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();

        int opcion = 0;
        
        //Bucle principal del menú
        do {
            System.out.println("Menú");
            System.out.println("1.- Sumar los números");
            System.out.println("2.- Restar los números");
            System.out.println("3.- Multiplicar los números");
            System.out.println("4.- Dividir los números");
            System.out.println("5.- Salir del programa");
            System.out.println("Selecciona una opción: ");
            
            switch (opcion = entrada.nextInt()) {
                case 1:
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                    break;
                case 4:
                    try {
                        if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir entre cero.");
                        }
                        System.out.println("Resultado de la división: " + (num1 / num2));
                    }catch (ArithmeticException e) {
                        System.out.println("Error");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }while (opcion != 5);
    }
    
}
