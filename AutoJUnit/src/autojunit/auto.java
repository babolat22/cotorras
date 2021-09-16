package autojunit;

public class auto {
    String modelo;
    float precioBase;
    static float impuesto;  // porcentaje

    public auto(String modelo, float precioBase) {
        this.modelo = modelo;
        this.precioBase = precioBase;
    }
    
    public float precioFinal(float descuento) throws Exception{
        float precioConDescuento = this.precioBase;
        if(descuento<0 || descuento>100){
            throw new RuntimeException("Descuento erroneo");
        }
        if (precioBase >5000){
            precioConDescuento = this.precioBase - (this.precioBase*descuento)/100f;
        }
        return precioConDescuento+precioConDescuento*this.impuesto/100f;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
}
