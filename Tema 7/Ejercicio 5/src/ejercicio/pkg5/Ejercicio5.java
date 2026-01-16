/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][2];
        
        rellenarMatriz(matriz);
        mostrarArray(matriz);
        
        System.out.println("Mayor: " + mayorArray(matriz));
        System.out.println("Menor: " + menorArray(matriz));
        System.out.println("Suma total: " + sumaArray(matriz));
    }
    
    //Metodo para introducir los valores
    public static void rellenarMatriz(int[][] matriz) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Pon los valores para la matriz 4x2: ");
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Metodo para mostrar el array
    public static void mostrarArray(int[][] matriz) {
        System.out.println("Matriz introducida:");
        System.out.println("-------------------");
        
        for(int i = 0; i < matriz.length; i++) {
            System.out.println("| ");
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------");
    }
    
    //Metodo para calcular el mayor
    public static int mayorArray(int[][] matriz) {
        int max = matriz[0][0];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }
    
    //Metodo para calcular el menor
    public static int menorArray(int[][] matriz) {
        int min = matriz[0][0];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        return min;
    }
    
    //Metodo para calcular la suma
    public static int sumaArray(int[][] matriz) {
        int total = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }
}
