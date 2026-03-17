/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vector con los meses del año
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        //Mapas
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        //Insertamos los meses del revés:
        int numeroMes = 12;
        for(int i = meses.length -1; i >= 0; i--) {
            linkedHashMap.put(numeroMes, meses[i]);
            treeMap.put(numeroMes, meses[i]);
            numeroMes--;
        }
        
        System.out.println("LinkedHashMap:");
        linkedHashMap.forEach((k,v) -> System.out.println(k + " -> " + v));
        
        System.out.println("\nTreeMap:");
        treeMap.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
    
}
