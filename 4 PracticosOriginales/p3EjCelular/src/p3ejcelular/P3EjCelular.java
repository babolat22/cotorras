package p3ejcelular;
/**
 *
 * @author juanj
 */
public class P3EjCelular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        smartphone Xiaomi = new smartphone();
        Xiaomi.setColor("Black");
        Xiaomi.setMarca("Xiaomi");
        Xiaomi.setModelo("MI 8 Lite");
        Xiaomi.setMpx(48);
        Xiaomi.setTamañoMemoriaInterna(64);
        Xiaomi.setTamañoMemoriaExterna(264);
        Xiaomi.llamar();
        Xiaomi.cortarLlamada();
        Xiaomi.infoCaracteristicas();
    }
    
}
