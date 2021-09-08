package pelijuegos;
/**
 *
 * Clase videojuego
 *
 * Contiene la informacion sobre un videojuego
 *
 * @author DiscoDurodeRoer
 */
public class Videojuego {
    //Constantes
    private final static int HORAS_ESTIMADAS_DEF=100;  // Horas estimadas por defecto
  
    //Atributos
    private String titulo;
    private int horasEstimadas;
    private String genero;
    private String compañia;
  
    //Constructores
    public Videojuego(){
        this("",HORAS_ESTIMADAS_DEF, "", ""); //Constructo por defecto
    }
  
    /**
     * Constructor con 2 parametros
     * @param titulo del videojuego
     * @param compañia del videojuego
     */
    public Videojuego(String titulo, String compañia){
        this(titulo,HORAS_ESTIMADAS_DEF, "", compañia);
    }
  
    /**
     * Constructor con 4 parametros
     * @param titulo del videojuego
     * @param horasEstimadas
     * @param genero del videojuego
     * @param compañia del videojuego
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compañia=compañia;
    }

   
    //Métodos publicos
    /**
     * Devuelve el titulo del videojuego
     * @return titulo del videojuego
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Modifica el titulo del videojuego
     * @param titulo a cambiar
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Devuelve el numero de paginas del videojuego
     * @return numero de paginas del videojuego
     */
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
    /**
     * Modifica el numero de paginas del videojuego
     * @param horasEstimadas
     */
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    /**
     * Devuelve el genero del videojuego
     * @return genero del videojuego
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Modifica el genero del videojuego
     * @param genero a cambiar
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Devuelve el compañia del videojuego
     * @return compañia del videojuego
     */
    public String getcompañia() {
        return compañia;
    }
    /**
     * Modifica el compañia del videojuego
     * @param compañia a cambiar
     */
    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }
    /**
     * Muestra informacion del videojuego
     * @return cadena con toda la informacion del videojuego
     */
    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia;
    }
  
    /**
     * Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
     * @param a videojuego a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
            return true;
        }
        return false;
    }
  
}  