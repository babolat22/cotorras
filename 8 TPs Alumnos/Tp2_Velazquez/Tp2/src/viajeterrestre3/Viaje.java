package viajeterrestre3;

public class Viaje {

    private Ciudad lugarDeOrigen;

    private Ciudad lugarDeDestino;

    private double distanciaCiudades;

    private Vehiculo vehiculo;

    private int cantPeajes;


    public Viaje(Ciudad lugarDeOrigen, Ciudad lugarDeDestino, int cantPeajes, Vehiculo vehiculo) {
        this.lugarDeOrigen=lugarDeOrigen;
        this.lugarDeDestino=lugarDeDestino;
        this.cantPeajes=cantPeajes;
        this.vehiculo=vehiculo;
        //distanciaCiudades=0;
    }

    public Viaje(Ciudad lugarDeOrigen, Ciudad lugarDeDestino, int cantPeajes, Vehiculo vehiculo, double distanciaCiudades) {
        this.lugarDeOrigen=lugarDeOrigen;
        this.lugarDeDestino=lugarDeDestino;
        this.cantPeajes=cantPeajes;
        this.vehiculo=vehiculo;
        this.distanciaCiudades=distanciaCiudades;
    }

    public double getDistanciaCiudades() {
        return distanciaCiudades;
    }

    public double calculoDistancia() {
        if (lugarDeOrigen.getRuta()== lugarDeDestino.getRuta()){
            return  Math.abs(lugarDeOrigen.getKm() - lugarDeDestino.getKm());
        }
        else {
            return  getDistanciaCiudades();
        }
    }

    public double costoPeaje() {
       return cantPeajes * vehiculo.costoPeaje();
    }

    public double costoTotalCombustible() {
        return ((vehiculo.calcularCostoDeCombustible()* calculoDistancia())*vehiculo.combustible.getPrecio());
                                                                                            
    }

    public double costoTotal() {
        return costoPeaje()+costoTotalCombustible() ;
    }
}