package TratamientoModificacionSangre;

import Personas.Genero;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
    }
}
