/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg13;

/**
 *
 * @author alumno
 */
public class Venta {
    private String mes;
    private int ventas;
    
    //Constructores por defecto
    public Venta() {
        this.mes = "";
        this.ventas = 0;
    }
    
    //Parametrizado
    public Venta(String mes, int ventas) {
        this.mes = mes;
        this.ventas = ventas;
    }
    
    //Getters y Setters
    public String getMes() {
        return mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public int getVentas() {
        return ventas;
    }
    
    public void setVentas() {
        this.ventas = ventas;
    }
    
    //Método toString
    @Override
    public String toString() {
        return mes + ": " + ventas + " ventas";
    }
}
