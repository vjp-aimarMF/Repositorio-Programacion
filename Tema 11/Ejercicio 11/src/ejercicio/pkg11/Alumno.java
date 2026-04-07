/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg11;

/**
 *
 * @author alumno
 */
public class Alumno implements Comparable<Alumno> {
    private String dni;
    private int expediente;
    private float notaMedia;

    public Alumno(String dni, int expediente, float notaMedia) {
        this.dni = dni;
        this.expediente = expediente;
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }

    public int getExpediente() {
        return expediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Exp: " + expediente + " | DNI: " + dni + " | Nota: " + notaMedia;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(expediente);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno)) return false;
        Alumno a = (Alumno) o;
        return this.expediente == a.expediente;
    }

    @Override
    public int compareTo(Alumno o) {
        return Integer.compare(this.expediente, o.expediente);
    }
    
}
