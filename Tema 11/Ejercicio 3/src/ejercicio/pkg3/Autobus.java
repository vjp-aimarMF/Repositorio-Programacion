/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public class Autobus {
    private String matricula;
    private HashMap<String, String> conductores; //DNI -> Nombre

    //Por defecto
    public Autobus(String matricula) {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    
    //Parametrizado
    public Autobus(String matricula, HashMap<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }

    //Getters
    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }
    
    //Setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }

    //Método
    public void addConductor(String dni, String nombre) {
        conductores.put(dni, nombre);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrícula: ").append(matricula).append("\n");
        sb.append("Conductores:\n");
        for (String dni : conductores.keySet()) {
            sb.append(" - ").append(dni).append(": ").append(conductores.get(dni)).append("\n");
        }
        return sb.toString();
    }
}
