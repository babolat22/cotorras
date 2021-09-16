package trabajopractico1;
public class TrabajoPractico1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Long nro;
        Alumno P1 = new Alumno();
        Alumno P2 = new Alumno(33333333, "Marta Laura");
        Alumno P3 = new Alumno(1242425655, "Marta Laura", 26642664); // 2n 
        System.out.println(P3.Hablar() +" "+ P3.nombre);
        
        Computadora compu = new Computadora();// vacio
        compu.setCPU("I7");
        compu.setRAM(8); 
        compu.setDisco(1000);
        compu.setVideo(true);
        Computadora compu2 = new Computadora(2,"core2Duo", false, 240);
        P1.ComprarCompu(compu);
        P2.ComprarCompu(compu2);
        
        System.out.println("P2 y sus pc: " + P1.mostrarComputadora().getCPU());
        System.out.println("P3 tiene: " +  P2.mostrarComputadora().getCPU());
        
        
    }
    // 1 alumno puede tener 1 o varias compus
}
