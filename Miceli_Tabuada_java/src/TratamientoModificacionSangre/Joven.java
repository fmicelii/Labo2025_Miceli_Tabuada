package TratamientoModificacionSangre;

import Personas.Genero;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Joven extends Paciente implements Tratable{
    private static int edadMinima = 20;
    private static int edadMaxima = 30;
    private HashSet<String> actividadesDeportivas;

    public Joven(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre, HashSet<String> actividadesDeportivas) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
        this.actividadesDeportivas = actividadesDeportivas;
    }

    public static int getEdadMinima() {
        return edadMinima;
    }

    public static void setEdadMinima(int edadMinima) {
        Joven.edadMinima = edadMinima;
    }

    public static int getEdadMaxima() {
        return edadMaxima;
    }

    public static void setEdadMaxima(int edadMaxima) {
        Joven.edadMaxima = edadMaxima;
    }

    public HashSet<String> getActividadesDeportivas() {
        return actividadesDeportivas;
    }

    public void setActividadesDeportivas(HashSet<String> actividadesDeportivas) {
        this.actividadesDeportivas = actividadesDeportivas;
    }

    public boolean esImpar(int numero) {
        return numero % 2 != 0;
    }

    @Override
    public double costoTratamiento() {
        if (esImpar(getFechaNacimiento().getYear())){
            return LocalDate.now().getMonthValue() * 760000;
        }
        return LocalDate.now().getDayOfMonth() * 145400; //creo q esta mal, habria q no hardcodear, dsp me fijo lol
    }

    @Override
    public void mensaje() {
        LocalDate hoy = LocalDate.now();
        if (esImpar(getActividadesDeportivas().size()) && Period.between(getFechaNacimiento(),hoy).getYears() > getEdadMaxima()-2){
            System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        }else {
            System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
        }
    }
}
