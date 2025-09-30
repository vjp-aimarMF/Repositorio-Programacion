/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg2;

/**
 *
 * @author alumno
 */
//CLASE
public class Tema2 {
    //CONSTANTE
    final static char LETRA_DNI = 'W';
    
    //ATRIBUTOS
    int vida = 100;
    int niveles = 100;
    String genero = "RPG";
    
    //METODOS
    public static void iniciar() {
        System.out.println("Iniciando juego....");
    }
    
    public static void mostrarMenu() {
        System.out.println("- MENÚ -");
        System.out.println("Iniciar");
        System.out.println("Seleccionar nivel");
        System.out.println("Opciones");
        System.out.println("Salir");
    }
    
    //MÉTODO PRINCIPAL (MAIN)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int tiempoEspera = 3;
        
        float notaMedia = 6.8f; //SIEMPRE CON F
        
        //1. Declarar una variable
        char letraDNI;
        
        //2. Inicializar una variable
        letraDNI = 'W';
        
        //Declarar e inicializar una variable
        boolean encontrado = false;
        
        //Declarar varias variables en la misma línea
        int edad, niveles, vida;
        
        //Declarar e inicializar varias variables en la misma línea
        int edad1 = 3, niveles1 = 100, vida1 = 100;
        System.out.println(letraDNI);
        
        //LLAMAR A MÉTODOS
        iniciar();
    }
    
}
