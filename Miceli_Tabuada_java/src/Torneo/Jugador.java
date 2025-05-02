package Torneo;

import java.time.LocalDate;

public class Jugador {
    private String nombre;
    private LocalDate fecha_nacimiento;
    private int numero;

    public Jugador(){
        this.nombre = "seba";
        this.fecha_nacimiento = LocalDate.of(2008,10,26);
        this.numero = 18;
    }
    public Jugador(String nombre, LocalDate fecha_nacimiento, int numero) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
