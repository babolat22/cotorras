package p1ejercicio3;

import java.time.LocalDate;
import java.time.Period;


public class Fecha {
    int dia;
    int mes;
    int año;
    
    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public void calculaEdad(int dia, int mes, int año) {
        LocalDate fechaNac = LocalDate.of(año, mes, dia);
        System.out.printf("Desglosando...Dia: %s Nro.Mes: %s NombreMes: %s Año: %s\n", fechaNac.getDayOfMonth(), fechaNac.getMonthValue(), fechaNac.getMonth(), fechaNac.getYear()); 
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días\n",
        periodo.getYears(), periodo.getMonths(), periodo.getDays()); 
    }
    
    public int diasQueFaltan(int dia, int dia1, int mes, int mes1, int año, int año1) {
        int diasQF = 0;
        LocalDate fecha1 = LocalDate.of(año, mes, dia);
        LocalDate fecha2 = LocalDate.of(año1, mes1, dia1);
        if (fecha1.getYear()==fecha2.getYear()){
            Period periodo = Period.ofDays(dia); //  .between(fecha2, fecha1);
            diasQF = periodo.getDays();
        } else
           System.out.printf("La fecha es del pasado!..."); 
       
        return diasQF;
}
     public void diasVividos(int dia, int mes, int año) {
        LocalDate fechaNac = LocalDate.of(año, mes, dia);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Has vivido en promedio %s días\n",
          (periodo.getYears()*365)+ (periodo.getMonths()*30)+ periodo.getDays()); 
    }
     
    public int diasQueFaltan2(int dia, int mes, int año) {
         LocalDate fNac = LocalDate.of(año, mes, dia);
        LocalDate fHoy = LocalDate.now();
        int cumple = fNac.getDayOfYear();
        int hoy = fHoy.getDayOfYear();
        if (cumple>=hoy)
            return cumple-hoy;
        else
            return 365-hoy+cumple;
        
    } 
}