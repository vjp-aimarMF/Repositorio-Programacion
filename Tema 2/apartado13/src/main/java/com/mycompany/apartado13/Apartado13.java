/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apartado13;

/**
 *
 * @author Usuario
 */
public class Apartado13 {

    public static void main(String[] args) {
        // Variables iniciales
        int num1 = 1;
        int num2 = 2;

        // Mostrar valores iniciales
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");

        // Usamos una variable auxiliar para intercambiar
        int aux = num1;
        num1 = num2;
        num2 = aux;

        // Mostrar valores después del intercambio
        System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
    }
}
