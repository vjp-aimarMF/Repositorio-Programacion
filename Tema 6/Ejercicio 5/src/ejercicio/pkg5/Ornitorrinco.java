/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    //Atributos
     private int numHuevos;

    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamifero oviparo";
    }

    @Override
    public void ponerHuevo() {
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        if (numHuevos > 0) {
            numHuevos--;
        }
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("Numero de huevos: " + this.numHuevos);
    }

    //metodo toString
    @Override
    public String toString() {
        return super.toString() + "Ornitorrinco: " + "numHuevos= " + this.numHuevos;
    }
}
