package CampeonatoArcoFlecha.Beneficios;

import Restaurante.Plato;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements BeneficioAcumulable{
    private HashSet<Plato> gaseosasBeneficiados;

    public BeneficioGaseosa(String nombre, String nombreCreador, HashSet<Plato> gaseosasBeneficiados) {
        super(nombre, nombreCreador);
        this.gaseosasBeneficiados = gaseosasBeneficiados;
    }

    public HashSet<Plato> getGaseosasBeneficiados() {
        return gaseosasBeneficiados;
    }

    public void setGaseosasBeneficiados(HashSet<Plato> gaseosasBeneficiados) {
        this.gaseosasBeneficiados = gaseosasBeneficiados;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 1000;
    }
}
