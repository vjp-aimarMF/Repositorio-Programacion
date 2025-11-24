/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg5;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    //ATRIBUTOS
    private int ruedas; 
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    
    //ATRIBUTO STATIC (ESTATICO) QUE PERTENECE A LA CLASE
    private static int numBicicletas = 0;
    
    //ATRIBUTO DE OTRA CLASE
    private Ciclista ciclista;
    
    //CONSTRUCTORES
    //Por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        //Incrementamos el valor del atributo estático
        incrementarNumBicicletas();
        
        //Inicializamos un ciclista por defecto (constructor por defecto)
        this.ciclista = new Ciclista();
    }
    
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando, Ciclista ciclista) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        
         //Incrementamos el valor del atributo estático
        incrementarNumBicicletas();
        
        //Inicializamos un ciclista con los valores pasados por parámetro
        this.ciclista = ciclista;
    }
        
        //GETTERS Y SETTERS
        public void setRuedas(int ruedas) {
            this.ruedas = ruedas;
        }
        
        public int getRuedas() {
            return this.ruedas;
        }
        
        
         public void setManillar(String manillar) {
            this.manillar = manillar;
        }
         
         public String getManillar() {
            return this.manillar;
        }
         
         public void setPedales(String pedales) {
            this.pedales = pedales;
        }
         
         public String getFrenos() {
            return this.frenos;
        }
         
         public void setEstaPedaleando(boolean estaPedaleando) {
             this.estaPedaleando = estaPedaleando;
         }
         
         public boolean getEstaPedaleando() {
             return this.estaPedaleando;
         }
         
         public int getNumBicicletas() {
             return this.numBicicletas;
         }
         
         //Añadimos el get y set de Ciclista
         public Ciclista getCiclista() {
             return this.ciclista;
         }
         
         public void setCiclista(Ciclista ciclista) {
             this.ciclista = ciclista;
         }
         
        //MÉTODOS
         private void acelerar() {
             System.out.println("Acelerando...");
         }
         
         private static void incrementarNumBicicletas() {
             numBicicletas++;
         }
         
         //TO STRING
         @Override
         public String toString() {
             return "Mi bicicleta tiene " + this.ruedas + ", un manillar" + this.manillar + ", unos pedales " + this.pedales + ", unos frenos " + this.frenos + " y ahora ¿estoy pedaleando?" + this.estaPedaleando + this.ciclista.toString();
         }
    }

