/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg1;

/**
 *
 * @author alumno
 */
public class Coche {
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    //Constructores 
    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    
    public Coche() {
    }
    
    //Getters y setters
    //Getters
     public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
    
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    // Métodos adicionales para encender/apagar motor
    public void encenderMotor() {
        motorEncendido = true;
    }

    public void apagarMotor() {
        motorEncendido = false;
    }
    
    //Métodos públicos para establecer valores
    public void establecerMarca(String marca) {
        this.marca = marca;
    }
    
     public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public void establecerColor(String color) {
        this.color = color;
    }
    
    // Método para arrancar el coche
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10; // al arrancar, velocidad inicial 10
    }
    
    // Método para apagar el coche
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0; // al apagar, velocidad 0
    }
    
    // Método para acelerar el coche
    public void acelerarCoche() {
        velocidad += 20; // aumenta 20
    }

    // Método para frenar el coche
    public void frenarCoche() {
        velocidad -= 6; // disminuye 6
        if (velocidad < 0) { // evitar valores negativos
            velocidad = 0;
        }
        
    }
    
    // Método para obtener el estado del coche
    public void obtenerEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Motor encendido: " + motorEncendido);
    }
}
