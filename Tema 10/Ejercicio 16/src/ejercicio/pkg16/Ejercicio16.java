/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n===== TIENDA DE DEPORTES =====");
            System.out.println("1. Menú de Administración");
            System.out.println("2. Menú de Compra");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    menuAdministracion();
                    break;
                case 2:
                    menuCompra();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
    
    //MENÚ ADMINISTRACIÓN
    public static void menuAdministracion() {
        int opcion;
        
        do{
            System.out.println("\n--- MENÚ DE ADMINISTRACIÓN ---");
            System.out.println("1. Introducir producto");
            System.out.println("2. Visualizar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    visualizarProductos();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
    
    //Métodos
    public static void introducirProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Precio: ");
        float precio = entrada.nextFloat();
        
        System.out.println("Stock: ");
        int stock = entrada.nextInt();
        
        entrada.nextLine();
        
        productos.add(new Producto(nombre, precio, stock));
        System.out.println("Producto añadido correctamente.");
    }
    
    public static void visualizarProductos() {
        if(productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
            return;
        }
        
        System.out.println("--- LISTA DE PRODUCTOS ---");
        for(int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }
    
    public static void eliminarProducto() {
        System.out.println("Introduce el nombre del producto a eliminar: ");
        String nombre = entrada.nextLine();
        
        for(int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                System.out.println("Producto eliminado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    
    //MENÚ COMPRA
    public static void menuCompra() {
        int opcion;
        
        do {
            System.out.println("--- MENÚ DE COMPRA ---");
            System.out.println("1. Comprar productos");
            System.out.println("2. Volver");
            System.out.println("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion) {
                case 1:
                    comprarProductos();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 2);
    }
    
    //Métodos
    public static void comprarProductos() {
        if(productos.isEmpty()) {
            System.out.println("No hay productos disponibles para comprar.");
            return;
        }
        
        float totalCompra = 0;
        boolean seguirComprando = true;
        
        do {
            System.out.println("PRODUCTOS DISPONIBLES");
            for(int i = 0; i < productos.size(); i++) {
                System.out.println((i + 1) + ". " + productos.get(i));
            }
            
            System.out.println("Elige el número del producto a comprar: ");
            int opcion = entrada.nextInt() -1;
            
            if(opcion < 0 || opcion >= productos.size()) {
                System.out.println("Opción no válida.");
                continue; //sirve para volver al inicio del bucle 
                               //cuando el usuario elige un número de producto inválido.
            }
            
            Producto p = productos.get(opcion);
            
            System.out.println("¿Cuántas unidades deseas?");
            int unidades = entrada.nextInt();
            
            if(unidades > p.getStock()) {
                System.out.println("No hay suficiente stock. Quedan " + p.getStock() + " unidades.");
            } else {
                p.setStock(p.getStock() - unidades);
                float subtotal = unidades * p.getPrecio();
                totalCompra += subtotal;
                System.out.println("Producto añadido. Subtotal: " + subtotal + "€");
            }
            
            System.out.println("¿Deseas comprar otro producto? (s/n)");
            entrada.nextLine();
            seguirComprando = entrada.nextLine().equalsIgnoreCase("s");
        } while(seguirComprando);
        
        System.out.println("IMPORTE TOTAL DE LA COMPRA: " + totalCompra + "€");
    }
    
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<>();
}
