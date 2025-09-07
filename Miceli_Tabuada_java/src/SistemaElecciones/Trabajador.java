package SistemaElecciones;

import Personas.Persona;

import java.time.LocalDate;

public class Trabajador extends Persona {
    private int numeroCuil;
    private double sueldo;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion, int numeroCuil, double sueldo) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.numeroCuil = numeroCuil;
        this.sueldo = sueldo;
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
}
