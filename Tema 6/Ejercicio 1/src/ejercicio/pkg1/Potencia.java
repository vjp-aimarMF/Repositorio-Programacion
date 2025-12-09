/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora{
    //Atributos
    private int exponente;
    
     // Constructor por defecto
    public Potencia() {
        super();
        this.exponente = 1;
    }

    // Constructor parametrizado
    public Potencia(double numero, int exponente) {
        super(numero);
        this.exponente = exponente;
    }

    // Getters y Setters
    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    //Método abstracto
    @Override
    public void realizarOperacion() {
        double resultado = Math.pow(getNumero(), exponente);
        System.out.println("Resultado de la potencia: " + resultado);
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "exponente = " + this.exponente;
    }
}
