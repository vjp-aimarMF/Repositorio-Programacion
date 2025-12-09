/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

/**
 *
 * @author alumno
 */
public class Mamifero {
    //atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    //Constructor por defecto
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    
     // Constructor parametrizado
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    // Getters y Setters
    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public String getSexo() { 
        return sexo; 
    }
    
    public void setSexo(String sexo) { 
        this.sexo = sexo;
    }

    public String getColor() {
        return color; 
    }
    
    public void setColor(String color) { 
        this.color = color; 
    }

    public int getEdad() { 
        return edad; 
    }
    
    public void setEdad(int edad) { 
        this.edad = edad; 
    }

    //metodo toString
    @Override
    public String toString() {
        return "Mamifero:" + "nombre=" + nombre + ", sexo=" + sexo + 
               ", color=" + color + ", edad=" + edad;
    }
}

// Interfaz Oviparo
interface Oviparo {
    String obtenerMensajeOviparo();
    void ponerHuevo();
    void incubarHuevo();
    void mostrarNumHuevos();
}

// Interfaz Volador
interface Volador {
    String obtenerMensajeVolador();
    void aumentarAlturaVuelo();
    void bajarAlturaVuelo();
    void mostrarAlturaVuelo();
}
