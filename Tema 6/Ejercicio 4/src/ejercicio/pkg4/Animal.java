/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
abstract class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    
    //Constructor por defecto
    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
    }
    
    //Constructor parametrizado
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //Getters y setters
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Métodos abstractos
    public abstract void mostrarSonido();
    public abstract void mostrarAlimentacion();
    public abstract void mostrarHabitat();
    public abstract void mostrarNombreCientifico();

    // Método común para mostrar datos básicos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Peso: " + peso + " kg");
    } 
}