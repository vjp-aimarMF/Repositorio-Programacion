/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Polimorfismo usando una sola referencia de tipo Animal
        Animal animal;

        // Asignamos un Perro
        animal = new Perro("Bethooven", 5, 12.5);
        mostrarInfoAnimal(animal);

        // Ahora un Lobo
        animal = new Lobo("Luna", 7, 60.0);
        mostrarInfoAnimal(animal);

        // Ahora un León
        animal = new Leon("Scar", 8, 120.0);
        mostrarInfoAnimal(animal);

        // Finalmente un Gato
        animal = new Gato("Tom", 3, 3.5);
        mostrarInfoAnimal(animal);
    }
      // Método auxiliar para mostrar la información del animal
    public static void mostrarInfoAnimal(Animal animal) {
        animal.mostrarDatos();
        animal.mostrarSonido();
        animal.mostrarAlimentacion();
        animal.mostrarHabitat();
        animal.mostrarNombreCientifico();
        System.out.println();
    }
}
