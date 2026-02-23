/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        introducirDatos(numeros);
        System.out.println("Lista original: ");
        mostrarDatos(numeros);
        
        intercambiarDatos(numeros);
        System.out.println("Lista despues del intercambio: ");
        mostrarDatos(numeros);
    }
    
    //Método para introducir datos
    public static void introducirDatos(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce un numero entero: ");
            int num = entrada.nextInt();
            lista.add(num);
            
            System.out.println("Quieres cambiar de numero? y/n: ");
            respuesta = entrada.next();
        } while(respuesta.equalsIgnoreCase("y"));
    }
    
    //Metodo para mostrar datos
    public static void mostrarDatos(ArrayList<Integer> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println("Posicion " + (i + 1) + ": " + lista.get(i));
        }
    }
    
    //Método para intercambiar la 2ª y 4ª posición
    public static void intercambiarDatos(ArrayList<Integer> lista) {
        if(lista.size() >= 4) {
            int aux = lista.get(1);
            lista.set(1, lista.get(3));
            lista.set(3, aux);
        } else {
            System.out.println("No se puede realizar el intercambio: se necesitan al menos 4 numeros.");
        }
    }
}
