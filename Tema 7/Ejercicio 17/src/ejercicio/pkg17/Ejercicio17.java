/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = crearArray();
        
        System.out.println("Array original:");
        mostrarArray(numeros);
        
        ordenarArray(numeros);
        
        System.out.println("Array ordenado de mayor a menor:");
        mostrarArray(numeros);
    }
    
    //Metodo que crea un array de 10 enteros aleatorios entre 0 y 9
    public static int[] crearArray() {
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10); //valores entre 0 y 9
        }
        
        return array;
    }
    
    //Metodo que visualiza el array por pantalla
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println(""); //salto de linea final
    }
    
    //Metodo que ordena el array de mayor a menor
    public static void ordenarArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] < array[j + 1]) {
                    //Intercambio para ordenar de mayor a menor
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
