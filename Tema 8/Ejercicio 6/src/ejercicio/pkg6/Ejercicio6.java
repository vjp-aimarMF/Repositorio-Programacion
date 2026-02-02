/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce cuantos empleados desea meter: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        
        Empleado[] empleados = new Empleado[cantidad];
        
        for(int i = 0; i < cantidad; i++) {
            System.out.println("Empleado " + (i + 1));
            
            System.out.println("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();
            
            System.out.println("Cuantas horas ha trabajado este mes? ");
            int horas = entrada.nextInt();
            
            System.out.println("Cual es su tarifa por hora de trabajo? ");
            double tarifa = entrada.nextDouble();
            entrada.nextLine();
            
            empleados[i] = new Empleado(nombre, horas, tarifa);
            
            System.out.println("Datos almacenados con exito");
        }
        
        System.out.println("Sueldo bruto de los empleados: ");
        for(int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);
        }
    } 
}
