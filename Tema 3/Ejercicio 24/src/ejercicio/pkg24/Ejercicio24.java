/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       
       //Pedir un número mayor que 0
       
       do{
           System.out.println("Introduce un número mayor que 0: ");
           numero = entrada.nextInt();
           
           if (numero <= 0) {
               System.out.println("Error: el número debe ser mayor que 0.");
           }
       }while (numero <= 0);
       
       int contador = 0;
       
        System.out.println("Múltiplos de 3  entre 1 y " + numero + ":");
        
       //Mostrar múltiplos de 3
       for (int i = 1; i <= numero; i++) {
           if (i % 3 == 0) {
               System.out.println(i + " ");
               contador++;
           }
       }
       
       //Mostrar total
        System.out.println("Total de múltiplos de 3 encontrados: " + contador);
    }
    
}
