package practico2;

public class Viaje {
    private final Ciudad origen;
    private final Ciudad destino;
    private final Vehiculo vehiculo;
    private final int cantPeajes;
    private double distancia=0;
    
    private double costoTotalPeajes=0;
    private double costoCombustibleTotal=0;

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantPeajes, double distancia) {
        this.origen=    origen;
        this.destino=   destino;
        this.vehiculo=  vehiculo;
        this.cantPeajes=cantPeajes;
        this.distancia= distancia;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantPeajes) {
        this.origen=    origen;
        this.destino=   destino;
        this.vehiculo=  vehiculo;
        this.cantPeajes=cantPeajes;
    }
    
    public void calculoDistancia(){
        if(origen.ruta == destino.ruta){
            distancia=Math.abs(origen.getKm()-destino.getKm());
            System.out.println("La distancia a recorrer sera de "+distancia+"Km");
        }
        else{
            System.out.println("La distancia a recorrer sera de "+distancia+"Km");
        }
    } 
    
    public void calculoCostoPeajes(){
        costoTotalPeajes=vehiculo.costoPeaje*cantPeajes;
        System.out.println("El costo total en peajes será de $"+costoTotalPeajes);
    }
    
    public void calculoCostoCombustible(){
        if(distancia!=0){
            costoCombustibleTotal=vehiculo.calcularCostoCombustible(distancia);
            System.out.println("El costo total en combustible sera de: $"+costoCombustibleTotal);
        } else {
            System.out.println("Por favor, primero calcule o introduzca por parametro la distancia entre ambas ciudades.");
        }
    }
    
    public void calculoCostoTotal(){
        if(costoCombustibleTotal!=0){
            double costoTotal= costoTotalPeajes+costoCombustibleTotal;
            System.out.println("El costo total del viaje es de: $"+costoTotal);
        }else{
            System.out.println("Por favor, primero calcule el costo en combustible");
        }
    }
    
}
