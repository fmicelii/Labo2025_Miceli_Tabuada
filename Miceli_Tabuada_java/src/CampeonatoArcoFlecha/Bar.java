package CampeonatoArcoFlecha;

import CampeonatoArcoFlecha.Beneficios.Beneficio;
import CampeonatoArcoFlecha.Beneficios.BeneficioAcumulable;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private int cantidadTiradores;
    private int dineroRecaudado;
    private HashSet<Beneficio> beneficiosImplementados;
    private HashSet<BeneficioAcumulable> beneficiosAcumulablesImplementados;

    public Bar(HashSet<Diana> dianas, int cantidadTiradores, int dineroRecaudado, HashSet<Beneficio> beneficiosImplementados, HashSet<BeneficioAcumulable> beneficiosAcumulablesImplementados) {
        this.dianas = dianas;
        this.cantidadTiradores = cantidadTiradores;
        this.dineroRecaudado = dineroRecaudado;
        this.beneficiosImplementados = beneficiosImplementados;
        this.beneficiosAcumulablesImplementados = beneficiosAcumulablesImplementados;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCantidadTiradores() {
        return cantidadTiradores;
    }

    public void setCantidadTiradores(int cantidadTiradores) {
        this.cantidadTiradores = cantidadTiradores;
    }

    public int getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficiosImplementados() {
        return beneficiosImplementados;
    }

    public void setBeneficiosImplementados(HashSet<Beneficio> beneficiosImplementados) {
        this.beneficiosImplementados = beneficiosImplementados;
    }

    public HashSet<BeneficioAcumulable> getBeneficiosAcumulablesImplementados() {
        return beneficiosAcumulablesImplementados;
    }

    public void setBeneficiosAcumulablesImplementados(HashSet<BeneficioAcumulable> beneficiosAcumulablesImplementados) {
        this.beneficiosAcumulablesImplementados = beneficiosAcumulablesImplementados;
    }

}