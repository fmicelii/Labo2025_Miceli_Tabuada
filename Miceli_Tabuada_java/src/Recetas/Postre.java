package Recetas;

import java.util.ArrayList;

public class Postre extends Receta{
    private int temperaturaHorno;
    private boolean aptoDiabetico;

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, int temperaturaHorno, boolean aptoDiabetico) {
        super(nombre, dificultad, pasos);
        this.temperaturaHorno = temperaturaHorno;
        this.aptoDiabetico = aptoDiabetico;
    }

    public int getTemperaturaHorno() {
        return temperaturaHorno;
    }

    public void setTemperaturaHorno(int temperaturaHorno) {
        this.temperaturaHorno = temperaturaHorno;
    }

    public boolean isAptoDiabetico() {
        return aptoDiabetico;
    }

    public void setAptoDiabetico(boolean aptoDiabetico) {
        this.aptoDiabetico = aptoDiabetico;
    }

    public void mostrarInstrucciones(){
        for (String p : super.getPasos()){
            System.out.println("- " + p);
            System.out.println("Recordá mantener la cocina limpia y el horno al mínimo.");
        }
        }
    }

