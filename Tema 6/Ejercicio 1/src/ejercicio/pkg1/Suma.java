/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora{
    //Atributos
    private double sumando;
    double resultado = getNumero() + this.sumando;
    // Constructor por defecto
    public Suma() {
        super();
        this.sumando = 0;
    }

    // Constructor parametrizado
    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    // Getters y Setters
    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }

    //Método abstracto
    @Override
    public void realizarOperacion() {
        double resultado = this.sumando;
        System.out.println("Resultado de la suma: " + resultado);
    }

    //Método toString
    @Override
    public String toString() {
        return "sumando = " +  this.sumando;
    }
}
