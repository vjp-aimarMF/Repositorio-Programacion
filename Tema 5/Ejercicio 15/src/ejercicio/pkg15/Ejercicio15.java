/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 3 direcciones
        Direccion dir1 = new Direccion("Avenida España", 12, 3, "Plasencia");
        Direccion dir2 = new Direccion("Calle Mayor", 45, 1, "Cáceres");
        Direccion dir3 = new Direccion("Gran Vía", 100, 7, "Madrid");

        // Crear 3 empleados con sus direcciones
        Empleado emp1 = new Empleado("Aimar Moreno Fuentes", 1500, dir1);
        Empleado emp2 = new Empleado("Asier Martín Jiménez", 1800, dir2);
        Empleado emp3 = new Empleado("Ángel Vegas López", 2000, dir3);

        // Mostrar datos de cada empleado
        System.out.println("EMPLEADO 1:");
        emp1.mostrarDatos();

        System.out.println("EMPLEADO 2:");
        emp2.mostrarDatos();

        System.out.println("EMPLEADO 3:");
        emp3.mostrarDatos();
    }
    
}
