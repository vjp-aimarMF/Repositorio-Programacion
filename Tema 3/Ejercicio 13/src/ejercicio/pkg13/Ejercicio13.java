/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero = 12; //Comenzamos en 12 porque 11 no es par
         
         while (numero <= 132) { //132 es el último número par antes de 133
             System.out.println(numero);
             numero += 2; // Avanzamos de dos en dos para mantener solo pares
         }
    }
    
}
