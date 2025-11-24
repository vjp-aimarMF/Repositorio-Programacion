/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg23;

/**
 *
 * @author alumno
 */
public class Autobus extends Vehiculo{
   private int numeroPlazas;
   
    // Constructor con parámetros
    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    // Getter y setter
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    // Mostrar información completa
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de plazas: " + numeroPlazas);
    }
}
