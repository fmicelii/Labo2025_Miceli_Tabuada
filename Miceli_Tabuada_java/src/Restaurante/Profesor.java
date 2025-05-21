package Restaurante;

public class Profesor extends Persona{
    private double porcentajeDescuento;

    public Profesor(String apellido, String nombre, double porcentajeDescuento) {
        super(apellido, nombre);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Profesor(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
