/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg32;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int cantidad = entrada.nextInt();
        
        int billetes50 = cantidad / 50;
        cantidad %= 50;
        
        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad;
        
        System.out.println("Se descomponen en: ");
        System.out.println(billetes50 + " billetes de 50");
        System.out.println(billetes20 + " billetes de 20");
        System.out.println(billetes10 + " billetes de 10");
        System.out.println(billetes5 + " billetes de 5");
        System.out.println(monedas2 + " monedas de 2 euros");
        System.out.println(monedas1 + " monedas de 1 euro");
    }
    
}
