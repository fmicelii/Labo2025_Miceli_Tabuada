package Recetas;

import java.util.ArrayList;

import static java.lang.reflect.Array;

public class Plataforma {
    private ArrayList<Receta> recetas;

    public void agregarReceta(Receta r) {
        recetas.add(r);
    }

    public void eliminarReceta(String nombre) {
        recetas.remove(nombre);
    }

    public void ModificarReceta(Receta recetaVieja, Receta nuevaReceta){
        for (int i = 0; i < recetas.size(); i++) {
            if (recetaVieja == recetas.get(i)){
            }
        }
    }

}
