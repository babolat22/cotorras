package herencia;

/**
 *
 * @author juanj
 */
public class HerenciaFamiliar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto = new Auto("123asc","Ford Focus");
       // Padre p=new Padre("Lopez", auto);
     
        
        Hijo h= new Hijo("Juan Carlos", "Lopez", auto);
        h.jugarFutbol();
        h.bailar();
        h.cantar();  
        System.out.println("Me gané este auto modelo: "+ h.getAuto().getModelo());
        System.out.println("Papá me dejo esta casa en zona "+ h.getCasa().getZona());
        h.heredarDinero(4000000);
           
    }   
    
}
