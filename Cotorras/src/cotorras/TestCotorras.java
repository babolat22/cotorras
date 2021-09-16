package cotorras;
public class TestCotorras {
    public static void main(String[] args) {
        Golondrina g1,g2 = new Golondrina(); 
        Golondrina g3 = new Golondrina(); 
        g1 = new Golondrina(); 
        Condor c = new Condor();
        Condor condorito = new Condor();
        
        g1.comerAlpiste(50);
        System.out.println("La energia de la cotorra es: "+g1.getEnergia());
        g1.volarEnCirculos();
        System.out.println("La energia de la cotorra es: "+g1.getEnergia());
        
    }
}

class Condor{

}



