/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg19;

/**
 *
 * @author alumno
 */
public class Empleado {
     // Atributos privados
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
     // Constructor: el usuario introduce los datos al crear el objeto
    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    // Método para calcular el sueldo bruto
    public double calcularSueldoBruto() {
        if (horasTrabajadas <= 40) {
            // Si trabajó 40 horas o menos → tarifa normal
            return horasTrabajadas * tarifaHora;
        } else {
            // Si trabajó más de 40 horas → 40 horas normales + extras a tarifa y media
            int horasExtra = horasTrabajadas - 40;
            return (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }
    
     // Método para mostrar los datos del empleado
   @Override
    public String toString() {
        return nombre + " trabaja " + horasTrabajadas + " horas, cobra " 
               + tarifaHora + " euros/hora, por lo que le corresponde un sueldo de " 
               + calcularSueldoBruto() + " euros";
    }
}
