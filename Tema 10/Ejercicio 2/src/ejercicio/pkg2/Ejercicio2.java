/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        rellenarLista(numeros);
        mostrarLista(numeros);
        
        System.out.println("Resultados: ");
        System.out.println("Mayor: " + calcularMayor(numeros));
        System.out.println("Menor: " + calcularMenor(numeros));
        System.out.println("Suma: " + calcularSuma(numeros));
    }
    
    //Método para introducir numeros hasta que sea negativo
    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Introduce numeros positivos (negativo para terminar): ");
        
        do {
            num = entrada.nextInt();
            if (num >= 0) {
                lista.add(num);
            }
        } while(num >= 0);
    }
    
    //Método para mostrar lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Elementos de la lista: ");
        
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    //Método para calcular el mayor
    public static int calcularMayor(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        
        for(int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }
    
    //Método para calcular el menor
    public static int calcularMenor(ArrayList<Integer> lista) {
        int menor = lista.get(0);
        
        for(int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        return menor;
    }
    
    //Método para calcular la suma
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        
        for(int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }
        return suma;
    }
}
