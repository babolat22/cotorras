package practico3;

public class Practico3 {
    
public static void main(String[] args) {

    Registro registro = new Registro();
    Trabajador laburante = new Trabajador("Leandro Weber","37406780","16/05/1993","Calle falsa 123");
    Jubilado viejito = new Jubilado("Ermenegildo Hermosilla","0419052","28/07/1945","Ruta 3 Km 36");
    
    registro.procesarDatos(laburante);
    registro.procesarDatos(viejito);
}
}
