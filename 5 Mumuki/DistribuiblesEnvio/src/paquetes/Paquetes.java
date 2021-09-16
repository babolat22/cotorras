
package paquetes;

public class Paquetes {

   
    public static void main(String[] args) {
        // TODO code application logic here
         
        
    }
    class EnvioCortaDistancia{
        public Ciudad ciudad;  //partimos de aca
        public EnvioCortaDistancia(Ciudad x){
            this.ciudad=x;
        }
        
        boolean puedeEnviar(Distribuible d, Ciudad y){
            return (y.distancia(this.ciudad)<200 && d.esPequeño());
        }
        int verCosto(Distribuible d, Ciudad y){
            return (y.distancia(ciudad)+d.Peso());
        }
    }
    
    interface Distribuible{
        int Peso();
        boolean esPequeño();
        boolean esLiviano();
    }
    class Paquete implements Distribuible{
        int peso;
        int volumen;
        public Paquete(int p, int v){
            peso=p;
            volumen=v;
        }
        
        @Override
        public int Peso() {
            return peso+50;
        }

        @Override
        public boolean esPequeño() {
            return volumen<2000;
        }

        @Override
        public boolean esLiviano() {
            return peso<200;
        }
    
    }
    class Carta implements Distribuible{
        int cantidadDeLineas;

        public Carta(int cantidadDeLineas) {
            this.cantidadDeLineas = cantidadDeLineas;
        }

        @Override
        public int Peso() {
            return cantidadDeLineas +2;
        }

        @Override
        public boolean esPequeño() {
             return true;
               }

        @Override
        public boolean esLiviano() {
              return this.cantidadDeLineas+2<200;
        }
        
    }
}   

