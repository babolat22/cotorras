package p2ejercicio2;

public class numero {
    int n;
    String color="rojo";
    int docena;
    
    public numero(int n, int docena) {
        this.n = n;
        this.docena = docena;
        setColor();
    }
    public numero() {    //para el cero
        n = 0;
        docena = 1;
        color = "Verde";
    }   
   boolean esPar(){
       return (n%2==0);  //13%2 = 1 
   }
   
   void setColor(){
   // la suma de sus cifras da un resultado impar: el 12 es compuesto de 1 y 2 que sumados dan 3 que es impar.   
        System.out.println("cifras sumadas: "+ (n%10+n/10));
        if((n%10+n/10)%2==0) this.color = "negro"; 
   }
   String getColor(){
       return this.color;
   }
   int ladocena(int n){
       return docena;
   }  
            
}
