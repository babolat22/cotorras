package clases;

public class Viaje {

    private Ciudad origen;
    private Ciudad destino;
    private double distancia = 0;
    private Vehiculo vehiculo;
    private int peajes = 0;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Viaje(Ciudad o, Ciudad d, Vehiculo v, int p) {
        origen = o;
        destino = d;
        vehiculo = v;
        peajes = p;
        distancia = calcularDistancia();
    }

    public Viaje(Ciudad o, Ciudad d, Vehiculo v,int p, double dist) {
        origen = o;
        destino = d;
        vehiculo = v;
        distancia = dist;
        peajes=p;
    }

    //--------------------------------------------------------------//
    
    public void realizarViaje(){
        System.out.println("Se va a realizar un viaje desde "+origen.getNombre()+" hasta "+destino.getNombre()+".");
        String v;
        double c;
        if (vehiculo instanceof Camion){
            v="Camion";
            c=0.12;
        } else if (vehiculo instanceof Camioneta){
            v="Camioneta";
            c=0.1;
        } else {
            v="Auto";
            c=0.07;
        }
        System.out.println("Se van a recorrer "+distancia+" KM en un/a "+v+" y hay "+peajes+" peajes en el trayecto.");
        System.out.println("El costo por la distancia es de $"+costoDistancia()+".");
        System.out.println("El vehiculo consume "+c+" litros por KM y el combustible cuesta "+vehiculo.getCombustible().getPrecio()+" por litro.");
        System.out.printf("El costo en peajes es de $%.2f y el costo en combustible es $%.2f%n",costoPeajes(),costoCombustible());
        System.out.println("El total suma $"+costoTotal());
    }
    
    
    public double costoTotal() {
        return costoPeajes() + costoDistancia() + costoCombustible();
    }
    
    public double costoCombustible(){
        return distancia * vehiculo.calcularCostoDeCombustible();
    }

    public double calcularDistancia() {
        return Math.abs(destino.getKm()-origen.getKm());
    }

    public double costoDistancia() {
        return distancia * 10;
    }

    public double costoPeajes() {
        return peajes * vehiculo.getCostoPeaje();
    }

    //--------getters y setters------------------------//
    
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

    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

}

//Codigo viejo
//Una amiga mia dijo "¿para que hacerla facil si te la podes complicar?"

/*
    public void calcularDistancia() {

        //calcula la distancia entre dos puntos usando el teorema de pitagoras
        
        double x1, y1, x2, y2, modulo1, modulo2;

        x1 = origen.getKmLat();
        y1 = origen.getKmAlt();

        x2 = destino.getKmLat();
        y2 = destino.getKmLat();

        modulo1 = Math.abs(x1 - x2);
        modulo2 = Math.abs(y1 - y2);

        distancia = Math.sqrt(modulo1 * modulo1 + modulo2 * modulo2);
    }

    public class Ciudad {
    private String nombre;
    private int kmAlt;
    private int kmLat;
    private short ruta;

    public Ciudad(String n, int altitud, int longitud, short r) {
        nombre=n;
        kmAlt = altitud;
        kmLat = longitud;
        ruta = r;
    }



*/
