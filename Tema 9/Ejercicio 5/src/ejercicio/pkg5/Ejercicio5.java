/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       //Array con los dias de la semana en orden
       String[] dias = {
           "Lunes", "Martes", "Miercoles", "Jueves", 
           "Viernes", "Sabado", "Domingo"
       };
       
        System.out.println("Introduce un dia de la semana: ");
        String diaUsuario = entrada.nextLine();
        
        //Normalizamos para evitar problemas con mayusculas/minusculas
        diaUsuario = diaUsuario.trim();
        
        boolean encontrado =  false;
        
        //Buscamos el dia en el array
        for(int i = 0; i < dias.length; i++) {
            if(dias[i].equalsIgnoreCase(diaUsuario)) {
                System.out.println("Es el dia numero " + (i + 1) + " de la semana");
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado) {
            System.out.println("El dia introducido no es valido.");
        }
        
        
    }
    
}
