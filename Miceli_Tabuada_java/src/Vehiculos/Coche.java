package Vehiculos;

import Colores.Color;

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

    @Override
    public double acelerar(double velocidad) {
        return 0;
    }

    @Override
    public double frenar(double velocidad) {
        return 0;
    }

    @Override
    public double mostrarVelocidad() {
        return 0;
    }

    public Coche(String marca, String modelo, Color color, double velocidad, int cantRuedas, int anioFabricacion, String patente, boolean esDescapotable){
        super(marca, modelo, color, velocidad,cantRuedas,anioFabricacion);
        this.patente = patente;
        this.esDescapotable = esDescapotable;
    }

    public String tipoDeVehiculo(){ return "Coche";}
}
