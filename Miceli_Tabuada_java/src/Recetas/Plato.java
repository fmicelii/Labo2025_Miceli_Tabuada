package Recetas;

import java.util.ArrayList;

public class Plato extends Receta {
    private int tiempoCoccion;
    private int comensales;

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int comensales) {
        super(nombre, dificultad, pasos);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }


    public void mostrarInstrucciones() {
        System.out.println("Esta receta tarda en cocinarse " + tiempoCoccion + " minutos y los pasos son:");
        for (String p : super.getPasos()) {
            System.out.println(" - " + p);
        }
    }
}
