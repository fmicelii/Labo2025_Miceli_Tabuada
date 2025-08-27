package ElectricidadVIvienda;

public abstract class Casa extends Vivienda {
    private int metrosCubiertos;
    private int metrosDescubiertos;


    @Override
    public double calcularConsumo(Vivienda v, Mes m, int anio){
        return consumo * 100;
    }
}
