/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String nombreDonante;
    private double cantidad;

    public Donacion() {
        this.nombreDonante = "";
        this.cantidad = 0;
    }
    
    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Donacion{" + "nombreDonante=" + nombreDonante + ", cantidad=" + cantidad + '}';
    }
}
