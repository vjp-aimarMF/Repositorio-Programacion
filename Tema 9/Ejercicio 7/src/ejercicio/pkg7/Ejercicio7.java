/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        
        System.out.println("Frase invertida palabra a palabra: ");
        invertirPalabras(frase);
    }
    
    public static void invertirPalabras(String frase) {
        String[] palabras = frase.split(" ");
        
        for(int i = palabras.length - 1; i >= 0; i--) {
            System.out.println(palabras[i] + " ");
        }
    }
    
}
