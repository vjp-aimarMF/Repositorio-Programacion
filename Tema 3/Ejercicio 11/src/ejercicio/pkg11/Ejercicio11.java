/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11;
/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bucle for que se repite desde i = 1 hasta i = 6
        
        for (int i = 1; i <= 6; i++) {
        
            //Imprime "Hola" seguido el número actual
            System.out.print("Hola" + i);
            
            // Si no es el último número, añade un separador " – "
            if (i < 6) {
                System.out.println(" - ");
            } else {
                //Si no es el último número, añade solo un guión final
                System.out.println(" -");
            }
        }
        
    }
    
}
