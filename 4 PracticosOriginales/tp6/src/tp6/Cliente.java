
package tp6;


public class Cliente {
 
//    Atributos
    private String nombre;
    private String apellido;
    private String domicilio;
    private String ciudad;
    private int nroTelefono;
    private int dni;


//    Construct
    public Cliente(String nombre, String apellido, String domicilio, String ciudad,int nroTelefono, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.nroTelefono = nroTelefono;
        this.dni = dni;
    }

//    Get Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDomicilio(){
        return domicilio;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }

    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public int getNroTelefono(){
        return nroTelefono;
    }
    public void setNroTelefono(int nroTelefono){
        this.nroTelefono = nroTelefono;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getDni() {
        return dni;
    }

}


