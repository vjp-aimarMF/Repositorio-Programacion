/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres: ");
        String texto = entrada.nextLine();
        
        //Recorremos la cadena carácter por carácter
        for(int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
    
}
