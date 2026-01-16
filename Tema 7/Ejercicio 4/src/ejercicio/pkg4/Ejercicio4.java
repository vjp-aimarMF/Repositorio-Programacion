/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        
        //Matriz completa
        System.out.println("Matriz generada: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        mostrarPares(matriz);
    }
    
    // Método para un array 4x3 con números aleatorios entre 100 y 200
    public static int[][] generarMatriz() {
        int[][] matriz = new int[4][3];
        
        for(int i = 0; i < matriz.length; i++) {            //Filas
            for (int j = 0; j < matriz[i].length; j++) {    //Columnas
            matriz[i][j] = (int)(Math.random() * 101) + 100; //Genera valores entre 0 y 100, 100 y 200
                 }
            }
         return matriz;
        }
    
    //Método para los numeros pares el array
    public static void mostrarPares(int[][] matriz) {
        System.out.println("Numeros pares en la matriz:");
        
        for(int i = 0; i < matriz.length; i++) {        //Filas
            for(int j = 0; j < matriz[i].length; j++) { //Columnas
                int numero = matriz[i][j];
                if(numero % 2 == 0) {
                    System.out.println(numero + " ");
                }
            }
        }
        System.out.println();
    }
}
