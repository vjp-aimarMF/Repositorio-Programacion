/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg7;

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

    public String getNombre() {
        return nombre;
    }

    public void addDonacion(Donacion d) {
        donaciones.add(d);
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }

    public double getTotal() {
        double total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad();
        }
        return total;
    }

    public Donacion getMayorDonacion() {
        if (donaciones.isEmpty()) return null;

        Donacion mayor = donaciones.get(0);
        for (Donacion d : donaciones) {
            if (d.getCantidad() > mayor.getCantidad()) {
                mayor = d;
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Campaña: " + nombre + "\n");
        if (donaciones.isEmpty()) {
            sb.append("  (Sin donaciones)\n");
        } else {
            for (Donacion d : donaciones) {
                sb.append("  ").append(d).append("\n");
            }
        }
        return sb.toString();
    }
}
