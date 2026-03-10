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
        
        String[] meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        int[] ventas = new int[12];
        boolean ventasIntroducidas = false;
        
        int opcion = 0;
        
        while(opcion != 7) {
            mostrarMenu();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> introducirVentas(ventas, meses, ventasIntroducidas, entrada); 
                case 2 -> mostrarVentas(ventas, meses, ventasIntroducidas); 
                case 3 -> mostrarVentasReves(ventas, meses, ventasIntroducidas); 
                case 4 -> mostrarSumaTotal(ventas, ventasIntroducidas); 
                case 5 -> mostrarVentasConA(ventas, meses, ventasIntroducidas); 
                case 6 -> mostrarMesesMaxVentas(ventas, meses, ventasIntroducidas); 
                case 7 -> System.out.println("Saliendo del programa..."); 
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    
    //Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("---- MENÚ DE OPCIONES ----");
        System.out.println("1. Introducir ventas de los 12 meses");
        System.out.println("2. Mostrar ventas introducidas");
        System.out.println("3. Mostrar ventas al revés");
        System.out.println("4. Mostrar suma total del año");
        System.out.println("5. Mostrar ventas de meses con 'a'");
        System.out.println("6. Mostrar mes o meses con más ventas");
        System.out.println("7. Salir");
        System.out.println("Elige una opción (1-7): ");
    }
    
    public static void introducirVentas(int[] ventas, String[] meses, boolean ventasIntroducidas, Scanner entrada) {
        System.out.println("Introduce las ventas de cada mes:");
        
        for(int i = 0; i < 12; i++) {
            System.out.println("Ventas de " + meses[i] + ": ");
            ventas[i] = entrada.nextInt();
        }
        
        ventasIntroducidas = true;
    }
    
    //Metodo para mostrar las ventas
    public static void mostrarVentas(int[] ventas, String[] meses, boolean ventasIntroducidas) {
        System.out.println("Ventas introducidas: ");
        for(int i = 0; i < 12; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    //Metodo para mostrar las ventas al revés
    public static void mostrarVentasReves(int[] ventas, String[] meses, boolean ventasIntroducidas) {
        System.out.println("Ventas introducidas al revés: ");
        for(int i = 11; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }
    
    //Método para mostar la suma total
    public static void mostrarSumaTotal(int[] ventas, boolean ventasIntroducidas) {
       int suma = 0;
        for(int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        
        System.out.println("Suma total del año: " + suma);
    }
    
    //Método para mostrar las ventas totales de los meses cuyo nombre contenga la letra 'a'
    public static void mostrarVentasConA(int[] ventas, String[] meses, boolean ventasIntroducidas) {
        int totalA = 0;
        System.out.println("Meses con 'a': ");
        
        for(int i = 0; i < 12; i++) {
            if(meses[i].contains("a")) {
                System.out.println(meses[i] + ": " + ventas[i]);
                totalA += ventas[i];
            }
        }
        
        System.out.println("Total de ventas en meses con 'a': " + totalA);
    }
    
    //Método para mostrar el nombre del mes (o meses) con más ventas.
    public static void mostrarMesesMaxVentas(int[] ventas, String[] meses, boolean ventasIntroducidas) {
         int max = ventas[0];
         for(int i = 1; i < ventas.length; i++) {
             if(ventas[i] > max) {
                 max = ventas[i];
             }
         }
         
         System.out.println("El mes con más ventas (" + max + "):");
         
         for(int i = 0; i < ventas.length; i++) {
             if(ventas[i] == max) {
                 System.out.println(meses[i]);
             }
         }
    }
}
