/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        rellenarArray(numeros);
        System.out.println("Se han generado los siguientes números: ");
        mostrarArray(numeros);
        
        sustituirRepetidos(numeros);
        System.out.println("Sustituimos los elementos repetidos por un 0: ");
        mostrarArray(numeros);
    }
    
    //Metodo para rellenar el array con numeros aleatorios (1-8)
    public static void rellenarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 8) + 1;
        }
    }
    
    //Metodo que muestra el array
    public static void mostrarArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    
    //Metodo que sustituye los valores repetidos por 0
    public static void sustituirRepetidos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean repetido = false;
        }
        int i = 0;
        
        //Comprobamos si el valor aparece en otra posición
        for (int j = 0; j < array.length; j++) {
            if(i != j && array[i] == array[j]) {
                boolean repetido = true;
                break;
            }
        }
        boolean repetido = false;
        
        //Si lo esta, lo ponemos a 0
        if(repetido) {
            array[i] = 0;
        }
    }
}
