/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg24;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicita las notas de las seis asignaturas
        System.out.println("Por favor, introduzca la nota de Programación: ");
        double programacion = entrada.nextDouble();

        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        double lenguajes = entrada.nextDouble();

        System.out.println("Introduzca la nota de Bases de Datos: ");
        double basesDatos = entrada.nextDouble();

        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        double entornos = entrada.nextDouble();

        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        double sistemas = entrada.nextDouble();

        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        double fol = entrada.nextDouble();

        // Calcula la media
        double media = (programacion + lenguajes + basesDatos + entornos + sistemas + fol) / 6;

        // Muestra el resultado
        System.out.println("Su nota media del curso es de: " + media);
    }
    
}
