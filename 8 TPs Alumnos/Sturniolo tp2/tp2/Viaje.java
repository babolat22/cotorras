package tp2;

public class Viaje {

    private int cantidadPeajes;

    private Ciudad origen;

    private Ciudad destino;

    private double distancia;

    private Vehiculo vehiculo;

    public Viaje(int cantPeajes, Ciudad o, Ciudad d, Vehiculo v) {
        this.cantidadPeajes = cantPeajes;
        this.origen = o;
        this.destino = d;
        this.vehiculo = v;
    }

    public Viaje(int cantPeajes, Ciudad o, Ciudad d, Vehiculo v, double distancia) {
        this.cantidadPeajes = cantPeajes;
        this.origen = o;
        this.destino = d;
        this.vehiculo = v;
        this.distancia = distancia;
    }

    public int getCantidadPeajes() {
        return cantidadPeajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    }
        

    public double calcularDistancia() {
        if(origen.getRuta() == destino.getRuta()){
            return Math.abs(destino.getKm() - origen.getKm());
        }else{
            return distancia;
        }
    }

    public double costoPeaje() {
        return cantidadPeajes * vehiculo.getCuotaPeaje();
    }

    public double costoCombustible() {
        if(origen.getRuta() == destino.getRuta()){
           return vehiculo.calcularCostoDeCombustible(calcularDistancia());
        }else{
            return vehiculo.calcularCostoDeCombustible(distancia);
        }
    }

    public double costoTotal() {
        return costoPeaje() + costoCombustible();
    }
}
