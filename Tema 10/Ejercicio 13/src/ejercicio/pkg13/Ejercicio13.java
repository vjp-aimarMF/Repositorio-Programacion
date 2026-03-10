/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Venta> listaVentas = new ArrayList<>();
        String[] meses =  {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();

            while (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Introduce un número entre 1 y 6:");
                opcion = entrada.nextInt();
            }

            switch (opcion) {
                case 1:
                    introducirVentas(listaVentas, meses, entrada);
                    break;

                case 2:
                    mostrarVentas(listaVentas);
                    break;

                case 3:
                    mostrarSumaTotal(listaVentas);
                    break;

                case 4:
                    mostrarVentasConA(listaVentas);
                    break;

                case 5:
                    mostrarMesConMasVentas(listaVentas);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
            }

        } while (opcion != 6);
    }
    
     //Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("---- MENÚ DE OPCIONES ----");
        System.out.println("1. Introducir ventas de los meses del año");
        System.out.println("2. Mostrar ventas introducidas");
        System.out.println("3. Mostrar suma total del año");
        System.out.println("4. Mostrar ventas de meses con 'a' ");
        System.out.println("5. Mostrar el mes con más ventas");
        System.out.println("6. Salir");
        System.out.println("Elige una opción (1-6): ");
    }
    
    //Método para introducir las ventas
    public static void introducirVentas(ArrayList<Venta> listaVentas, String[] meses, Scanner entrada) {
        listaVentas.clear(); //Reinicia por si ya habia datos
        
        for(int i = 0; i < meses.length; i++) {
            System.out.println("Introduce ventas de " + meses[i] + ": ");
            int v = entrada.nextInt();
            listaVentas.add(new Venta(meses[i], v));
        }
        
        System.out.println("Ventas registradas correctamente.");
    }
    
    //Mostrar ventas introducidas
    public static void mostrarVentas(ArrayList<Venta> listaVentas) {
        if (listaVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
            return;
        }

        System.out.println("\n--- Ventas introducidas ---");
        for (Venta v : listaVentas) {
            System.out.println(v.getMes() + ": " + v.getVentas());
        }
    }
    
    //Mostrar suma total del año
    public static void mostrarSumaTotal(ArrayList<Venta> listaVentas) {
        int suma = 0;

        for (Venta v : listaVentas) {
            suma += v.getVentas();
        }

        System.out.println("Suma total de ventas del año: " + suma);
    }
    
    //Mostrar ventas de meses que empiezan por 'a'
    public static void mostrarVentasConA(ArrayList<Venta> listaVentas) {
        int sumaA = 0;

        for (Venta v : listaVentas) {
            if (v.getMes().startsWith("a")) {
                sumaA += v.getVentas();
            }
        }

        System.out.println("Ventas de meses que empiezan por 'a': " + sumaA);
    }
    
    //Mostrar el mes con más ventas
    public static void mostrarMesConMasVentas(ArrayList<Venta> listaVentas) {
        if (listaVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
            return;
        }

        Venta max = listaVentas.get(0);

        for (Venta v : listaVentas) {
            if (v.getVentas() > max.getVentas()) {
                max = v;
            }
        }

        System.out.println("Mes con más ventas: " + max.getMes() + " (" + max.getVentas() + ")");
    }
}
