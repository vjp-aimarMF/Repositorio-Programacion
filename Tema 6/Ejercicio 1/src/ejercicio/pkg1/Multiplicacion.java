/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora{
    //atributos
    private double multiplicador; 
    
     // Constructor por defecto
    public Multiplicacion() {
        super();
        this.multiplicador = 1;
    }

    // Constructor parametrizado
    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    // Getters y Setters
    public double getMultiplicador() {
        return this.multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    //Método abstracto
    @Override
    public void realizarOperacion() {
        double resultado =  getNumero() *  this.multiplicador;
        System.out.println("Resultado de la multiplicación: " + resultado);
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + ", multiplicador = " +  this.multiplicador;
    }
}
