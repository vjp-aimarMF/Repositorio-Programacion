/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

/**
 * Incluye polimorfismo
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Polimorfimso
        System.out.println("=== Ejecución directa ===");
        Suma suma = new Suma(10, 5);
        Multiplicacion multiplicacion = new Multiplicacion(10, 3);
        Potencia potencia = new Potencia(2, 4);

        suma.realizarOperacion();
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();

        System.out.println(suma);
        System.out.println(multiplicacion);
        System.out.println(potencia);

        System.out.println("\n=== Ejecución con polimorfismo ===");
        Calculadora calc1 = new Suma(20, 7);
        Calculadora calc2 = new Multiplicacion(5, 6);
        Calculadora calc3 = new Potencia(3, 3);

        calc1.realizarOperacion();
        calc2.realizarOperacion();
        calc3.realizarOperacion();

        System.out.println(calc1);
        System.out.println(calc2);
        System.out.println(calc3);
    }
    
}
