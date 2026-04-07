/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8;

/**
 *
 * @author alumno
 */
public class Sede implements Comparable<Sede>{
    private String nombre;
    private double ingresosAnuales;

    public Sede(String nombre, double ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    @Override
    public String toString() {
        return nombre + " (" + ingresosAnuales + " €)";
    }

    @Override
    public int compareTo(Sede otra) {
        return Double.compare(otra.ingresosAnuales, this.ingresosAnuales);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sede)) return false;
        Sede s = (Sede) o;
        return this.nombre.equalsIgnoreCase(s.nombre);
    }
}
