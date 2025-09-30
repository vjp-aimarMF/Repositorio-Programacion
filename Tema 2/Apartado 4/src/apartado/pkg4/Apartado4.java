/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg4;

/**
 *
 * @author alumno
 */
public class Apartado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos de la asignatura
        String asignatura = "Programación";
        byte nota1 = 8; //byte es suficiente si las notas están entre 0 y 10
        byte nota2 = 7;
        
        //Cálculo de la media
        float media = (nota1 + nota2) / 2.0f; //usamos float para decimales
        
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nota del primer examen: " + nota1);
        System.out.println("Nota del segundo examen: " + nota2);
        System.out.println("Nota media: " + media);
    }
    
}
