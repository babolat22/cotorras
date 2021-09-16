
package ejercicio1robot;

public class Ejercicio1Robot {

    public static void main(String[] args) {
        // TODO code application logic here
        Robot r = new Robot();
        System.out.println(r.bateriaLLena()); 
        r.Avanzar(120);
        System.out.println("Robot avanzó: 120 pasos");
        r.Retroceder(50);
        System.out.println("Retrocedio 50");
        System.out.println("Actual: " +r.energiaActual());
       
        r.Recargar();
        System.out.println("Mios circuitos vacíos?? " + r.bateriaVacia());
      
        Hombre h = new Hombre("Julio"); // existe 
        h.JugarConRobot(r);    // se conocen
        Hombre h2 = new Hombre("Roberto");
        h2.JugarConRobot(r);   // se conoce h2 al mismo robot
        System.out.println("Nombre "+ h2.nombre);
        h.getJuega().Avanzar(500);  // navegacion
        System.out.println("Actual: " + h.getJuega().energiaActual());
       
        h2.getJuega().Retroceder(200);  //NAVEGACION
        System.out.println("Actual: " + h2.getJuega().energiaActual());
        h2.getJuega().Recargar();
        System.out.println("Despues de Recargar robot. " + h.getJuega().bateriaLLena() );
        h.getJuega().Avanzar(50000);
        h2.getJuega().Dormir();
        h2.getJuega().Retroceder(10);
        
    }
}

class Robot{
    int bateria = 1000;
    boolean despierto =true;
    public void Avanzar(int cantidadPasos){
        //if(despierto) 
       // bateria -= 10*cantidadPasos/100;
       // int gasto = 10*cantidadPasos/100;
        int gasto = cantidadPasos/10;
        if(despierto && bateria>gasto) {
            bateria -= gasto;
            System.out.println("Si pude Avanzado!");
        }else 
            System.out.println("No pudi avanzar...poco bateria o estoy Zzz");
    }
    public void Retroceder(int cantidadPasos){
        int gasto = 10*cantidadPasos/100;
        if(despierto && bateria>gasto) {
            bateria -= gasto;
            System.out.println("yo pude atrasar " + gasto + " pasos amigo");
        }else 
            System.out.println("No pudi volver...no bateria o cai en sueño");
    }
    public void Dormir(){
        despierto=false;
        System.out.println("Me DORMIDO!");
    }
    public void Despertar(){
        System.out.println("Me despertado!");
        despierto =true;}
    public void Recargar(){bateria = 1000;}
    public boolean bateriaLLena(){
        return (bateria==1000);
    }
    public boolean bateriaVacia() {return bateria==0;}
    public int energiaActual(){return bateria;}
}

class Hombre{
     String nombre;
    private Robot juega;  // si hay de ASOCIACION

    public Hombre(String nombre) {
        this.nombre = nombre;
    }
    public Robot getJuega() {
        return juega;
    }
    public void Hablar(){}
    public void Caminar(){}
    public void Comer(){}
    public void JugarConRobot(Robot r){  // DEPENDENDENCIA
        juega=r;
    }
}