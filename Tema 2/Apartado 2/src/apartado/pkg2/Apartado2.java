/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado.pkg2;

/**
 *
 * @author alumno
 */
public class Apartado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1 = 0.5f;
        long numero2;
        float resultado;
        numero2 = 178823419991L;
        resultado = numero1 * numero2;
        //System.out.println("El resultado del multiplicar " + numero1 "y numero 2 es igual a" + resultado+);
        //El operador + en vez de ponerse al final tiene que estar en la variable "numero1" además hay que indicar también la variable numero2
        //SOLUCIÓN
        System.out.println("El resultado del multiplicar " + numero1 + " y " + numero2 + " es igual a" + resultado);
    }
    
}
