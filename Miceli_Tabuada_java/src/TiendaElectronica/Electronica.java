package TiendaElectronica;

public class Electronica {
    private int numeroSerie;
    private String nombreFabricante;
    private String nombreModelo;
    private double precio;
    private int stock;

    public Electronica(String nombreFabricante, String nombreModelo, double precio, int stock) {
        this.nombreFabricante = nombreFabricante;
        this.nombreModelo = nombreModelo;
        this.precio = precio;
        this.stock = stock;
    }

    public Electronica(int numeroSerie, String nombreFabricante, String nombreModelo) {
        this.numeroSerie = numeroSerie;
        this.nombreFabricante = nombreFabricante;
        this.nombreModelo = nombreModelo;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


