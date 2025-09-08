package CampeonatoArcoFlecha;

import CampeonatoArcoFlecha.Beneficios.Beneficio;

import java.util.HashSet;

public class SistemaArcoFlecha {
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficiosOfrecidos;

    public SistemaArcoFlecha(HashSet<Bar> bares, HashSet<Diana> dianas, HashSet<Beneficio> beneficiosOfrecidos) {
        this.bares = bares;
        this.dianas = dianas;
        this.beneficiosOfrecidos = beneficiosOfrecidos;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficiosOfrecidos() {
        return beneficiosOfrecidos;
    }

    public void setBeneficiosOfrecidos(HashSet<Beneficio> beneficiosOfrecidos) {
        this.beneficiosOfrecidos = beneficiosOfrecidos;
    }
     public double conocerAreaDiana(Diana diana)throws DianaNotFoundException{
        if (dianas.contains(diana)){
            return diana.getFormaDiana().calcularArea();
        }
        throw new DianaNotFoundException("la diana solicitada no esta en el sistema bro");
     }

}