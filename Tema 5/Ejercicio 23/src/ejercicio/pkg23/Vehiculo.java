/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg23;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private int potenciaCV;

    // Constructor con parámetros
    public Vehiculo(String matricula, String modelo, int potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    // Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia (CV): " + potenciaCV);
    }
}
