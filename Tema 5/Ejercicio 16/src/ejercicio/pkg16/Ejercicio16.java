/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Crear 3 objetos Alumno
        Alumno alumno1 = crearAlumno(entrada);
        Alumno alumno2 = crearAlumno(entrada);
        Alumno alumno3 = crearAlumno(entrada);
        
        //Imprimir los objetos
        System.out.println(alumno1);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
    
    // Método para mostrar estado del alumno
    public void mostrarEstado() {
        System.out.println(this.toString());
    }
    // Método auxiliar para crear un alumno pidiendo datos al usuario
    private static Alumno crearAlumno(Scanner entrada) {
        System.out.println("Introduce el nombre del alumno: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce la nota (0-10): ");
        int nota = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        return new Alumno(nombre, nota);
    }
}
