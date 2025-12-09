/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    //Atributos
    private double numero; 
    
    //Constructor por defecto
    public Calculadora() {
        this.numero = 0;
    }
    
    // Constructor parametrizado
    public Calculadora(double numero) {
        this.numero = numero;
    }
    
    // Getter y Setter
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    // Método abstracto
    public abstract void realizarOperacion();
    
     // Método toString
    @Override
    public String toString() {
        return "numero = " + this.numero;
    }
}
