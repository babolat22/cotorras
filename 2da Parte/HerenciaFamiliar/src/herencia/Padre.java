package herencia;

public abstract class Padre {
    private String nombre;
    protected String apellido;
    protected Auto auto=null; // OPCIONAL
    protected Casa casa=null;

    public Padre(String apellido, Auto a) {
        nombre="Papá";
        this.apellido = apellido;
        comprarAuto(a);
        construirCasa();
    } 
    private void comprarAuto(Auto auto){  // AGREGACIÓN
        this.auto = auto;
    }
    private void construirCasa(){  // COMPOSICIÓN
        casa= new Casa("Centro. (2)pisos");
    }
    
    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    // HERENCIA DEL PADRE
    public void cantar(){
        System.out.println("Recuerda que tu padre, Don "+this.apellido+" te enseño a cantar");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }   
}