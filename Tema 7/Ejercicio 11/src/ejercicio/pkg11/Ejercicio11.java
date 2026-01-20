/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = generarArray();
        
        System.out.println("Se ha generado el siguiente array:");
        mostrarArray(numeros);
    }
    
    //Metodo que rellena un array con numeros aleatorios sin repetir
    public static int[] generarArray() {
        int[] array = new int[10];
        boolean[] usados = new boolean[10]; //son los numeros que ya han salido
        
        for(int i = 0; i < array.length; i++) {
            int num;
            do {
                num = (int)(Math.random() * 10); //numero entre 0 y 9
            } while(usados[num]); //repetir si ya esta usado
            
            array[i] = num;
            usados[num] = true; //marcar como usado
        }
        
        return array;
    }
    
    //Metodo que visualiza el array
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
