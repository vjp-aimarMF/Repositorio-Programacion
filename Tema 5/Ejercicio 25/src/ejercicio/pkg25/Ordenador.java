/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg25;

/**
 *
 * @author alumno
 */
public class Ordenador {
    
// Atributos comunes a todos los ordenadores
    private int ram;
    private int discoDuro;
    private String procesador;
    private String tarjetaGrafica;
    private double precio;

    // Constructor por defecto
    public Ordenador() {
        this.ram = 0;
        this.discoDuro = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0.0;
    }

    // Constructor parametrizado
    public Ordenador(int ram, int discoDuro, String procesador, String tarjetaGrafica, double precio) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.precio = precio;
    }

    // Getters y Setters (para acceder y modificar atributos)
    public int getRam() { 
        return ram; 
    }
    public void setRam(int ram) { 
        this.ram = ram; 
    }

    public int getDiscoDuro() { 
        return discoDuro; 
    }
    public void setDiscoDuro(int discoDuro) { 
        this.discoDuro = discoDuro; 
    }

    public String getProcesador() {
        return procesador; 
    }
    public void setProcesador(String procesador) { 
        this.procesador = procesador; 
    }

    public String getTarjetaGrafica() { 
        return tarjetaGrafica; 
    }
    
    public void setTarjetaGrafica(String tarjetaGrafica) { 
        this.tarjetaGrafica = tarjetaGrafica; 
    }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Método toString para mostrar información del objeto
    @Override
    public String toString() {
        return "RAM: " + ram + " GB" + " Disco Duro: " + discoDuro + " GB " + " Procesador: " + procesador +
               "  Tarjeta Gráfica: " + tarjetaGrafica + " Precio: " + precio + " €";
    }

}
