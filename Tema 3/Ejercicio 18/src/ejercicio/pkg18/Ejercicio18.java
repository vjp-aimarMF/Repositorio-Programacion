/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final String contraseña = "todos1234"; // Puedes cambiar esta contraseña por la que desees
        String intento;
        int intentos = 0;
        
        // Bucle que se ejecuta al menos una vez
        do {
            System.out.print("Introduce la contraseña: ");
            intento = entrada.nextLine(); // Leemos la contraseña introducida por el usuario
            intentos++; // Contamos el intento
            
            // Si la contraseña es correcta, damos la enhorabuena y salimos del bucle
            if (intento.equals(contraseña)) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        } while (intentos < 3); // Se repite mientras no se hayan hecho 3 intentos

        // Si se han agotado los intentos sin éxito
        if (!intento.equals(contraseña)) {
            System.out.println("Error de acceso: Has superado el número de intentos permitidos.");
        }
    }
    
}
