package Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public Vehiculo(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }

    public Vehiculo(String marca,String modelo, String color, double velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
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

}
