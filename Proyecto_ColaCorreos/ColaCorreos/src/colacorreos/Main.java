/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colacorreos;

/**
 *
 * @author alumno
 */
public class Main {
    //CONSTANTES PARA EL RANGO DE MESAS
        char mesaInicial = 'A';
        char mesaFinal = 'F';
        
     //VARIABLES PARA LOS NÚMEROS DE ESPERA
        int envio = 1;
        int recogida = 1;
        
         //MÉTODOS
    //Mostrar el menú
    public static void mostrarMenu() {
        System.out.println("Menú correos");
        System.out.println("1. ENVIAR");
        System.out.println("2. RECOGER");
        System.out.println("3. SALIR");
    }
    
    
    
     //Generar letra aleatoria
  public static char generarLetraAleatoria(char inicio, char fin) {
        int rango = fin - inicio + 1;
        int desplazamiento = (int)(Math.random() * rango);
        return (char)(inicio + desplazamiento);
    
    }
    
     //Incrementar el numero de envío
    public static int incrementarNumeroEnvio(int numEnvio) {
      numEnvio++;
            return 0;
    }
    
     //Incrementar el número de recogida
    public static int incrementarNumeroRecogida(int numRecogida) {
        numRecogida++;
            return 0;
    }
    
    //Genera y muestra un nuevo número para realizar un envío con el formato E-númeroEnvío e incrementa el número de envío.
    public static void generarNumeroEsperaEnvio(String numEnvio) {
        char mesaEnv;
        System.out.println("Número de espera: E-" + numEnvio);
         mesaEnv = generarLetraAleatoria(inicio, fin);
        System.out.println("Mesa asignada: " + mesaEnv);
    }
    
    public static void generarNumeroEsperaRecogida(String numRecogida) {
        char mesaRec;
        System.out.println("Número de espera: E-" + numRecogida);
         mesaRec = generarLetraAleatoria(inicio, fin);
        System.out.println("Mesa asignada: " + mesaRec);
    }
}

