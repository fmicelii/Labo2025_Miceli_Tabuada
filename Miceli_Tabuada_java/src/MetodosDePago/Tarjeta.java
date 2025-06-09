package MetodosDePago;

public class Tarjeta extends MetodoDePago{
    private int numero;
    private int codigoSeguridad;
    private String propietario;

    public Tarjeta(double monto, int numero, int codigoSeguridad, String propietario){
        super(monto);
        this.numero = numero;
        this.codigoSeguridad = codigoSeguridad;
        this.propietario = propietario;
    }

    @Override
    public double getMonto() {
        return 0;
    }

    @Override
    public void setMonto(double monto) {

    }
}
