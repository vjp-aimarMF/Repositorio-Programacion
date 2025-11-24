/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author alumno
 */
public class Curso {
    //ATRIBUTOS
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos = 0; //Atributo estático para contar cursos creados
    
    //CONSTRUCTORES
    public void establecerNombreyHoras(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }
    
     // Método público para obtener el nombre
    public String obtenerNombre() {
        return nombre;
    }

    // Método público para obtener las horas
    public int obtenerHoras() {
        return numeroHoras;
    }

    // Método estático para incrementar el número de cursos
    public static void sumarCursos() {
        numeroDeCursos++;
    }

    // Método estático para ver el número de cursos creados
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
    
}
