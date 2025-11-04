/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    // Método principal que se ejecuta al iniciar el programa
      public static void main(String[] args) {
        boolean resultado; // Variable para guardar si el número es primo o no
       
        // Llamamos al método esPrimo() y guardamos el resultado
        resultado = esPrimo();
       
        // Mostramos el resultado según el valor booleano devuelto
        if (resultado == true) {
            System.out.println("El numero introducido es primo");
        }
        else{
            System.out.println("El numero introducido es compuesto");
        }    
   }
      
      // Método que determina si un número es primo
    public static boolean esPrimo(){
        boolean primo; // Variable que indica si el número es primo
        int num; // Número introducido por el usuario
        int i; // Variable para iterar desde 1 hasta num
        int contador; // Cuenta cuántos divisores tiene el número
        
        contador = 0; // Inicializamos el contador de divisores
        i=0; // Inicializamos el iterador
       
        // Creamos el objeto Scanner para leer desde teclado
        Scanner entrada = new Scanner (System.in);
       
        System.out.println("Introduce un numero");
        num = entrada.nextInt(); // Leemos el número introducido por el usuario
       
        // Bucle que recorre desde 1 hasta num y cuenta los divisores
        while(i < num && contador != 3){
            i++;
            if(num%i==0) { // Si i divide a num sin resto, es divisor
            contador ++;
            }
             
        }
        
        // Si tiene exactamente 2 divisores (1 y él mismo), es primo
        if (contador == 2) {
               primo = true;  
           }else {
                 primo = false;
           }
    return primo;} // Devolvemos el resultado
   
}
