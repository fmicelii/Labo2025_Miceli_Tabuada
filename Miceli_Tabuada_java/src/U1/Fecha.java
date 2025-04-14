package U1;
import java.time.YearMonth;
import java.time.LocalDate;


public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha() {
        this.dia = 28;
        this.mes = 04;
        this.anio = 2008;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void valida() {
        if (mes > 12) {
            setMes(12);
        }
        if (mes == 2) {
            setDia(28);
        }
        YearMonth ym = YearMonth.of(anio, mes);
        if (dia > ym.lengthOfMonth()) {
            setDia(ym.lengthOfMonth());
        }

        System.out.println(dia + " / " + mes + " / " + anio);
    }

    public void diasMes() {
        YearMonth DM = YearMonth.of(anio, mes);
        System.out.println(DM.lengthOfMonth());
    }

    public void corta() {
        System.out.println(dia + "-" + mes + "-" + anio);
    }

    public void larga(){
        LocalDate fecha = LocalDate.of(2024, 4, 15);
        String ds = String.valueOf(fecha.getDayOfWeek());
        String ma = String.valueOf(fecha.getMonth());
        System.out.println(ds + " " + dia + " de " + ma + " de " + anio);
    }

    public LocalDate siguiente(){
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        return fecha.plusDays(1);
    }
    public LocalDate anterior(){
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        return fecha.minusDays(1);
    }
    public void compararFechas(Fecha fe2){
        LocalDate f1 = LocalDate.of(anio,mes,dia);
        LocalDate f2 = LocalDate.of(anio,mes,dia);
        if (f1.isBefore(f2)) {
            System.out.println("La primera fecha es anterior.");
        } else if (f1.isAfter(f2)) {
            System.out.println("La primera fecha es posterior.");
        } else {
            System.out.println("Las fechas son iguales.");
        }    }

    public static void main(String[] args) {
        Fecha fe1 = new Fecha(87,98,2012);
        Fecha fe2 = new Fecha(21,10,2010);

        fe1.valida();
        fe1.diasMes();
        fe1.corta();
        fe1.larga();
        fe1.siguiente();
        fe1.anterior();
        //igualQue, mayorQue, menorQue
        fe1.compararFechas(fe2);
    }
    }



