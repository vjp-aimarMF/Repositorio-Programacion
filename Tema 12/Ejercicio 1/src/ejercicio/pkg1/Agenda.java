/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Agenda {
    private String nombre;
    private int edad;
    private String numeroMovil;

    public Agenda(String nombre, int edad, String numeroMovil) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMovil = numeroMovil;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", edad=" + edad + ", numeroMovil=" + numeroMovil + '}';
    }
    
    
}
