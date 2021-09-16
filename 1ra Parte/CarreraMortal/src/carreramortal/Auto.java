package carreramortal;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    //Atributo de clase que almacena la patente del auto
    private String patente;
    //Atributo de clase que almacena el color del auto
    private String color; 
    //Atributo de clase que almacena la cantidad de combustible del auto
    private double combustible; 
    private Rueda auxilio= null;    // Opcional 1 tiene 0..1 ruedas
    private ArrayList<Rueda> ruedas = new ArrayList<Rueda>();   // 1 a muchos ruedas
                            
    public void reemplazarRueda(Rueda r, Rueda r2){
        rueda.presion=18;  // rompo encapsulamiento
        ruedas.set(ruedas.indexOf(r), r2);
    }
    // SOBRECARGAMOS EL METODO
    public void quitarRueda(int posicion){
        ruedas.set(posicion,null);
    }
    
    public void colocarRueda(Rueda rueda) {
        if (ruedas.size() < 4){
            ruedas.add(rueda);
        }else{
            System.out.println("El auto ya posee las 4 ruedas");
        }
    }
   // codigo que soporta hasta 4 ruedas con array
    //Entero que indica la posición de la rueda
    int posRueda = 0;
    
    private Rueda[] ruedass = new Rueda[4];
    
    public void colocarRueda2(Rueda rueda) {
        if (posRueda < 4){
            ruedass[posRueda] = rueda;
            posRueda++;
        }else{
            System.out.println("El auto ya posee las 4 ruedas");
        }
    }
    
    public List<Rueda> getRuedas(){
        return ruedas;
    }
    public Rueda getAuxilio() {
        return auxilio;
    }
    public void colocaAuxilio(Rueda rueda) {  // ASOCIACION
        this.auxilio=rueda;
        System.out.println("rueda de auxilio colocada!");
    }  
    // Código que soporta solo una rueda
    private Rueda rueda;
    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }
       
     /**
     * Constructor para la clase Auto que recibe como parámetros patente y color
     * Al momento de la creación se asigna la cantidad de combistible inicial al 
     * objeto
     * 
     * @param patente Patente del auto
     * @param color Color del auto
     */
    public Auto(String patente, String color){
        this.patente = patente;
        this.color = color;
        //Asigno la cantidad inciial de combustible cuando se crea el objeto Auto
        combustible = 50;
    }
    
    public void avanzar(double metros){
        //El consumo de comuxtible es de 0.1 litro por cada metro recorrido
        double combustibleNecesario = 0.1 * metros;   
        
        //verificamos si el combustible que posee el auto es suficiente para 
        //avanzar la cantidad de metros solicitada
        if(combustible >= combustibleNecesario){
            combustible -= combustibleNecesario;
            System.out.println("Quedan.." + combustible);
            
        }else{
            System.out.println("Combustible insuficiente para avanzar, se necesitan: " + combustibleNecesario + " litros y el auto posee: " + combustible + " litros.");
        }
    }
    
    public void retroceder(double metros){
            
    }
     public void llenarTanque(){
         this.combustible=50;
     }
     
    public void inflarTodas(){
         for (int i=0; i<4; i++) 
            ruedas.get(i).inflar(i);
                   
         System.out.println("Todas FUERON infladas EN 29");
    }
}