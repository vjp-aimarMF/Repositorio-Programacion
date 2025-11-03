/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg25;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inicio = 17;
        int fin = 139;
        int suma = 0;
        
        // Recorremos desde el primer par mayor o igual a 17
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        // Mostrar el resultado
        System.out.println("La suma de los números pares entre " + inicio + " y " + fin + " es: " + suma);
    }
    
}
