package Objetos;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private float velocidad;

    public Coche(){
        this.marca = "renault";
        this.modelo = "sandero";
        this.color = "rojo";
        this.velocidad = 0;
    }

    public Coche(String marca,String modelo, String color, float velocidad){
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

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float acelerar(float velocidad){
        return velocidad+10;
    }

    public float frenar(float velocidad){
        return velocidad-10;
    }
    public void mostrarVelocidad(float velocidad){
        System.out.println("la velocidad es de: " + velocidad);
    }

    public static class Main{
        public static void main(String[] args){
            Coche a1 = new Coche("VW","gol","negro",0);

            a1.mostrarVelocidad(a1.velocidad);
        }
    }
}
