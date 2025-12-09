/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

/**
 *
 * @author alumno
 */
public abstract class FiguraGeometrica {
    //Atributos
    private String color;
    
    //Constructores
    public FiguraGeometrica() {
        this.color = "";
    }
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    //Getters y setters
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    //Métodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    //Método toString
    @Override
    public String toString() {
        return "color = " + color;
    }
}
