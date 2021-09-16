package carreramortal;

public class Rueda {
    //Atributo que almacena la marca que posee una rueda
    private String marca;

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    double presion =28.0;
    //Constructor que me permite pasar como parámetro la marca
    //de la rueda al momento de instanciar la clase Rueda con "new"
    public Rueda(String marca){
        //Asigno la cantidad de tuercas que me pasan por constructor al atributo
        //de la clase cantTuercas 
        this.marca = marca;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    
    public void inflar(int num){
        presion=29;
        System.out.println("se inflo la rueda "+num);
    }
    
    public void desinflar(){
        presion -=0.5;
    }
    
}
