package MasterChef;

import Recetas.Dificultad;
import Recetas.Plato;

import java.util.ArrayList;
import java.util.HashMap;

public class PlatoPrincipal extends Plato {
    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int tiempoCoccion, int comensales, HashMap<Ingrediente, Integer> ingredientesCantidadNecesaria) {
        super(nombre, dificultad, pasos, tiempoCoccion, comensales, ingredientesCantidadNecesaria);
    }
}
