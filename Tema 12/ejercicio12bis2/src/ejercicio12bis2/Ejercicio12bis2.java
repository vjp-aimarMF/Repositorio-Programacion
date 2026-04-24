/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12bis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] cadenas = new String[4];
        
        //Rellenar el array con datos del usuario
        System.out.println("Introduce 4 cadenas de texto: ");
        for(int i = 0; i < cadenas.length; i++) {
            System.out.println("Cadena: " + (i + 1) + ": ");
            cadenas[i] = entrada.nextLine();
        }
        
        System.out.println("Nombre del archivo de salida: ");
        String nombreArchivo = entrada.nextLine();
        
        try{
            escribirCadenasEnArchivo(cadenas, nombreArchivo);
            System.out.println("Archivo creado correctamente.");
        } catch(IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
    
    //Método escribir cadenas en archivo
    public static void escribirCadenasEnArchivo(String[] cadenas, String nombreArchivo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        
        for(int i = 0; i < cadenas.length; i++) {
            bw.write(cadenas[i]);
            if(i < cadenas.length - 1) {
                bw.write("*"); //separador
            }
        }
    }
}
