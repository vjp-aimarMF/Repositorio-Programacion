/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colacorreos;
import static colacorreos.Main.mostrarMenu;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class ColaCorreos {
    /**
     * @param args the command line arguments
     */
    //ATRIBUTOS
    //Variables estáticas
    public static int numeroEnvio = 1;
    public static int numeroRecogida = 1;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            opcion = pedirOpcion(entrada.nextInt());

            switch (opcion) {
                case 1:
                    generarNumeroEsperaEnvio();
                    break;
                case 2:
                    generarNumeroEsperaRecogida();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema de Correos.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);
    }


    
    
   
    
   
    
   
    
  
    
   
    
    
}
