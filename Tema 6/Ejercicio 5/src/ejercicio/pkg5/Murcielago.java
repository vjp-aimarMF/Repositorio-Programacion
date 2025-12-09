/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg5;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
    private int alturaVuelo;

    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }

    @Override
    public String obtenerMensajeVolador() {
        return "El murcielago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        this.alturaVuelo += 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        if (alturaVuelo >= 5) {
            alturaVuelo -= 5;
        }
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("Altura de vuelo: " + this.alturaVuelo + " metros");
    }

    //metodo toString
    @Override
    public String toString() {
        return super.toString() + "Murcielago: " + "alturaVuelo=" + this.alturaVuelo;
    }
}
