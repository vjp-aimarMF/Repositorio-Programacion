/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int opcion;
       int[] ventas = new int[12];
        String[] meses = {
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

       do{
           mostrarMenu();
           System.out.println("Seleccione una opcion: ");
           opcion = entrada.nextInt();
           
           switch(opcion) {
               case 1:  
                   rellenarVentas(ventas);
                   break;
               
               case 2:
                   mostrarVentas(ventas, meses);
                   break;
               
               case 3:
                   mostrarVentasReves(ventas, meses);
                   break;
                   
               case 4:
                   sumaTotal(ventas);
                   break;
                   
               case 5:
                   mostrarMesesPares(ventas, meses);
                   break;
                   
               case 6:
                   mostrarMesMayorVenta(ventas, meses);
                   break;
                   
               case 7:
                   System.out.println("Saliendo del programa...");
                   break;
                   
               default:
                   System.out.println("Opcion no valida. Por favor, intentelo de nuevo.");
           }
           
           System.out.println();
       } while(opcion != 7);       
    }
    
    //Mostranos el menu
    public static void mostrarMenu() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. Rellenar ventas mensuales (aleatorios entre 10 y 100)");
        System.out.println("2. Mostrar ventas mensuales");
        System.out.println("3. Mostrar ventas al reves");
        System.out.println("4. Mostrar suma total de ventas del ano");
        System.out.println("5. Mostrar ventas de meses pares");
        System.out.println("6. Mostrar el mes con mas ventas");
        System.out.println("7. Salir");
    }
     
    //Rellenamos con numeros aleatorios (10-100)
    public static void rellenarVentas(int[] ventas) {
        for(int i=0; i < ventas.length; i++) {
            ventas[i] = (int)(Math.random() * 91) + 10; //entre 10 y 100
        }
        System.out.println("Ventas generadas sin problema");
    }
    
    //Mostramos ventas
    public static void mostrarVentas(int[] ventas, String[] meses) {
        System.out.println("Ventas mensuales: ");
        
        for(int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    //Mostramos al reves
    public static void mostrarVentasReves(int[] ventas, String[] meses) {
        System.out.println("Ventas mensuales al reves: ");
        
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    //Suma total del año
    public static void sumaTotal(int[] ventas) {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        System.out.println("Suma total de ventas del ano: " + suma);
    }
    
    //Suma de meses pares (1, 3, 5, ...)
    public static void mostrarMesesPares(int[] ventas, String[] meses) {
        int suma = 0;
        System.out.println("Ventas de meses pares: ");
        
        for (int i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
            suma += ventas[i];
        }
        System.out.println("Total meses pares: " + suma);
    }
    
    //Mes con mas ventas
    public static void mostrarMesMayorVenta(int[] ventas, String[] meses) {
        int max = ventas[0];
        int indiceMax = 0;
        
        for(int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                indiceMax = i;
            }
        }
        
        System.out.println("Mes con más ventas: " + meses[indiceMax] + " (" + max + " coches)");
    }
}
