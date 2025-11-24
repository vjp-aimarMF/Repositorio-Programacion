/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg25;

/**
 *
 * @author alumno
 */
public class Servidor extends Ordenador{
    // Atributos específicos de Servidor
    private double tamañoMonitor;
    private String teclado;
    private String raton;

    // Constructor por defecto
    public Servidor() {
        this.raton = "";
        this.tamañoMonitor = 0.0;
        this.teclado = "";
    }

    // Constructor parametrizado
    public Servidor(int ram, int discoDuro, String procesador, String tarjetaGrafica, double precio, double tamañoMonitor, String teclado, String raton) {
        this(ram, procesador, tarjetaGrafica);
    }

    // Constructor parametrizado
    public Servidor(int ram, String procesador, String tarjetaGrafica) {
        this.tamañoMonitor = tamañoMonitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // Getters y Setters
    public double getTamañoMonitor() { 
        return tamañoMonitor; 
    }
    public void setTamañoMonitor(double tamañoMonitor) { 
        this.tamañoMonitor = tamañoMonitor; 
    }

    public String getTeclado() { 
        return teclado; 
    }
    public void setTeclado(String teclado) { 
        this.teclado = teclado; 
    }

    public String getRaton() { 
        return raton; 
    }
    public void setRaton(String raton) { 
        this.raton = raton; 
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Servidor: " + super.toString() + " Monitor: " + this.tamañoMonitor + " Teclado: " + this.teclado + " Ratón: " + this.raton;
    }
}
