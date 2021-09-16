
package ModeloUniversidad;

/**
 *
 * @kaiserkey
 * 
 */
public class Materia {
    private int id_materia;
    private String nombre;
    private String responsable;
    private String periodo;

    public Materia(){
        
    }
    
    public Materia(int id_materia, String nombre, String responsable, String periodo) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.responsable = responsable;
        this.periodo = periodo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setResponsable(String responsable){
        this.responsable=responsable;
    }
    
    public void setPeriodo(String periodo){
        this.periodo=periodo;
    }
    public void setIDMateria(int id_materia){
        this.id_materia=id_materia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getResponsable(){
        return this.responsable;
    }
    public String getPeriodo(){
        return this.periodo;
    }
    public int getIDMateria(){
        return this.id_materia;
    }

}
