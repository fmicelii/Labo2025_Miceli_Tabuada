package Vehiculos;

import Colores.Color;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private double velocidad;
    private int cantRuedas;
    private int anioFabricacion;

    public Vehiculo(){
        this.marca = "";
        this.modelo = "";
        this.color = Color.NEGRO;
        this.velocidad = 0;
    }

    public Vehiculo(Color color){
        this.marca = "";
        this.modelo = "";
        this.color = color;
        this.velocidad = 0;
        this.cantRuedas = 0;
        this.anioFabricacion = 0;
    }

    public Vehiculo(String marca,String modelo, Color color, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public Vehiculo(String marca,String modelo, Color color, double velocidad, int cantRuedas, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.cantRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double acelerar(double velocidad){
        return velocidad+10;
    }

    public double frenar(double velocidad){
        return velocidad-10;
    }

    public double mostrarVelocidad(){
        return velocidad;
    }

    public String tipoDeVehiculo(){ return "";}
}
