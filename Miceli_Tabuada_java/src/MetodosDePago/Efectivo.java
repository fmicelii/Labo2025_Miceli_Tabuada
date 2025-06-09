package MetodosDePago;

public class Efectivo extends MetodoDePago{
    public Efectivo(int monto){
        super(monto);
    }

    @Override
    public double getMonto() {
        return 0;
    }

    @Override
    public void setMonto(double monto) {

    }
}
