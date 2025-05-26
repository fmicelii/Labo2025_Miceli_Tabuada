package Restaurante;
import Personas.Persona;
import Personas.Profesor;

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
    public Pedido(){
        this.fecha = LocalDate.now();
        this.horaEntrega = LocalTime.now();
        this.plato = null;
        this.solicitante = new Profesor();
        this.estaEntregado = false;
    }
    public Pedido(Plato plato){
        this.fecha = LocalDate.now();
        this.horaEntrega = LocalTime.now();
        this.plato = plato;
        this.solicitante = new Profesor();
        this.estaEntregado = true;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public boolean isEstaEntregado() {
        return estaEntregado;
    }

    public void setEstaEntregado(boolean estaEntregado) {
        this.estaEntregado = estaEntregado;
    }
}
