/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Asignatura {
    private String nombre;
    private double nota;
    
    //Constructores
    //Por defecto
    public Asignatura() {
        this.nombre = "";
        this.nota = 0.0;
    }
    
    //Parametrizado
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Asignatura: " + nombre + 
                  " | Nota: " + nota;
    }
}
