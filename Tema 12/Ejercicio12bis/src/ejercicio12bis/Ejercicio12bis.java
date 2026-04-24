/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio12bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivo = "masnumeros.txt";
        
        try {
            double sumaTotal = sumarNumerosDelArchivo(archivo);
            System.out.println("La suma total de todos los numeros es: " + sumaTotal);
        } catch(IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    // Lee el archivo línea por línea y suma los números separados por ;
    public static double sumarNumerosDelArchivo(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        double suma = 0;
        
        while((linea = br.readLine()) != null) {
            suma += sumarNumerosDeLinea(linea);
        }
        
        return suma;
    }
    
    //Suma los números de una linea separados por ;
    public static double sumarNumerosDeLinea(String linea) {
        String[] partes = linea.split(";");
        double sumaLinea = 0;
        
        for(String num : partes) {
            if(!num.trim().isEmpty()) {
                sumaLinea += Double.parseDouble(num.trim());
            }
        }
        
        return sumaLinea;
    }
}
