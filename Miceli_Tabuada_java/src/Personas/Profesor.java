package Personas;

public class Profesor extends Persona {
    private double porcentajeDescuento;

    public Profesor(String apellido, String nombre, double porcentajeDescuento) {
        super(apellido, nombre);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Profesor(){
        super("Mariano","Perez");
        this.porcentajeDescuento = 10.0;
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
