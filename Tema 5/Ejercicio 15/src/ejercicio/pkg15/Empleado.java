/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg15;

/**
 *
 * @author alumno
 */
public class Empleado {
     // Atributos privados
    private String nombre;
    private int salario;
    private Direccion direccion; // Composición: un empleado tiene una dirección

    //Por defecto
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion(); 
    }
    
    // Constructor para inicializar el empleado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Dirección:");
        System.out.println("  Calle: " + direccion.getCalle());
        System.out.println("  Número: " + direccion.getNumero());
        System.out.println("  Piso: " + direccion.getPiso());
        System.out.println("  Ciudad: " + direccion.getCiudad());
        System.out.println("-----------------------------------");
    }
}
