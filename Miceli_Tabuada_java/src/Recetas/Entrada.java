package Recetas;

import java.util.ArrayList;

public class Entrada extends Receta {
    private Temperatura frioCaliente;

    public Entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, Temperatura frioCaliente) {
        super(nombre, dificultad, pasos);
        this.frioCaliente = frioCaliente;
    }

    public Temperatura getFrioCaliente() {
        return frioCaliente;
    }

    public void setFrioCaliente(Temperatura frioCaliente) {
        this.frioCaliente = frioCaliente;
    }

    public void mostrarInstrucciones() {
        if (frioCaliente == Temperatura.CALIENTE) {
            System.out.println("Recordá prender el horno.");
        }
        for (String p : super.getPasos()) {
            System.out.println("- " + p);
        }
        if (frioCaliente == Temperatura.FRIO) {
            System.out.println("Guardá la preparación en la heladera.");
        }
    }


}
