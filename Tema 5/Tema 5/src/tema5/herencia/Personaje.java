/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.herencia;

/**
 *
 * @author alumno
 */
public class Personaje {
    //ATRIBUTOS
    private int vida;
    
    //CONSTRUCTORES
    public Personaje() {
        this.vida = 100;
    }
    
    public Personaje(int vida) {
        this.vida = vida;
    }
    
    //GETTERS Y SETTERS
    public int getVida() {
        return this.vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
    //MÉTODOS
    public void Atacar 
    //TO STRING
    @Override
    public String toString() {
        return "El PERSONAJE tiene " + vida + "% de vida";
    }
}
