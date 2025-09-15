package TratamientoModificacionSangre;

import Personas.Genero;

import java.time.LocalDate;
import java.time.Period;

public class Nino extends Paciente implements Tratable{
    private int toleranciaMedicamentos; // 1 = menos tolerante, 10 = más tolerante

    public Nino(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre, int toleranciaMedicamentos) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
        this.toleranciaMedicamentos = Math.max(1, Math.min(toleranciaMedicamentos, 10));
    }

    public int getToleranciaMedicamentos() {
        return toleranciaMedicamentos;
    }

    public void setToleranciaMedicamentos(int toleranciaMedicamentos) {
        this.toleranciaMedicamentos = toleranciaMedicamentos;
    }

    public boolean esMayor() {
        LocalDate hoy = LocalDate.now();
        boolean mayorcito = Period.between(getFechaNacimiento(), hoy).getYears() > 3;
        return mayorcito;
    }

    @Override
    public void mensaje() {
        if (esMayor()){
            System.out.println("Tu tratamiento tardará esta cantidad de días: " + toleranciaMedicamentos*2);
        }else {
            System.out.println("Aún es chico para probar el tratamiento");
        }
    }
}
