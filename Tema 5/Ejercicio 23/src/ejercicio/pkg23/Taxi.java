/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg23;

/**
 *
 * @author alumno
 */
public class Taxi extends Vehiculo{
    private String numeroLicencia;

   // Constructor con parámetros
    public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    // Getter y setter
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    // Mostrar información completa
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de licencia: " + numeroLicencia);
    }
}
