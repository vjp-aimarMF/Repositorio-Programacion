/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg21;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Apartado21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       // Solicita al usuario una cantidad en segundos
       int segundosTotal = entrada.nextInt();
       
       // Cálculos
        int dias = segundosTotal / 86400;
        int resto = segundosTotal % 86400;
        
        int horas = resto / 3600;
        resto = resto % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;
        
        // Muestra el resultado
        System.out.println(segundosTotal + " segundos hacen un total de: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
    }
    
}
