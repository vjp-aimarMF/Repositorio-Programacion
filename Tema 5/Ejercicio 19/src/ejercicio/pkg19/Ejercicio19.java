/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear 3 empleados con datos introducidos por el usuario
        System.out.println("Introduce los datos del primer empleado:");
        System.out.print("Nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas1 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa1 = entrada.nextDouble();
        entrada.nextLine(); // limpiar buffer
        Empleado emp1 = new Empleado(nombre1, horas1, tarifa1);

        System.out.println("\nIntroduce los datos del segundo empleado:");
        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas2 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa2 = entrada.nextDouble();
        entrada.nextLine();
        Empleado emp2 = new Empleado(nombre2, horas2, tarifa2);

        System.out.println("\nIntroduce los datos del tercer empleado:");
        System.out.print("Nombre: ");
        String nombre3 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas3 = entrada.nextInt();
        System.out.print("Tarifa por hora: ");
        double tarifa3 = entrada.nextDouble();
        Empleado emp3 = new Empleado(nombre3, horas3, tarifa3);

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
    
}
