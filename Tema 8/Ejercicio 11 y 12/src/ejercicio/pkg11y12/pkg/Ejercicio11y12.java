/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11y12.pkg;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11y12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Mueble[] muebles = new Mueble[4];
        
        for(int i = 0; i < muebles.length; i++) {
            muebles[i] = new Mueble();
        }
        
        int opcion;
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion) {
                case 1:
                    System.out.println("--- RELLENAR MUEBLES ---");
                    for(int i = 0; i < muebles.length; i++) {
                        System.out.println("Mueble " + (i + 1) + ":");
                        
                        System.out.println("Descripcion: ");
                        String descripcion = entrada.nextLine();
                        
                        System.out.println("Precio: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();
                        
                        muebles[i].setDescripcion(descripcion);
                        muebles[i].setPrecio(precio);
                    }
                    System.out.println("Muebles rellenados correctamente");
                    break;
                    
                case 2:
                    System.out.println("--- MOSTRAR MUEBLES ---");
                    for(int i = 0; i < muebles.length; i++) {
                        System.out.println("Mueble " + (i + 1) + ": " + muebles[i]);
                    }
                    break;
                    
                case 3:
                    System.out.println("Introduzca un precio maximo: ");
                    double precioMax = entrada.nextDouble();
                    
                    System.out.println("--- MUEBLES CON PRECIO <= " + precioMax + " ---");
                    for(int i = 0; i < muebles.length; i++) {
                        if(muebles[i].getPrecio() <= precioMax) {
                            System.out.println(muebles[i]);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
            }
        } while(opcion != 4);
    }
}
