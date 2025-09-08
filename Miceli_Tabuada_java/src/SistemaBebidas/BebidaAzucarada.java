package SistemaBebidas;

public class BebidaAzucarada extends Bebida{
    private int azucar;

    public BebidaAzucarada(String nombre, int contenidoML, int azucar) {
        super(nombre, contenidoML);
        this.azucar = azucar;
    }

    @Override
    public void establecerCoeficiente() {
        this.setCoeficientePositividad(1);
        this.setCoeficienteNegatividad(this.azucar * 10);
    }
}
