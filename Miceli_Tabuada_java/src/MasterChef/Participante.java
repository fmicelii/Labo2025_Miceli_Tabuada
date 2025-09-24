package MasterChef;

import Colores.Color;
import Personas.Persona;

import java.time.LocalDate;

public abstract class Participante extends Persona{
    private ColorEquipo colorEquipo;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad) {
        super(nombre, apellido, fechaNacimiento, localidad);
    }

    public ColorEquipo getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(ColorEquipo colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    public abstract void PrepararCocina();
}
