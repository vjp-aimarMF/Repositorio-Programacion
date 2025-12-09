/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona{
    //Atributo
    private String especialidad;
    
    //Constructores
    public Profesor() {
        super();
        this.especialidad = "";
    }
    
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //Getters y setters
     public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Métodos
    @Override
    public String Saludar() {
        return "Hola, soy el profesor " + getNombre() + 
               " y soy de la especialidad de " + this.especialidad;
    }

    //Método toString
    @Override
    public String toString() {
        return "nombre = " + getNombre() + ", especialidad = " + this.especialidad;
    }
}
