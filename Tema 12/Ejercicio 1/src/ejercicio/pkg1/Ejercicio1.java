/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Agenda> agenda = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Bienvenido a la Agenda Telefónica");
        
        do{
            System.out.println("\n=== AGENDA TELEFÓNICA ===");
            System.out.println("1. Añadir contactos a la agenda");
            System.out.println("2. Visualizar la lista de contactos");
            System.out.println("3. Eliminar contactos de la lista");
            System.out.println("4. Mostrar todos los contactos ordenados por su edad");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");
            
            try {
                String input = entrada.nextLine().trim();
                opcion = Integer.parseInt(input);
                
                switch(opcion) {
                    case 1:
                        anadirContacto(agenda);
                        break;
                    case 2:
                        visualizarLista(agenda);
                        break;
                    case 3:
                        eliminarContacto(agenda);
                        break;
                    case 4:
                        mostrarOrdenadosPorEdad(agenda);
                        break;
                    case 5:
                        System.out.println("Gracias por usar la agenda. Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Elige un número entre 1 y 5, por favor.");
                        break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Error: Debe introducir un número entero válido.");
                opcion = 0;
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }
        } while(opcion != 5);
    }
    
    //Métodos con parámetros
    public static void anadirContacto(List<Agenda> agenda) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine().trim();
        if(nombre.isEmpty()) throw new Exception("El nombre no puede estar vacío");
        
        System.out.println("Edad: ");
        int edad = Integer.parseInt(entrada.nextLine().trim());
        if(edad < 0) throw new Exception("La edad no puede ser negativa.");
        
        System.out.println("Número de móvil: ");
        String numero = entrada.nextLine().trim();
        if(numero.isEmpty()) throw new Exception("El número no puede estar vacío");
        
        agenda.add(new Agenda(nombre, edad, numero));
        System.out.println("Contacto añadido correctamente");
    }
    
    
    public static void visualizarLista(List<Agenda> agenda) throws Exception {        
        if(agenda.isEmpty()) {
            throw new Exception("La agenda está vacía");
        }
        
        System.out.println("--- Lista de Contactos ---");
        for(int i = 0; i < agenda.size(); i++) {
            System.out.println(agenda.get(i));
        }
    }
    
    
    public static void eliminarContacto(List<Agenda> agenda) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        if(agenda.isEmpty()) {
            throw new Exception("La agenda está vacía. No hay contactos para eliminar.");
        }
        
        System.out.println("Introduce el número de móvil del contacto a eliminar: ");
        String numero = entrada.nextLine().trim();
        
        if(numero.isEmpty()) {
            throw new Exception("El número de móvil no puede estar vacío");
        }
        
        boolean encontrado = false;
        
        for(int i = agenda.size() - 1; i >= 0; i--) {
            if(agenda.get(i).getNumeroMovil().equals(numero)) {
                agenda.remove(i);
                encontrado = true;
                break;
            }
        }
        
        if(encontrado) {
            System.out.println("Contacto eliminado correctamente");
        } else {
            throw new Exception("No se encontró ningún contacto con el número: " + numero);
        }
    }
    
    
    public static void mostrarOrdenadosPorEdad(List<Agenda> agenda) throws Exception {
        if(agenda.isEmpty()) {
            throw new Exception("La agenda está vacía. No hay contactos por mostrar.");
        }
        
        System.out.println("--- Contactos ordenados por edad (de menor a mayor) ---");
        
        //Creamos una copia para no modificar el orden original
        List<Agenda> copia = new ArrayList<>(agenda);
        
        //Ordenamos por edad
        for(int i = 0; i < copia.size() - 1; i++) {
            for(int j = 0; j < copia.size() - i - 1; j++) {
                //Comparación manual de edades
                if(copia.get(j).getEdad() > copia.get(j + 1).getEdad()) {
                    //Intercambio de elementos
                    Agenda temp = copia.get(j);
                    copia.set(j, copia.get(j + 1));
                    copia.set(j + 1, temp);
                }
            }
        }
        
        //Mostramos la lista ordenada
        for(int i = 0; i < copia.size(); i++) {
            System.out.println(copia.get(i));
        }
    }
}
