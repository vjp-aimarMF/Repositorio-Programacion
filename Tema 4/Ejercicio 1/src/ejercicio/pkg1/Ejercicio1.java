/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    //Método que determina si un número es positivo o negativo
    public static void verificarSigno(int numero) {
        if (numero >= 0) {
            System.out.println("El número introducido es positivo");
        } else {
            System.out.println("El número introducido es negativo");
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Objeto para leer entrada por teclado
        
        System.out.println("Por favor, introduzca un número: ");
        int numero = entrada.nextInt(); //Leer número introducido por el usuario
        
        verificarSigno(numero); //Llamada al método para verificar el signo
      }
    
}
