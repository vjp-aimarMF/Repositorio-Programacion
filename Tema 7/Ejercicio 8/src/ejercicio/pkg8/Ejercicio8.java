/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = pedirNumero(); //Pedimos el número
       int[] cifras = dividirEnCifras(numero); //Lo dividimos en un array
       mostrarArrayReves(cifras); //Mostramos el array al revés
    }
   
    // Método que pide un número entero de 5 cifras
    public static int pedirNumero() {
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        while(true) {
        System.out.println("Introduce un numero de 5 cifras");
        numero = entrada.nextInt();
        
        if (numero >= 10000 && numero <= 99999) { 
            return numero;
            } else{
                System.out.println("Error");
            } 
        }
    }
    
    public static int[] dividirEnCifras(int numero) {
        int[] array = new int[5];
        
        for (int i = 0; i < 5; i++) { 
            array[i] = numero % 10; // Última cifra
            numero /= 10; // Quitamos la última cifra
        }    
        return array;
    }
    
    // Método que muestra el array al revés
    public static void mostrarArrayReves(int[] array) {
        System.out.println("El numero introducido escrito al reves es el: ");
        
        for (int  i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
    }
}
