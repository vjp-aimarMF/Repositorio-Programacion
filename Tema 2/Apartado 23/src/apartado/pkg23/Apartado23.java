/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg23;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicita el precio del producto
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        double precio = entrada.nextDouble();

        // Solicita la cantidad de unidades
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        int unidades = entrada.nextInt();

        // Calcula el total
        double total = precio * unidades;
                
        // Muestra el resultado
        System.out.printf("El precio total de su compra es de:" + total + "€");
    }
    
}
