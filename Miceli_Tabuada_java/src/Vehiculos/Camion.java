package Vehiculos;

public class Camion extends Vehiculo{
    private String patente;
    private double capCarga;
    private double carga;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(double capCarga) {
        this.capCarga = capCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Camion(){
        super();
        this.patente = "";
        this.capCarga = 0;
        this.carga = 0;
    }

    public Camion(String marca,String modelo, String color, double velocidad, int cantRuedas, int anioFabricacion, String patente, double capCarga, double carga){
        super(marca, modelo, color, velocidad,cantRuedas,anioFabricacion);
        this.patente = patente;
        this.capCarga = capCarga;
        this.carga = carga;
    }

    public String tipoDeVehiculo(){ return "Camion";}

    public void chequearCapCarga(){
        if (carga > capCarga){
            setCarga(capCarga);
        }
    }
}
