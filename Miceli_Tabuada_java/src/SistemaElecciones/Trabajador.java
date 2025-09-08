package SistemaElecciones;

import Personas.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Trabajador extends Persona implements Mensajero{
    private int numeroCuil;
    private double sueldo;
    private int horaInicio,horaFinal;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion, int numeroCuil, double sueldo, int horaInicio, int horaFinal) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.numeroCuil = numeroCuil;
        this.sueldo = sueldo;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public int getNumeroCuil() {
        return numeroCuil;
    }

    public void setNumeroCuil(int numeroCuil) {
        this.numeroCuil = numeroCuil;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }
    @Override
    public String configurarMensaje() throws NoEsSuHorarioLaboralException{
        int horaAhora = LocalTime.now().getHour();
        if (horaAhora > getHoraInicio() && horaAhora < getHoraFinal()){
            String m = "Yo, " + getNombre() + " te invito a que… ";
            return m;
        }
        throw new NoEsSuHorarioLaboralException("el trabajador no esta en su horario laboral");
    }
}
