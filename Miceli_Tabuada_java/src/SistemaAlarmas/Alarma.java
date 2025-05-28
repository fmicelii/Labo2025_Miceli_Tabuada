package SistemaAlarmas;

import java.time.LocalDate;

public class Alarma {
    private boolean estado;
    private double medida;
    private double umbrialInicial;
    private LocalDate anoAdquisicion;

    public Alarma(double medida, double umbrialInicial) {
        this.estado = true;
        this.medida = medida;
        this.umbrialInicial = umbrialInicial;
        this.anoAdquisicion = LocalDate.now();
    }
    public Alarma() {
        this.estado = true;
        this.medida = 0.0;
        this.umbrialInicial = 1.0;
        this.anoAdquisicion = LocalDate.now();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getUmbrialInicial() {
        return umbrialInicial;
    }

    public void setUmbrialInicial(double umbrialInicial) {
        this.umbrialInicial = umbrialInicial;
    }

    public LocalDate getAnoAdquisicion() {
        return anoAdquisicion;
    }

    public void setAnoAdquisicion(LocalDate anoAdquisicion) {
        this.anoAdquisicion = anoAdquisicion;
    }

    public void comprobarMedida(){
        if (medida > umbrialInicial){
            System.out.println("Disparar Alarma");
        }
    }
}
