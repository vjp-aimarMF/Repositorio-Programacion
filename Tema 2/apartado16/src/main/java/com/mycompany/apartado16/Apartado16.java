/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apartado16;

/**
 *
 * @author Usuario
 */
public class Apartado16 {

    public static void main(String[] args) {
        // Cantidad fija en euros (por ejemplo 130)
        int total = 130;

        // Calculamos cuántos billetes de 50 euros
        int billetes50 = total / 50;

        // Calculamos el resto para los billetes de 10 euros
        int resto = total % 50;
        int billetes10 = resto / 10;

        // Mostramos el resultado
        System.out.println(total + " euros hacen un total de: " + billetes50 + " billetes de 50 euros y " + billetes10 + " billetes de 10 euros.");
    }
}
