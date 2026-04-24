/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String entrada = "frase.txt";
        String salida = "fraseinvertida.txt";
        
        try{
            String texto = leerArchivo(entrada);
            String invertido = invertirTexto(texto);
            escribirArchivo(salida, invertido);
            
            System.out.println("Archivo invertido creado correctamente.");
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
    public static String leerArchivo(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea = br.readLine();
        
        return linea != null ? linea : "";
    }

    // Invierte el texto recibido
    public static String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    // Escribe el texto invertido en un nuevo archivo
    public static void escribirArchivo(String nombreArchivo, String contenido) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
        bw.write(contenido);
        bw.close();
    }
}

    
