package MasterChef;

import Recetas.Dificultad;
import Recetas.Plato;

import java.util.ArrayList;

public class PlatoEntrada extends Plato {
    public PlatoEntrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int comensales) {
        super(nombre, dificultad, pasos, tiempoCoccion, comensales);
    }
}
