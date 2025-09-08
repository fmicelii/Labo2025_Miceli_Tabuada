package SistemaBebidas;

public class BebidaNeutra extends Bebida{
    public BebidaNeutra(String nombre, int coeficientePositividad, int coeficienteNegatividad, int contenidoML) {
        super(nombre, coeficientePositividad, coeficienteNegatividad, contenidoML);
    }

    @Override
    public void establecerCoeficiente(){
    }
}
