/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre de usuario: ");
        String usuario = entrada.nextLine();
        
        System.out.println("Introduce tu contrasenia: ");
        String contrasenia = entrada.nextLine();
        
        
        if(validarContrasenia(usuario, contrasenia)) {
            System.out.println("Contrasenia valida");
        } else {
            System.out.println("Contrasenia invalida");
        }
    }
    
    //Metodo que valida la contraseña segun las reglas
    public static boolean validarContrasenia(String usuario, String contrasenia) {
        
        //Regla 1: longitud minima
        if(contrasenia.length() < 6) {
            System.out.println("La contrasenia debe tener al menos 6 caracteres");
            return false;
        }
        
        //Regla 2: al menos 2 digitos
        int contadorDigitos = 0;
        for(int i = 0; i < contrasenia.length(); i++) {
            if(Character.isDigit(contrasenia.charAt(i))) {
                contadorDigitos++;
            }
        }
        
        if(contadorDigitos < 2) {
            System.out.println("La contrasenia debe contener al menos dos digitos");
            return false;
        }
        
        //Regla 3: el usuario no puede estar entro de la contrasenia
        if(contrasenia.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("La contrasenia no puede contener el nombre de usuario");
            return false;
        }
        
        return true; //Si pasa todas las reglas
    }
}
