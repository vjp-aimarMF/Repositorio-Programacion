/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

/**
 * Incluimos el polimorfismo
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("=== Ejecucion directa ===");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Perry", "Macho", "Marrón", 3, 2);
        Murcielago murcielago = new Murcielago("Bruce", "Macho", "Negro", 5, 10);

        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();

        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.mostrarAlturaVuelo();
        murcielago.aumentarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();

        System.out.println("\n=== Ejecucion con polimorfismo ===");
        Oviparo oviparo = new Ornitorrinco("Orni", "Hembra", "Gris", 4, 1);
        Volador volador = new Murcielago("Bat", "Macho", "Negro", 6, 15);

        System.out.println(oviparo.obtenerMensajeOviparo());
        oviparo.ponerHuevo();
        oviparo.mostrarNumHuevos();

        System.out.println(volador.obtenerMensajeVolador());
        volador.aumentarAlturaVuelo();
        volador.mostrarAlturaVuelo();
    }
    
}
