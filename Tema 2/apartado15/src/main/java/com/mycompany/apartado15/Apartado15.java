/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apartado15;

/**
 *
 * @author Usuario
 */
public class Apartado15 {

    public static void main(String[] args) {
        // Variable con el tiempo en segundos
        int tiempo = 10000;

        // Cálculo de horas, minutos y segundos
        int horas = tiempo / 3600;             // horas completas
        int resto = tiempo % 3600;             // lo que sobra tras quitar las horas
        int minutos = resto / 60;              // minutos completos
        int segundos = resto % 60;             // segundos restantes

        // Mostrar resultado
        System.out.println(tiempo + " segundos hacen un total de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }
}
