/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] nombresAsignaturas = {
            "Programacion", 
            "Lenguajes de Marcas", 
            "Bases de Datos", 
            "Entornos de Desarrollo", 
            "Sistemas Informaticos", 
            "Formacion y Orientacion Laboral"
        };
        
        Asignatura[] asignaturas = new Asignatura[6];
        
        for(int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduzca la nota de " + nombresAsignaturas[i] + ": ");
            double nota = entrada.nextDouble();
            
            asignaturas[i] = new Asignatura(nombresAsignaturas[i], nota);
        }
        
        double media = calcularMedia(asignaturas);
        
        System.out.println("La nota media del curso es: " + media);
        
        //Mostrar todas las asignaturas con toString()
        System.out.println("Resumen de asignaturas:");
        for(int i = 0; i < asignaturas.length; i++) {
            System.out.println(asignaturas[i]);
        }
    }
    
    public static double calcularMedia(Asignatura[] asignaturas) {
        double suma = 0;
        
        for(int i = 0; i < asignaturas.length; i++) {
            suma += asignaturas[i].getNota();
        }
        
        return suma / asignaturas.length;
    }
}
