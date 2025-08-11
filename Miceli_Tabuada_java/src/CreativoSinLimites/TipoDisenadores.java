package CreativoSinLimites;

public enum TipoDisenadores {
    UX(1.08),UI(1.07),IT(1.12);

    private double comision;

    TipoDisenadores(double comision) {
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
