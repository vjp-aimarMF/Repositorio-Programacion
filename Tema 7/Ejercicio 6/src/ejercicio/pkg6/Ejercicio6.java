/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[80];
        int contador = 0;
        int numero = 1;
        
        //Rellenar el array con los 80 primeros numeros primos
        while(contador < primos.length) {
            if(esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        
        //Para mostrar el contenido del array
        System.out.println("Contenido de un array unidimensional de 80 posiciones con numeros primos:");
        for(int i = 0; i < primos.length; i++) {
            System.out.print("[" + i + "] = " + primos[i] + ";");
            if (i < primos.length - 1);
        }
    }
    
    //Método para comprobar si es primo
    public static boolean esPrimo(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
