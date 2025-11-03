/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7Tema4;

/**
 *
 * @author alumno
 */
public class ejercicio7Tema4 {
    
    //Método que ordena y muestra los números de menor a mayor
    public static void ejercicio7Tema4 (int a, int b, int c, int d) {
    
        //Primero ordenamos los primeros números
        for (int i = 0; i < 3; i++) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            if (c > d) {
                int temp = c;
                c = d;
                d = temp;
            }
        }
        
        //Segundo reordenamos si es necesario
         for (int i = 0; i < 2; i++) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
        }
         
         //Tercero verificamos
         if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
         
         //Mostrar el resultado ordenado
         System.out.println("El orden de los números introducidos es el " + a + " - " + b + " - " + c + " - " + d);
    }
}
