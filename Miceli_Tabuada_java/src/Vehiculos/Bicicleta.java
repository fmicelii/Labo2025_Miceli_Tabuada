package Vehiculos;

import Colores.Color;

public abstract class Bicicleta extends Vehiculo{
    public Bicicleta(){
        super();
    }

    public Bicicleta(String marca, String modelo, Color color, double velocidad, int cantRuedas, int anioFabricacion){
        super(marca, modelo, color, velocidad,cantRuedas,anioFabricacion);
    }

    public String tipoDeVehiculo(){ return "Bicicleta";}
}
