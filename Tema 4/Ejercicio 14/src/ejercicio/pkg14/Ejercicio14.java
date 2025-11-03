/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    //Método para pedir un número al usuario
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean valido = false;
        
        do {
            System.out.println("Introduce un número mayor que 0: ");
            numero = entrada.nextInt();
            if (esValido(numero)) {
                valido = true;
            }
        } while (!valido);
        
        return numero;
    }
    
    //Método para comprobar si el número es mayor que 0
    public static boolean esValido(int numero) {
        if (numero <= 0) {
            System.out.println("Error: el número debe ser mayor que 0.");
            return false;
        }
        return true;
    }
    
    // Método para calcular y mostrar los múltiplos de 3 entre 1 y el número dado
    public static void MultiplosdeTres(int limite) {
        int contador = 0;

        System.out.println("Múltiplos de 3 entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de múltiplos de 3 mostrados: " + contador);
    }
    
    //Método principal
    public static void main(String[] args) {
         int numero = pedirNumero(); // Solicita y valida el número
        MultiplosdeTres(numero); // Muestra los múltiplos de 3
    }
    
}
