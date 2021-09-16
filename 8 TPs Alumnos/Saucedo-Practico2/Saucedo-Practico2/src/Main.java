import clases.*;

public class Main {

    public static void main(String[] args) {
        Ciudad sanluis = new Ciudad("San Luis",120);
        Ciudad santafe = new Ciudad("Santa Fe",500);
        Combustible ul = new Combustible("Uranio Liquido",50.7);
        Combustible gas = new Combustible("Gas Natural",22.0);
        Combustible nafta = new Combustible("Nafta",5000.0);
        Vehiculo kitt = new Auto("Pontiac","KNIGHT",ul);
        Vehiculo optimus = new Camion("Peterbilt","PRIME",nafta);
        Vehiculo mysterymachine = new Camioneta("Ford","SCOOBY",gas);
        Viaje malviaje = new Viaje(sanluis,santafe,kitt,4);
        Viaje buenviaje = new Viaje(sanluis,santafe,optimus,3,13000.0);
        Viaje odisea = new Viaje(sanluis,santafe,mysterymachine,7);
        malviaje.realizarViaje();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        buenviaje.realizarViaje();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        odisea.realizarViaje();   
    }
}
