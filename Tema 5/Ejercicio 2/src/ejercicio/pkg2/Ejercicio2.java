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
        // Crear primer curso
        Curso curso1 = new Curso();
        curso1.establecerNombreyHoras("Programación en Java", 40);
        Curso.sumarCursos(); // Incrementamos el contador

        // Crear segundo curso
        Curso curso2 = new Curso();
        curso2.establecerNombreyHoras("Administración de Sistemas", 30);
        Curso.sumarCursos(); // Incrementamos el contador

        // Mostrar datos de los cursos
        System.out.println("Curso 1: " + curso1.obtenerNombre() + 
                           " - Horas: " + curso1.obtenerHoras());
        System.out.println("Curso 2: " + curso2.obtenerNombre() + 
                           " - Horas: " + curso2.obtenerHoras());

        // Mostrar número total de cursos creados
        System.out.println("Número de cursos creados: " + Curso.verNumeroCursos());
    }
    
}
    

