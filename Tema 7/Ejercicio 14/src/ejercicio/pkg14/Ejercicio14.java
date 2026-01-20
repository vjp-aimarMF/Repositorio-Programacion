/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[][] temperaturas = new double[4][7]; //Array bidimensional: 4 semanas x 7 dias
        boolean rellenado = false; //Para saber si ya se han introducido las temperaturas
        
        String[] dias = {
            "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
        }; //Array con los nombres de los dias de la semana
        
        int opcion;
        
        //Menu principal
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Dia o dias mas calurosos");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1: //Rellenamos temperaturas
                    System.out.println("Introduce las temperaturas del mes:");
                    for(int semana = 0; semana < 4; semana++) {
                        System.out.println("Semana " + (semana + 1));
                        for(int dia = 0; dia < 7; dia++) {
                            System.out.println(" " + dias[dia] + ": ");
                            temperaturas[semana][dia] = entrada.nextDouble();
                        }
                    }
                    rellenado = true; //Marcamos que ya hay datos
                    break;
            
            
            case 2: //Mostramos temperaturas
                    if(!rellenado) {
                    System.out.println("Rellena las temperaturas primero");
                    break;
            }
                System.out.println("Temperaturas del mes: ");
                   for(int semana = 0; semana < 4; semana++) {
                        System.out.println("Semana " + (semana + 1));
                        for(int dia = 0; dia < 7; dia++) {
                        System.out.println(" " + dias[dia] + ": " + temperaturas[semana][dia] + "°C");
                }
            }
            break;
            
            case 3: //Calculamos temperatura media del mes
                if(!rellenado) {
                    System.out.println("Rellena las temperaturas primero");
                    break;
                }
                double suma = 0; //Aqui sumamos todas las temperaturas
                for(int semana = 0; semana < 4; semana++) {
                    for(int dia = 0; dia < 7; dia++) {
                        suma += temperaturas[semana][dia];
                    }
                }
                double media = suma / 28; //Esta es la media (Media = suma total / 28 dias)
                System.out.println("La temperatura media del mes es: " + media + "°C");
                break;
                
            case 4: //Buscamos el dia o dias mas calurosos
                if(!rellenado) {
                    System.out.println("Rellena las temperaturas primero");
                    break;
                }
                
                double max = temperaturas[0][0]; //Aqui ponemos el maximo con el primer valor
                
                //Para encontrar la temperatura maxima
                for(int semana = 0; semana < 4; semana++) {
                    for(int dia = 0; dia < 7; dia++) {
                        if(temperaturas[semana][dia] > max) {
                            max = temperaturas[semana][dia];
                        }
                    }
                }
                
                System.out.println("El dia o dias con mas calor fueron: ");
                //Volvemos a recorrer para mostrar todos los dias que tengan la temperatura maxima
                for(int semana = 0; semana < 4; semana++) {
                    for(int dia = 0; dia < 7; dia++) {
                         if(temperaturas[semana][dia] == max) {
                             System.out.println("El " + dias[dia] + " de la Semana " + (semana + 1) + " con " + max + " grados");
                         }
                    }
                }
                break;
                
            case 5: //Salimos del programa
                System.out.println("Saliendo del programa...");
                break;
                
            default:
                System.out.println("Opcion no valida");
            }
        } while(opcion != 5); //Repetimos hasta que el usuario pulse 5
    }
    
}
