package tp2;

public class Test {

    public static void main(String[] args) {
        Combustible diesel = new Combustible(2,"Diesel");
        Combustible gas = new Combustible(1,"GNC");
        Auto auto1 = new Auto("Ferrari","AWX 123",diesel);
        Auto auto2 = new Auto("BMW","ASD 478",gas);
        Camioneta camioneta1 = new Camioneta("Hilux","MNB 098",diesel);
        //Camioneta camioneta2 = new Camioneta ("Toyota","ZXC 780",gas); no lo use para no hacer muy largo el test, ya que el enunciado no lo pide
        //Camion camion1 = new Camion("Hotwheel","KLJ 423",diesel); idem aqui
        //Camion camion2 = new Camion("Mercedes Benz","ÑLK 564",gas); y aqui
        Ciudad sanLuis = new Ciudad("San Luis",0,7);
        Ciudad rufino = new Ciudad("Rufino",100,7);
        Ciudad cordoba = new Ciudad("Cordoba",500,9);
        
        //creo un viaje en auto con un peaje para probar un auto con diesel
        Viaje viajeEnAuto1 = new Viaje(1,sanLuis,rufino,auto1);
        System.out.print("La distancia del primer viaje es: ");
        System.out.println(viajeEnAuto1.calcularDistancia() + " Km");
        System.out.print("La ciudad de origen es: ");
        System.out.println(viajeEnAuto1.getOrigen().getNombre());
        System.out.print("La ciudad de destino es: ");
        System.out.println(viajeEnAuto1.getDestino().getNombre());
        System.out.println("El vehiculo en el que se viaja es un: " + viajeEnAuto1.getVehiculo().getMarca() + 
            ", con patente: " + viajeEnAuto1.getVehiculo().getPatente() + ", y su tipo de combustible es: " + 
            viajeEnAuto1.getVehiculo().getCombustible().getTipoCombustible() );
        System.out.println("Habra que abonar " + viajeEnAuto1.getCantidadPeajes() + " peajes" + ", con un costo de " + viajeEnAuto1.getVehiculo().getCuotaPeaje() + " pesos c/u");
        if(viajeEnAuto1.getOrigen().getRuta() == viajeEnAuto1.getDestino().getRuta()){
            System.out.println("Las ciudades se encuentran ambas en la ruta: " + viajeEnAuto1.getDestino().getRuta());
        }else{
            System.out.println("Las ciudades se encuentran en distintas rutas");
        }
        System.out.println("Se gastaran " + viajeEnAuto1.getVehiculo().calcularCostoDeCombustible(viajeEnAuto1.calcularDistancia()) + " pesos, en combustible");
        System.out.println("el costo total del viaje es de: " + viajeEnAuto1.costoTotal());
        
        
        //---------------------------------------------------------------------------------------------------
        System.out.println("--------------------------------");
        //creo un segundo viaje con 1 peaje para probar un auto con gas
        Viaje viajeEnAuto2 = new Viaje(1,sanLuis,cordoba,auto2,100);
        System.out.print("La distancia del segundo viaje es: ");
        System.out.println(viajeEnAuto2.calcularDistancia() + " Km");
        System.out.print("La ciudad de origen es: ");
        System.out.println(viajeEnAuto2.getOrigen().getNombre());
        System.out.print("La ciudad de destino es: ");
        System.out.println(viajeEnAuto2.getDestino().getNombre());
        System.out.println("El vehiculo en el que se viaja es un: " + viajeEnAuto2.getVehiculo().getMarca() + 
            ", con patente: " + viajeEnAuto2.getVehiculo().getPatente() + ", y su tipo de combustible es: " + 
            viajeEnAuto2.getVehiculo().getCombustible().getTipoCombustible() );
        System.out.println("Habra que abonar " + viajeEnAuto1.getCantidadPeajes() + " peajes" + ", con un costo de " + viajeEnAuto1.getVehiculo().getCuotaPeaje() + " pesos c/u");
        if(viajeEnAuto2.getOrigen().getRuta() == viajeEnAuto2.getDestino().getRuta()){
            System.out.println("Las ciudades se encuentran ambas en la ruta: " + viajeEnAuto2.getDestino().getRuta());
        }else{
            System.out.println("Las ciudades se encuentran en distintas rutas");
        }
        System.out.println("Se gastaran " + viajeEnAuto2.getVehiculo().calcularCostoDeCombustible(viajeEnAuto2.calcularDistancia()) + " pesos, en combustible");
        System.out.println("el costo total del viaje es de: " + viajeEnAuto2.costoTotal());
        
        //--------------------------------------------------------------------------------------------------
        System.out.println("--------------------------------");
        //creo un tercer viaje en camioneta con 2 peajes y con diesel
        Viaje viajeEnCamioneta1 = new Viaje(2,rufino,sanLuis,camioneta1);
        System.out.print("La distancia del tercer viaje es: ");
        System.out.println(viajeEnCamioneta1.calcularDistancia() + " Km");
        System.out.print("La ciudad de origen es: ");
        System.out.println(viajeEnCamioneta1.getOrigen().getNombre());
        System.out.print("La ciudad de destino es: ");
        System.out.println(viajeEnCamioneta1.getDestino().getNombre());
        System.out.println("El vehiculo en el que se viaja es un: " + viajeEnCamioneta1.getVehiculo().getMarca() + 
            ", con patente: " + viajeEnCamioneta1.getVehiculo().getPatente() + ", y su tipo de combustible es: " + 
            viajeEnCamioneta1.getVehiculo().getCombustible().getTipoCombustible() );
        System.out.println("Habra que abonar " + viajeEnCamioneta1.getCantidadPeajes() + " peajes" + ", con un costo de " + viajeEnCamioneta1.getVehiculo().getCuotaPeaje() + " pesos c/u");
        if(viajeEnCamioneta1.getOrigen().getRuta() == viajeEnCamioneta1.getDestino().getRuta()){
            System.out.println("Las ciudades se encuentran ambas en la ruta: " + viajeEnCamioneta1.getDestino().getRuta());
        }else{
            System.out.println("Las ciudades se encuentran en distintas rutas");
        }
        System.out.println("Se gastaran " + viajeEnCamioneta1.getVehiculo().calcularCostoDeCombustible(viajeEnCamioneta1.calcularDistancia()) + " pesos, en combustible");
        System.out.println("el costo total del viaje es de: " + viajeEnCamioneta1.costoTotal());
    }   
}
