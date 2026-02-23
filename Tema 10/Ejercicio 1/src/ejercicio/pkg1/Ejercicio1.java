/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList<>();
       
       //Métodos:
       rellenarLista(nombres);
       mostrarLista(nombres);
    }
    
    //Método para rellenar la lista
    public static void rellenarLista(ArrayList<String> lista) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce el nombre de la persona: ");
            String nombre = entrada.nextLine();
            lista.add(nombre);
            
            System.out.println("Quieres poner otro nombre? y/n: ");
            respuesta = entrada.nextLine();
        } while(respuesta.equalsIgnoreCase("y"));
    }
    
    //Método para mostrar la lista por pantalla
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("Lista de personas: ");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
