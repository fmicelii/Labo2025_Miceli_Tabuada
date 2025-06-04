package Restaurante;

public class Plato {
    private NombrePlato nombre;
    private double precio;

    public Plato(NombrePlato nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Plato(){
        this.nombre = NombrePlato.ARROZ;
        this.precio = 10.0;
    }

    public NombrePlato getNombre() {
        return nombre;
    }

    public void setNombre(NombrePlato nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}


