public class Test {

    public void main(String[] args) {
        Combustible unCombustible1 = new Combustible("nafta" , 103);
        Camion camion1 = new Camion(90 , unCombustible1 , "Volvo" , "aa120yr");
        Ciudad ciudad1 = new Ciudad("San Luis" , 120 , 7);
        Ciudad ciudad2 = new Ciudad("Entre Rios" , 1320 , 24);
        Viaje unViaje = new Viaje(7 , ciudad1 , ciudad2, camion1);
        
        System.out.println("Costo de peaje: " + unViaje.costoComb());
    }
}
