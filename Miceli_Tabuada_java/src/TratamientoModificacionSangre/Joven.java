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

    @Override
    public void mensaje() {
        int act = actividadesDeportivas.size() % 2;
        LocalDate hoy = LocalDate.now();
        if (act == 1 && Period.between(getFechaNacimiento(),hoy).getYears() > getEdadMaxima()-2){
            System.out.println("Lamentamos comunicarte que tu sangre aún no va a poder ser modificada");
        }else {
            System.out.println("Será un tratamiento costoso, pero lo vamos a lograr");
        }
    }
}
