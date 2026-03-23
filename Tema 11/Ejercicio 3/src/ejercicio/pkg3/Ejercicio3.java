/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
static    Scanner entrada = new Scanner(System.in);
static    Autobus[] darsenas = new Autobus[6];

    public static void main(String[] args) {
        
        int opcion;
        
        do {
            System.out.println("\n--- ESTACIÓN DE AUTOBUSES DE PLASENCIA ---");
            System.out.println("1. Aparcar autobús");
            System.out.println("2. Mostrar dársenas libres");
            System.out.println("3. Buscar autobús por matrícula");
            System.out.println("4. Buscar conductor por DNI");
            System.out.println("5. Autobús con más conductores");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> aparcarAutobus();
                case 2 -> mostrarDarsenasLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> autobusConMasConductores();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
            
        } while(opcion != 6);
    }
    
    public static void aparcarAutobus() {
        int pos;
        do {
            System.out.println("Introduce la posición (0-5): ");
            pos = entrada.nextInt();
            entrada.nextLine();
        } while(pos < 0 || pos > 5 || darsenas[pos] != null);
        
        System.out.print("Introduce matrícula del autobús: ");
        String matricula = entrada.nextLine();
        Autobus bus = new Autobus(matricula);

        System.out.print("¿Cuántos conductores quieres añadir? ");
        int numCond = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < numCond; i++) {
            System.out.print("DNI del conductor: ");
            String dni = entrada.nextLine();
            System.out.print("Nombre del conductor: ");
            String nombre = entrada.nextLine();
            bus.addConductor(dni, nombre);
        }

        darsenas[pos] = bus;
        System.out.println("Autobús aparcado correctamente.");
    }
    
    public static void mostrarDarsenasLibres() {
        System.out.println("Dársenas libres: ");
        for(int i = 0; i < darsenas.length; i++) {
            if(darsenas[i] == null) {
                System.out.println(" - Dársena " + i);
            }
        }
    }
    
    public static void buscarAutobus() {
        System.out.println("Introduce matrícula a buscar: ");
        String matBus = entrada.nextLine();
        
        for(Autobus a : darsenas) {
            if(a != null && a.getMatricula().equalsIgnoreCase(matBus)) {
                System.out.println("Autobús encontrado:");
                System.out.println(a);
                return;
            }
        }
        System.out.println("No existe ningún autobús con esa matrícula");
    }
    
    public static void buscarConductor() {
        System.out.println("Introduce DNI del conductor: ");
        String dniBuscado = entrada.nextLine();
        
        for(Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dniBuscado)) {
                System.out.println("El conductor está asignado al autobús con matrícula: " + a.getMatricula());
                return;
            }
        }
        System.out.println("No se ha encontrado ningún conductor con ese DNI.");
    }
    
    public static void autobusConMasConductores() {
        int max = -1;
        int posMax = -1;

        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int num = darsenas[i].getConductores().size();
                if (num > max) {
                    max = num;
                    posMax = i;
                }
            }
        }

        if (posMax != -1) {
            System.out.println("El autobús con más conductores está en la dársena " + posMax);
            System.out.println(darsenas[posMax]);
        } else {
            System.out.println("No hay autobuses aparcados.");
        }
    }
}
