package CampeonatoArcoFlecha.Beneficios;

import Restaurante.Plato;

import java.util.HashSet;

public class BeneficioTrago extends Beneficio{
    private HashSet<Plato> tragosBeneficiados;

    public BeneficioTrago(String nombre, String nombreCreador, HashSet<Plato> tragosBeneficiados) {
        super(nombre, nombreCreador);
        this.tragosBeneficiados = tragosBeneficiados;
    }

    public HashSet<Plato> getTragosBeneficiados() {
        return tragosBeneficiados;
    }

    public void setTragosBeneficiados(HashSet<Plato> tragosBeneficiados) {
        this.tragosBeneficiados = tragosBeneficiados;
    }

}
