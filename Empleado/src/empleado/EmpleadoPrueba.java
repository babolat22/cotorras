
package empleado;

/**
 *
 * @author juanj
 */
public class EmpleadoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado("vendedor");
        e1.calculaSalarioBruto("vendedor", 0, -1);
        Empleado e2 = new Empleado("encargado");
    }
    
    
}
class Empleado{
    String tipoEmpleado;

    public Empleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    double calculaSalarioBruto(String tipoEmpleado, double ventasMes, int horasExtra){
        //Por último, cada hora extra se pagará a 20 euros. Si tipo es null, o ventasMes o horasExtra toman valores negativos el método lanzará una excepción de tipo BRException.
        double salario=0;
        if (tipoEmpleado.equals("")|| ventasMes<0 || horasExtra<0)
             throw new RuntimeException("El tipo es vacio");
        else{
  
            if(tipoEmpleado.equals("vendedor"))
                salario = 1500 + horasExtra * 20;
            else 
                salario =1500 + horasExtra * 20;   //encargado
            if (ventasMes>=1500 )
                salario+=200;
            else if (ventasMes>=1000 )
                salario+=100;
        }
        
        return salario;
    }

    double calculaSalarioNeto (float salarioBruto){
     double neto=salarioBruto;  //no se aplicará ninguna retención si salario menor a 1000
     if (salarioBruto<0)
             throw new RuntimeException("El salario es negativo");
     if(salarioBruto>=1500)
         neto = salarioBruto- salarioBruto* 0.18;
     else if(salarioBruto>=1000&&salarioBruto<1500)
         neto = salarioBruto- salarioBruto* 0.16;  
                
     return neto;

    }
}