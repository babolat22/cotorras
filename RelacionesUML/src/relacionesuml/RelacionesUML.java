/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesuml;
/**
 *
 * @author juanj
 */
public class RelacionesUML {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B("msj secreto");
        C c1 = new C();
        G g1 = new G();
        a1.setAtrib(b1); //ASOCIACION CON A
        a1.usar(c1);     // dependencia
        D d1 = new D(a1, g1, 200); // CLASE ASOCIATIVA entre A y G
        E e1 = new E("Soy eFe");   // COMPOSICIÓN con F
        e1.addB(b1);               // AGREGACIÓN con B
        H objh = new H("radio: ", 3.6);
    }
}
class A {
    int a;
    B atrib;
    public void setAtrib(B atrib) {  
        this.atrib = atrib;
    }
    void usar (C c1){     // DEPENDENCIA    CON C
        System.out.println("Usando a C: "+ c1.getCad() + c1.nros[2]); 
    }
}
class B { String msj;  public B(String mens) { msj = mens; }}
class C {
    String cad = "Dependencia";
    int[] nros = {1,2,3};
    C[] ces = new C[3];   // relacion involutiva
    
    public String getCad() { return cad;  }
}
class D {
    A a1;
    G g1;
    int puntos;

    public D(A a1, G g1, int puntos) {
        this.a1 = a1;
        this.g1 = g1; 
        this.puntos = puntos;
    }
}
class E {
    F Compo;
    B Agrega;

    public E(String nom) {
        this.Compo = new F(nom);   // COMPOSICIÓN
    }
    
    public void addB(B elB){    // AGREGACIÓN
        this.Agrega = elB;
    }
}
class F {
    String nom;

    public F(String nom) {  // constructor de F
        this.nom = nom;
    }
}
class G {}
class H extends B {
    double h1;  //  atributo propio
    public H(String mens, double valor) {
        super(mens); // debe ser la 1er linea, invoca al constructor del padre
        h1 = valor;
    }
 }