/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg16;

/**
 *
 * @author alumno
 */
public class Alumno {
    //Ponemos atributos
    private String nombre;
    private int nota;
    
    //Constructores por defecto
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }
    
    //Constructores parametrizados
    public Alumno (String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getter y setter para nombre
    public String getNombre() {
        return this.nombre;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
     }
     
     //Getter y setter para nota
     public int getNota() {
        return this.nota;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    // Método para obtener la calificación textual
    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Error: la nota debe estar entre 0 y 10";
        }
    }
    
    // Método toString sobrescrito
    @Override
    public String toString() {
        
        return "El nombre es: " + this.nombre + 
                " la nota es: " + this.nota + 
                " la calificación es: " + obtenerCalificacion();  
    }

   
}
