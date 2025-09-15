package TratamientoModificacionSangre;

import Personas.Genero;
import Personas.Persona;

import java.time.LocalDate;

public abstract class Paciente extends Persona {
    private TipoSangre tipoSangre;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero);
        this.tipoSangre = tipoSangre;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

}
