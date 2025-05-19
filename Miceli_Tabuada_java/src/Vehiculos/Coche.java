package Vehiculos;

public class Coche extends Vehiculo{
    private String patente;
    private boolean esDescapotable;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isEsDescapotable() {
        return esDescapotable;
    }

    public void setEsDescapotable(boolean esDescapotable) {
        this.esDescapotable = esDescapotable;
    }

    public Coche(){
        super();
        this.patente = "";
        this.esDescapotable = true;
    }

    public Coche(String marca,String modelo, String color, double velocidad, int cantRuedas, int anioFabricacion, String patente, boolean esDescapotable){
        super(marca, modelo, color, velocidad,cantRuedas,anioFabricacion);
        this.patente = patente;
        this.esDescapotable = esDescapotable;
    }

    public String tipoDeVehiculo(){ return "Coche";}
}
