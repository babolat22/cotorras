
package ModeloUniversidad;

/**
 *
 * @kaiserkey
 * 
 */
public class Cursada {
    
    private int nota;
    private int id_cursada;
    private Alumno alumno;
    private Materia materia;

    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    public Cursada(int id_cursada, Alumno alumno, Materia materia, int nota) {
        this.id_cursada = id_cursada;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada(){
        
    }
    
    public void setNota(int nota){
        this.nota=nota;
    }
    
    public void setIDCursada(int id_cursada){
        this.id_cursada = id_cursada;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
        
    public void setMateria(Materia materia){
        this.materia = materia;
    }
    public int getNota(){
        return this.nota;
    }
    public int getIDCursada(){
        return this.id_cursada;
    }
    
    public Alumno getAlumno(){
        return this.alumno;
    }
    
    public Materia getMateria(){
        return this.materia;
    }
    
    
    
}
