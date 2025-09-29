package MasterChef;

import Recetas.Dificultad;
import Recetas.Plato;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato {
    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int comensales) {
        super(nombre, dificultad, pasos, tiempoCoccion, comensales);
    }
}
