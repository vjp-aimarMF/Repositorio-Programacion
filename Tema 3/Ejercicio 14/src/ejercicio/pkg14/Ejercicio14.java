/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0; // Contador para llevar la cuenta de cuántos números pares hemos impreso
        int numero = 2; // Comenzamos desde el primer número par
        
        // Bucle que se ejecuta mientras hayamos impreso menos de 100 números pares
        while (contador < 100) {
            System.out.println(numero);
            numero += 2;
            contador++;
        }
    }
    
}
