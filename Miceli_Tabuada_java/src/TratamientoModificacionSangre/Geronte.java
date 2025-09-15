package TratamientoModificacionSangre;

import Personas.Genero;

import java.time.LocalDate;

public class Geronte extends Paciente{
    public Geronte(String nombre, String apellido, LocalDate fechaNacimiento, Genero genero, TipoSangre tipoSangre) {
        super(nombre, apellido, fechaNacimiento, genero, tipoSangre);
    }
}
