/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16;

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
        Scanner entrada = new Scanner(System.in);
        
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "María"}; //Array con nombres de los alumnos
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"}; //Array con nombres de las asignaturas
        
        double[][] notas = new double[6][4]; //Matriz de notas: 6 alumnos x 4 asignaturas
        boolean rellenado = false; // Para saber si ya se han introducido las notas
        
        int opcion;
      
        //Menu principal
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Rellenar notas");
            System.out.println("2.  Mostrar notas");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Alumno con mas suspensos");
            System.out.println("5. Asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1: // Rellenamos las notas de todos los alumnos
                    System.out.println("Introduce las notas de los alumnos: ");
                    for(int i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        for(int j = 0; j < asignaturas.length; j++) {
                            System.out.println(" " + asignaturas[j] + ": ");
                            notas[i][j] = entrada.nextDouble();
                        }
                    }
                    rellenado = true; //Marcamos que ya hay datos
                    break;
                
                case 2: //Mostramos todas las notas introducidas
                    if(!rellenado) {
                        System.out.println("Rellena las notas primero");
                        break;
                    }
                    System.out.println("Notas introducidas:");
                    for(int i = 0; i < alumnos.length; i++) {
                        System.out.println(alumnos[i] + ":");
                        for(int j = 0; j < asignaturas.length; j++) {
                            System.out.println(" " + asignaturas[j] + ": " + notas[i][j]);
                        }
                    }
                    break;
                    
                case 3: //Encontramos al alumno con la media mas alta
                     if(!rellenado) {
                        System.out.println("Rellena las notas primero");
                        break;
            }
                     
                     double mejorMedia = -1;
                     String mejorAlumno = "";
                     
                     //Recogemos cada alumno
                     for(int i = 0; i < alumnos.length; i++) {
                         double suma = 0;
                         //Sumamos sus notas
                         for(int j = 0; j < asignaturas.length; j++) {
                             suma += notas[i][j];
                         }
                         //Calculamos la media
                         double media = suma / asignaturas.length;
                         
                         //Comprobamos si es la mejor media
                         if(media > mejorMedia) {
                             mejorMedia = media;
                             mejorAlumno = alumnos[i];
                         }
                     }
                     
                     System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
                     break;
                     
                case 4: //Encontramos al alumno con mas suspensos
                    if(!rellenado) {
                        System.out.println("Rellena las notas primero");
                        break;
            }
                    int maxSuspensos = -1;
                    String alumnoSuspensos = " ";
                    
                    //Recorremos cada alumno
                    for(int i = 0; i < alumnos.length; i++) {
                        int suspensos = 0;
                        
                        //Contamos cuantas asignaturas tiene suspensas (< 5)
                        for(int j = 0; j < asignaturas.length; j++) {
                            if(notas[i][j] < 5) {
                                suspensos++;
                            }
                        }
                        
                        //Comprobamos si es el que mas suspensos tiene
                        if(suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            alumnoSuspensos = alumnos[i];
                        }
                    }
                    System.out.println("El alumno con mas suspensos es " + alumnoSuspensos + " con " + maxSuspensos + " suspensos");
                    break;
                    
                case 5: //Encontramos la asignatura con la media mas baja
                    if(!rellenado) {
                        System.out.println("Rellena las notas primero");
                        break;
            }
                    double peorMedia = 11; //Valor imposible para inicializar
                    String asignaturaDificil = " ";
                    
                    //Recorremos cada asignatura
                    for(int j = 0; j < asignaturas.length; j++) {
                        double suma = 0;
                        
                        //Sumamos las notas de todos los alumnos en esa asignatura
                        for(int i = 0; i < alumnos.length; i++) {
                            suma += notas[i][j];
                        }
                        //Calculamos la media
                        double media = suma / alumnos.length;
                        
                        //Comprobamos si es la media mas baja encontrada
                        if(media < peorMedia) {
                            peorMedia = media;
                            asignaturaDificil = asignaturas[j];
                        }
                    }
                    
                    System.out.println("La asignatura mas dificil es " + asignaturaDificil + " con una media de " + peorMedia);
                    break;
                    
                case 6: //Salimos del programa
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while(opcion != 6); // ¡Repetimos hasta que el usuario pulse 6
    }   
}
