/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();         //Pedimos numero
        int cifras = contarCifras(numero); //Contamos cifras
        int[] array = dividirEnCifras(numero, cifras);  //Dividimos en array
        mostrarArray(array); //Mostrar al reves
    }
    
    //Método que pide un numero entero al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero: ");
        
        return entrada.nextInt();
    }
    
    //Método para calcular sus cifras
    public static int contarCifras(int numero) {
        int contador = 0;
        
        while(numero > 0) {
            numero = numero / 10;
            contador++;
        }
        
        System.out.println("El numero de cifras es: " + contador);
        return contador;
    }
    
    //Dividimos el numero en cifras para guardarlo en array
    public static int[] dividirEnCifras(int numero, int cifras) {
        int[] array = new int[cifras];
        
        for(int i = 0; i < cifras; i++) {
            array[i] = numero % 10;
            numero = numero / 10;
        }
        return array;
    }
    
    //Metodo para mostrar el array al reves
    public static void mostrarArray(int[] array) {
        System.out.println("El numero introducido escrito al reves es el: ");
        
        for (int  i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("");
    }
}
