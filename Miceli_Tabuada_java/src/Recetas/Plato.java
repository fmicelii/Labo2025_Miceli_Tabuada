package Recetas;

import MasterChef.Ingrediente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Plato extends Receta {
    private int tiempoCoccion;
    private int comensales;
    private HashMap<Ingrediente,Integer> ingredientesCantidadNecesaria;

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int comensales, HashMap<Ingrediente, Integer> ingredientesCantidadNecesaria) {
        super(nombre, dificultad, pasos);
        this.tiempoCoccion = tiempoCoccion;
        this.comensales = comensales;
        this.ingredientesCantidadNecesaria = ingredientesCantidadNecesaria;
    }

    public HashMap<Ingrediente, Integer> getIngredientesCantidadNecesaria() {
        return ingredientesCantidadNecesaria;
    }

    public void setIngredientesCantidadNecesaria(HashMap<Ingrediente, Integer> ingredientesCantidadNecesaria) {
        this.ingredientesCantidadNecesaria = ingredientesCantidadNecesaria;
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
