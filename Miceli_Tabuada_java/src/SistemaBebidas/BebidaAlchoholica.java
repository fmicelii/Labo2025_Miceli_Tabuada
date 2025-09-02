package SistemaBebidas;

public class BebidaAlchoholica extends Bebida{
    private int graduacionAlcoholica;
    public BebidaAlchoholica(String nombre, int contenidoML, int graduacionAlcoholica) {
        super(nombre, contenidoML);
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    @Override
    public void establecerCoeficiente() {
        this.setCoeficientePositividad(0);
        this.setCoeficienteNegatividad(graduacionAlcoholica * 20);
    }
}
