/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class Sorteo {
    private LocalDate fecha;
    private int[] numerosGanadores;

    public Sorteo(LocalDate fecha) {
        this.fecha = fecha;
        this.numerosGanadores = generarNumeros();
    }

    private int[] generarNumeros() {
        Random r = new Random();
        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100) + 1;
        }
        return nums;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int[] getNumerosGanadores() {
        return numerosGanadores;
    }

    @Override
    public String toString() {
        return fecha + " → " + Arrays.toString(numerosGanadores);
    }
}
