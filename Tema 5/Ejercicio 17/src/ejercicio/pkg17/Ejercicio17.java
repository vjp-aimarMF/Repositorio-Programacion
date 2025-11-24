/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear los 4 enunciados
        Enunciado p1 = new Enunciado("¿Cual es la capital de España?", "Madrid");
        Enunciado p2 = new Enunciado("¿Quien descubrio America?", "Cristobal Colon");
        Enunciado p3 = new Enunciado("¿Cual es el rio más largo del mundo?", "Nilo");
        Enunciado p4 = new Enunciado("¿En que año comenzo la Segunda Guerra Mundial?", "1939");

        // Ejemplo de uso de setters (modificar una pregunta antes del examen)
        p3.setPregunta("¿Cuál es el río más largo de África?");
        p3.setRespuesta("Nilo");

        // Array de preguntas
        Enunciado[] preguntas = {p1, p2, p3, p4};

        double nota = 0;

        // Preguntar al usuario
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i].getPregunta());
            String respuestaUsuario = entrada.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(preguntas[i].getRespuesta())) {
                System.out.println("¡Correcto!");
                nota += 2.5;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + preguntas[i].getRespuesta());
            }
            System.out.println();
        }

        // Nota final
        System.out.println("Tu nota final es: " + nota);
    }
    
}
