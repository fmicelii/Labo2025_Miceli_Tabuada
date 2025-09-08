package SistemaElecciones;

import Personas.Persona;

import java.time.LocalDate;

public class Trabajador extends Persona implements Mensajero{
    private int numeroCuil;
    private double sueldo;

    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion, int numeroCuil, double sueldo) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.numeroCuil = numeroCuil;
        this.sueldo = sueldo;
    }

    @Override
    public String configurarMensaje() throws TelefonoException{
        if (estaPrendido && tieneCredito){
            String m = "Conectando con la antena más cercana";
            return m;
        }
        throw new TelefonoException("el telefono no esta prendido o no tiene credito");
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
