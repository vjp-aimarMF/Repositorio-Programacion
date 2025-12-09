/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    //Atributos
    private String nombre;
    
    
    //Constructores por defecto
    public Persona() {
        this.nombre = "";
    }
    
    //Constructor parametrizado
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters y setters
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método abstracto
    public abstract String Saludar();
    
    //Método toString
    @Override
    public String toString() {
        return "nombre = " + nombre;
    }
}
