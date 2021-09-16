public class Viaje {

    private int cantPeajes;

    private Ciudad origen;

    private Ciudad destino;

    private double distancia;

    private Vehiculo vehiculo;

    public Viaje(int cantPeajes, Ciudad origen, Ciudad destino, Vehiculo vehiculo) {
    }

    public Viaje(int cantPeajes, Ciudad origen, Ciudad destino, Vehiculo vehiculo, double distancia) {
    }

    public double calcDistancia() {
        if(destino.getKm() > origen.getKm()){
            return(destino.getKm()-origen.getKm());
        }else{
            return(origen.getKm() - destino.getKm());}
    }

    public double costoPeaje() {
        
        return (vehiculo.getCostoPeaje()*cantPeajes);
        
    }

    public double costoComb() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double costoTotal() {
        return (costoPeaje() + costoComb());
    }

    public int getCantPeajes() {
        return cantPeajes;
    }

    public void setCantPeajes(int cantPeajes) {
        this.cantPeajes = cantPeajes;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}
