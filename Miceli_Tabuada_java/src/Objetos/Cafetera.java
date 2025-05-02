package Objetos;

import java.util.Scanner;

public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;

    public Cafetera(){
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    public Cafetera(int cantidadActual){
        this.cantidadActual = 1000;
        this.cantidadMaxima = cantidadActual;
    }
    public Cafetera(int cantidadActual, int cantidadMaxima){
        if (cantidadActual > cantidadMaxima){
            setCantidadActual(cantidadMaxima);
        }

    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){
        setCantidadActual(cantidadMaxima);
    }

    public void servirTaza(int capacidad){
        setCantidadActual(cantidadActual - capacidad);

    }
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    public void agregarCafe(int cantidad){
        setCantidadActual(cantidadActual + cantidad);
    }

    public static void main(String[] args) {
        Cafetera cafecito = new Cafetera (500, 2000);
        Scanner esc = new Scanner(System.in);
        int capacidad = esc.nextInt();
        int cantidad = esc.nextInt();
        cafecito.llenarCafetera();
        cafecito.servirTaza(capacidad);
        cafecito.vaciarCafetera();
        cafecito.agregarCafe(cantidad);

    }
}

