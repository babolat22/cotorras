package practico2viaje;


public class Viaje {

    private Ciudad origen;

    private Ciudad destino;

    private Vehiculo vehiculo;

    private int cantidadPeajes;

    private double distancia;

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantidadPeajes, double distancia) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
        this.distancia = distancia;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantidadPeajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantidadPeajes = cantidadPeajes;
    }
    

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadPeajes() {
        return cantidadPeajes;
    }

    public void setCantidadPeajes(int cantidadPeajes) {
        this.cantidadPeajes = cantidadPeajes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    

     public double calculoCostoPeaje(){
        if (vehiculo instanceof Camion){
        return cantidadPeajes*150;
                } else {return cantidadPeajes*100;}
    }

    public double calculoDeDistancia() {
       if(distancia==0){
           distancia=Math.abs(destino.getKm()-origen.getKm());
       }
       return distancia;                              
    }

    public double calculoCostoCombustible() {
        return vehiculo.calcularCostoDeCombustible(distancia);
    }

    public double calculoCostoTotal() {
        return calculoCostoCombustible()+calculoCostoPeaje();
    }
}
