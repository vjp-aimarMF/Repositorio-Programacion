/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg6;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Campania {
    private String nombre;
    private ArrayList<Donacion> donaciones;

    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new ArrayList<>();
    }

// Inserción ordenada (de mayor a menor)
    public void addDonacion(Donacion d) {
        int i = 0;
        while (i < donaciones.size() && donaciones.get(i).getCantidad() > d.getCantidad()) {
            i++;
        }
        donaciones.add(i, d);
    }

    public void mostrarDonaciones() {
        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas.");
            return;
        }
        for (Donacion d : donaciones) {
            System.out.println(d);
        }
    }

    public void mostrarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Donacion d : donaciones) {
            if (d.getNombreDonante().equalsIgnoreCase(nombre)) {
                System.out.println(d);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay donaciones de ese donante.");
        }
    }

    public int getNumeroDonaciones() {
        return donaciones.size();
    }

    public double getTotalRecaudado() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        return total;
    }

    public void ordenarDonaciones() {
        // Ya están ordenadas al insertar, pero si quisieras reordenar:
        donaciones.sort((a, b) -> Double.compare(b.getCantidad(), a.getCantidad()));
    }
}
