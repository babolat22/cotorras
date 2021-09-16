package practico2;

public class Practico2 {

    public static void main(String[] args) {
        
        Ciudad SanLuis=         new Ciudad("San Luis",829,7);
        Ciudad VillaMercedes=   new Ciudad("Villa Mercedes",738,7);
        Ciudad Mendoza=         new Ciudad("Mendoza",1117,7);
        Ciudad Posadas=         new Ciudad("Posadas",995,14);
        Ciudad Concordia=       new Ciudad("Concordia",422,14);
        
        Combustible Nafta=      new Combustible("Nafta",101.8);
        Combustible Gasoil=     new Combustible("Gasoil",92.4);
        Combustible GNC=        new Combustible("gnc",38);
        
        Auto AutitoRojo=        new Auto("Fiat","123fds123",Nafta);
        Auto AutitoAzul=        new Auto("Ford","123ede333",Gasoil);
        Auto AutitoVerde=       new Auto("Volkswagen","123tre222",GNC);
        Camioneta ChataVieja=   new Camioneta("Toyota","9398hdh12",Gasoil);
        Camioneta ChataNueva=   new Camioneta("GMC","4920dke12",GNC);
        Camion CamionPesado=    new Camion("Volvo","129gtr443",Nafta);
        Camion CamionLiviano=   new Camion("Mercedes Benz","000qcy000",GNC);
        
        Viaje VillaMercedes_SanLuis= new Viaje(VillaMercedes,SanLuis,ChataVieja,9);
        
        /*
        VillaMercedes_SanLuis.calculoDistancia();
        VillaMercedes_SanLuis.calculoCostoPeajes();
        VillaMercedes_SanLuis.calculoCostoCombustible();
        VillaMercedes_SanLuis.calculoCostoTotal();
        */
        
        Viaje SanLuis_Posadas= new Viaje(SanLuis,Posadas,AutitoVerde,20,1580);
        
        SanLuis_Posadas.calculoCostoPeajes();
        SanLuis_Posadas.calculoCostoCombustible();
        SanLuis_Posadas.calculoCostoTotal();
        
        
        Viaje Mendoza_VillaMercedes= new Viaje(Mendoza,VillaMercedes,CamionLiviano,9);
        
        Mendoza_VillaMercedes.calculoDistancia();
        Mendoza_VillaMercedes.calculoCostoPeajes();
        Mendoza_VillaMercedes.calculoCostoCombustible();
        Mendoza_VillaMercedes.calculoCostoTotal();
    }
    
}
