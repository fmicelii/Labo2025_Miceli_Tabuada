package Vehiculos;

public class Coche extends Vehiculo{
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;

    public Coche(){
        this.marca = "ford";
        this.modelo = "kuga";
        this.color = "gris";
        this.velocidad = 0;
    }

    public Coche(String marca,String modelo, String color, double velocidad){
        super(marca, modelo, color, velocidad);
    }

    public static class Main{
        public static void main(String[] args){
            Coche a1 = new Coche("VW","gol","negro",0);

            a1.mostrarVelocidad();
        }
    }
}
