/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Dia[] mes = new Dia[30];
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        int opcion;
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Rellenar temperaturas aleatorias");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Ver temperatura media del mes");
            System.out.println("4. Dia o dias mas calurosos");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    int diaInicio = (int)(Math.random() * 7);
                    for(int i = 0; i < mes.length; i++) {
                        String nombreDia = diasSemana[(diaInicio + i) % 7];
                        int temperatura = (int)(Math.random() * 21) + 20;
                        mes[i] = new Dia(nombreDia, temperatura);
                    }
                    System.out.println("Temperaturas generadas correctamente.");
                    break;
                    
                case 2:
                    for(int i = 0; i < mes.length; i++) {
                        System.out.println(mes[i].getNombreDia() + " dia " + (i + 1) + ": " + mes[i].getTemperatura() + " grados.");
                    }
                    break;
                    
                case 3:
                    int suma = 0;
                    for(int i = 0; i < mes.length; i++) {
                        suma += mes[i].getTemperatura();
                    }
                    double media = (double) suma / mes.length;
                    System.out.println("La temperatura media del mes es: " + (int)media + " grados.");
                    break;
                    
                case 4:
                    int maxTemp = mes[0].getTemperatura();
                    for(int i = 1; i < mes.length; i++) {
                        if(mes[i].getTemperatura() > maxTemp) {
                            maxTemp = mes[i].getTemperatura();
                        }
                    }
                    
                    System.out.println("El dia o dias mas calurosos fueron");
                    for(int i = 0; i < mes.length; i++) {
                        if(mes[i].getTemperatura() == maxTemp) {
                            System.out.println("El " + mes[i].getNombreDia() + " dia " + (i + 1) + " con " + maxTemp + " grados.");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
            }
        } while(opcion != 5);
    }
    
}
