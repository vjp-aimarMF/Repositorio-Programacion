/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        
        //Rellenar el vector con numeros aleatorios entre 10 y 80
        for(int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 71) + 10;
            // Math.random() → [0,1) 
            // *71 → [0,71) 
            // +10 → [10,80]
        }
        
        int mayor = vector[0];
        int menor = vector[0];
        double suma = 0;
        
        int[] frecuencia = new int[81];
        int repetido = vector[0];
        
        for(int i = 0; i < vector.length; i++) {
            int valor = vector[i];
            
            if(valor > mayor) mayor = valor;
            if(valor < menor) menor = valor;
            
            suma += valor;
            
            frecuencia[valor]++;
            if(frecuencia[valor] > frecuencia[repetido]) {
                repetido = valor;
            }
        }
        
        double media = suma / vector.length;
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Valor mas repetido: " + repetido + " (" + frecuencia[repetido] + " veces)");
        System.out.println("Media: " + media);
    }
    
}
