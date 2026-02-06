/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg11y12.pkg;

/**
 *
 * @author alumno
 */
public class Mueble {
    private double precio;
    private String descripcion;
    
    //Constructor por defecto
    public Mueble() {
        this.precio = 0.0;
        this.descripcion = "";
    }
    
    //Constructor parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Metodo toString para mostrar informacion del objeto
    @Override
    public String toString() {
        return "Mueble: " + descripcion + " | Precio: " + precio + " euros";
    }
}
