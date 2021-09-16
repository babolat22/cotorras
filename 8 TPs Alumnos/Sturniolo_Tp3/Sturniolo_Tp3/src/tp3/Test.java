package tp3;

import java.time.*;

public class Test {

    public static void main(String[] args) {
        Registro miRegistro = new Registro();
        Trabajador miTrabajador = new Trabajador("Bruno","36046044",LocalDate.of(1991, Month.NOVEMBER, 13),"Av Cuchi Corral 1392",30500.55);
        Jubilado miJubilado = new Jubilado("jubilado","92356122",LocalDate.of(1950, Month.MARCH, 5),"hogar del jubilado");
        miRegistro.procesarDatos(miTrabajador);
        miRegistro.procesarDatos(miJubilado);
    }
}
