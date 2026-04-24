/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {
    public final static String FICHERO = "DatosBeca.txt";
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<Integer> suspensos = new ArrayList<>();
        ArrayList<String> residencias = new ArrayList<>();
        ArrayList<Integer> ingresos = new ArrayList<>();
        
        try {
            //Leer el fichero y llenar las listas
            leerFichero(nombres, sexos, edades, suspensos, residencias, ingresos);
            System.out.println("=== RESULTADO DE BECAS ===");
            System.out.print("NOMBRE DEL BECARIO");
            System.out.print("                  ");
            System.out.print("CUANTÍA TOTAL");
            System.out.print("   ");
            System.out.println("¿BECA?");
            System.out.println("----------------------------------------------------------------");
            
            int totalConBeca = 0;
            for(int i = 0; i < nombres.size(); i++) {
                int cuantia = calcularBeca(edades.get(i), suspensos.get(i), ingresos.get(i), residencias.get(i));
            
            if (cuantia > 0) {
                    System.out.printf("%-35s %-15d %-10s%n",
                                    nombres.get(i), cuantia, "SÍ");
                    totalConBeca++;
                } else {
                    System.out.printf("%-35s %-15s %-10s%n",
                                    nombres.get(i), "0", "NO");
                }
            }

            System.out.println("\n----------------------------------------------------------------");
            System.out.println("Total de becarios con derecho a beca: " + totalConBeca);

            }  catch(IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }
        
        //Metodo para leer el fichero y guardar los datos en listas paralelas
        public static void leerFichero(ArrayList<String> nombres, ArrayList<String> sexos, ArrayList<Integer> edades, ArrayList<Integer> suspensos, ArrayList<String> residencias, ArrayList<Integer> ingresos) throws IOException {
             try (FileReader fr = new FileReader(FICHERO);
             BufferedReader br = new BufferedReader(fr)) {

                String linea;
                String nombreTemp = "";
                String sexoTemp = "";
                int edadTemp = 0;
                int suspensosTemp = 0;
                String residenciaTemp = "";
                int ingresosTemp = 0;
                int contadorLinea = 0;

                while ((linea = br.readLine()) != null) {
                    // Ignorar líneas vacías
                    if (linea.trim().isEmpty()) {
                        continue;
                    }

                    // Separar por el carácter ':'
                    int posicionDosPuntos = linea.indexOf(':');
                    if (posicionDosPuntos != -1) {
                        String valor = linea.substring(posicionDosPuntos + 1).trim();

                    switch (contadorLinea % 6) {
                        case 0: // Nombre y Apellido
                            nombreTemp = valor;
                            break;
                        case 1: // Sexo
                            sexoTemp = valor;
                            break;
                        case 2: // Edad
                            try {
                                edadTemp = Integer.parseInt(valor);
                            } catch (NumberFormatException e) {
                                edadTemp = 0;
                            }
                            break;
                        case 3: // Número de suspensos
                            try {
                                suspensosTemp = Integer.parseInt(valor);
                            } catch (NumberFormatException e) {
                                suspensosTemp = 0;
                            }
                            break;
                        case 4: // Residencia Familiar
                            residenciaTemp = valor;
                            break;
                        case 5: // Ingresos Anuales
                            try {
                                ingresosTemp = Integer.parseInt(valor);
                            } catch (NumberFormatException e) {
                                ingresosTemp = 0;
                            }
                            // Añadir el becario completo a las listas
                            nombres.add(nombreTemp);
                            sexos.add(sexoTemp);
                            edades.add(edadTemp);
                            suspensos.add(suspensosTemp);
                            residencias.add(residenciaTemp);
                            ingresos.add(ingresosTemp);
                            break;
                        }
                        contadorLinea++;
                    }
                }
            }
        }
        
        //Método para calcular la cuantia de la beca
        public static int calcularBeca(int edad, int numSuspensos, int ingresosAnuales, String residenciaFamiliar) {

            // Si tiene 2 o más suspensos → NO hay beca
            if (numSuspensos >= 2) {
                return 0;
            }

            int beca = 1500; // Base fija

            // 1. Complemento por ingresos ≤ media (12.000€)
            if (ingresosAnuales <= 12000) {
                beca += 500;
            }

            // 2. Gratificación por edad (< 23 años)
            if (edad < 23) {
                beca += 200;
            }

            // 3. Gratificación por suspensos
            if (numSuspensos == 0) {
                beca += 500;
            } else if (numSuspensos == 1) {
                beca += 200;
            }

            // 4. Si NO vive en residencia familiar → 1000€ extra
            if (residenciaFamiliar.equalsIgnoreCase("NO")) {
                beca += 1000;
            }

            return beca;
        }
    }