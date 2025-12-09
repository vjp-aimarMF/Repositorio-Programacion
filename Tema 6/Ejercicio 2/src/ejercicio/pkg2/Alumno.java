/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{
    //Atributos
    private String grupo;
    
    //Constructores
     public Alumno() {
        super();
        this.grupo = "";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }
    
    //Getters y setters
    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    //Método
    @Override
    public String Saludar() {
        return "Hola, soy el alumno " + getNombre() + 
               " y estoy en el grupo de " + grupo;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "nombre = " + getNombre() + ", grupo = " + grupo;
    }
}
