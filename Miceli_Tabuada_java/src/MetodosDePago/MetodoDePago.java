package MetodosDePago;

public abstract class MetodoDePago {
    double monto;

    public MetodoDePago(double monto){
        this.monto = monto;
    }

    public abstract double getMonto();

    public abstract void setMonto(double monto);
}
