package Restaurante;
import Personas.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fecha;
    private LocalTime horaEntrega;
    private Plato plato;
    private Persona solicitante;
    private boolean estaEntregado;

    public Pedido(LocalDate fecha, LocalTime horaEntrega, Plato plato, Persona solicitante, boolean estaEntregado) {
        this.fecha = fecha;
        this.horaEntrega = horaEntrega;
        this.plato = plato;
        this.solicitante = solicitante;
        this.estaEntregado = estaEntregado;
    }


}
