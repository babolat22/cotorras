package p3ejcelular;
/**
 *
 * @author juanj
 */
    public class smartphone extends celular{
    private int mpx;
    private int tamañoMemoriaInterna;
    private int tamañoMemoriaExterna;
    public smartphone(String marca, String modelo, String color, int mpx, int
    tamañoMemoriaInterna, int tamañoMemoriaExterna) {
        super(marca, modelo, color);
        this.mpx = mpx;
        this.tamañoMemoriaInterna = tamañoMemoriaInterna;
        this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }
    public smartphone() {
    }
    public int getMpx() {
    return mpx;
    }
    public void setMpx(int mpx) {
    this.mpx = mpx;
    }
    public int getTamañoMemoriaInterna() {
    return tamañoMemoriaInterna;
    }
    public void setTamañoMemoriaInterna(int tamañoMemoriaInterna) {
    this.tamañoMemoriaInterna = tamañoMemoriaInterna;
    }
    public int getTamañoMemoriaExterna() {
    return tamañoMemoriaExterna;
    }
    public void setTamañoMemoriaExterna(int tamañoMemoriaExterna) {
    this.tamañoMemoriaExterna = tamañoMemoriaExterna;
    }
    @Override
    public void infoCaracteristicas(){
    System.out.println("Marca: " + super.getMarca());
    System.out.println("Modelo: " + super.getModelo());
    System.out.println("Color: " + super.getColor());
    System.out.println("MPX: " + this.mpx);
    System.out.println("Memoria interna: " + this.tamañoMemoriaInterna);
    System.out.println("Memoria externa: " + this.tamañoMemoriaExterna);
    }
}