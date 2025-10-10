/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un número de 4 cifras: ");
        int numero = entrada.nextInt();
        
        int primera = numero / 1000;
        int segunda = (numero / 100) % 10;
        int tercera = (numero / 10) % 10;
        int cuarta = numero % 10;
        
        System.out.println("La primera cifra es: " + primera);
        System.out.println("La segunda cifra es: " + segunda);
        System.out.println("La tercera cifra es: " + tercera);
        System.out.println("La cuarta cifra es: " + cuarta);
        
       
    }
    
}
