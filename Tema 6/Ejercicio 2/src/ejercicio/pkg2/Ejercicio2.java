/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Ejecucion directa ===");
        Profesor profesor = new Profesor("Antonio", "Lenguaje de Marcas");
        Alumno alumno = new Alumno("Aimar", "1 DAW");

        System.out.println(profesor.Saludar());
        System.out.println(alumno.Saludar());

        System.out.println("\n=== Ejecucion con polimorfismo ===");
        Persona persona1 = new Profesor("Raul", "Entorno de Desarrollo");
        Persona persona2 = new Alumno("Aimar", "1 DAW");

        System.out.println(persona1.Saludar());
        System.out.println(persona2.Saludar());
    }
    
}
