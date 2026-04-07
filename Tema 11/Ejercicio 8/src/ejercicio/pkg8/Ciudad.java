/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg8;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ciudad {
    private String nombre;
    private Set<Sede> sedes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void addSede(Sede s) {
        sedes.add(s);
    }

    @Override
    public String toString() {
        return nombre + " → " + sedes;
    }
}
