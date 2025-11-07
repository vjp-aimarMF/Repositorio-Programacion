/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author alumno
 */
public class Calculadora {
     /**
     * Método que devuelve la suma de dos números
     * pasados por parámetro.
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2){
    int  resultado = num1+num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return resta los dos numeros
     */
    public static int resta(int num1, int num2){
    int  resultado = num1-num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return multiplica los dos numeros
     */
    public static int multiplicacion(int num1,int num2){
    int resultado = num1*num2;
        return resultado;
    }
    /**
     * Metodo que resta dos numeros pasador por parametro
     * @param num1
     * @param num2
     * @return divide los dos numeros
     */
     public static int division(int num1,int num2){
        int resultado = num1/num2;
        return resultado;}
     
     public static double raizCuadrada(int num1){
       return Math.sqrt(num1);
      
     }
     /**
      * 
      * @param num1
      * @return un numero aleatorio entre 1 y 10
      */
     public static int aleatorio(int num1){
         int resultado;
         resultado = (int)(Math.random()*10+1);
         return resultado;   
     }
     /**
      * 
      * @param num1
      * @param num2
      * @return Devuelve el menor de dos numeros introducidos 
      */
     public static int menor(int num1,int num2){
     int resultado;
     resultado =  Math.min(num1, num2);
     return resultado;
     }
     public static int mayor(int num1,int num2){
     int resultado;
     resultado = Math.max(num1, num2);
     return resultado;
     }
}
