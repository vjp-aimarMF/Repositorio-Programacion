/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1; 
        int dato2;
        int dato3, resultado;
        
        dato1 = 20; 
        dato2 = 10;
        dato3 = 15;
        
        //Suma
        resultado = dato1 + dato2 + dato3; //Guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        //Resta
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 +  " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 +  " = " + resultado);
       
    }
    
}
