/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg25;

/**
 *
 * @author alumno
 */
public class Portatil extends Ordenador{
    // Atributos específicos de Portátil
    private String marca;
    private double tamañoPantalla;
    private double peso;

    // Constructor por defecto
    public Portatil() {
        this.marca = "";
        this.tamañoPantalla = 0.0;
        this.peso = 0.0;
    }

    // Constructor parametrizado
    public Portatil(int ram, int discoDuro, String procesador, String tarjetaGrafica, double precio, String marca, double tamañoPantalla, double peso) {
        this(procesador, ram, discoDuro);
    }

    // Constructor parametrizado
    public Portatil(String procesador, int ram, int discoDuro) {
        this.marca = marca;
        this.tamañoPantalla = tamañoPantalla;
        this.peso = peso;
    }

    // Getters y Setters
    public String getMarca() { 
        return marca; 
    }
    
    public void setMarca(String marca) { 
        this.marca = marca; 
    }

    public double getTamañoPantalla() { 
        return tamañoPantalla; 
    }
    
    public void setTamañoPantalla(double tamañoPantalla) { 
        this.tamañoPantalla = tamañoPantalla; 
    }

    public double getPeso() { 
        return peso; 
    }
    
    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Portátil: " + super.toString() + " Marca: " + this.marca + " Pantalla: " + this.tamañoPantalla + " Peso: " + this.peso + " kg";
    }
}
