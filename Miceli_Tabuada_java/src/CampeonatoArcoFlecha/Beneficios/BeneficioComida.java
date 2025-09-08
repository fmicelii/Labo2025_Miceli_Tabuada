package CampeonatoArcoFlecha.Beneficios;

import Restaurante.Plato;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements BeneficioAcumulable{
    private HashSet<Plato> comidasBeneficiadas;

    public BeneficioComida(String nombre, String nombreCreador, HashSet<Plato> comidasBeneficiadas) {
        super(nombre, nombreCreador);
        this.comidasBeneficiadas = comidasBeneficiadas;
    }

    public HashSet<Plato> getComidasBeneficiadas() {
        return comidasBeneficiadas;
    }

    public void setComidasBeneficiadas(HashSet<Plato> comidasBeneficiadas) {
        this.comidasBeneficiadas = comidasBeneficiadas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
