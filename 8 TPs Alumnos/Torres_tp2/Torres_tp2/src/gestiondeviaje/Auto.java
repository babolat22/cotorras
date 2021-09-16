package gestiondeviaje;

public class Auto extends Vehiculo {
    
    private final int CANTLTS = 7; //Constante(en mayus),(final) no cambia nunca de valor
    
    
    public Auto(String marca, String patente, String combustible) {
        super(marca, patente, combustible);
        
    
}

    public Auto() {
    }
    
    

    
    public double CalculoCostoCombustible(double distancia,double precio) {
        return (CANTLTS*distancia/100)*precio;
    }
}