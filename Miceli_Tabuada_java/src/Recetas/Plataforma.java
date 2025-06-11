package Recetas;

import java.util.ArrayList;


public class Plataforma {
    private ArrayList<Receta> recetas;

    public void agregarReceta(Receta r) {
        recetas.add(r);
    }

    public void eliminarReceta(String nombre) {
        recetas.remove(nombre);
    }

    public void modificarReceta(Receta recetaVieja, Receta nuevaReceta){
        for (int i = 0; i < recetas.size(); i++) {
            if (recetaVieja == recetas.get(i)){
                recetas.set(i,nuevaReceta);
            }
        }
    }

    public void dificultadReceta(Dificultad dificultadDada){
        for (Receta r : recetas){
            if (r.getDificultad().equals(dificultadDada)){
                System.out.println(r.getNombre());
            }
        }
    }

    //HACER EL FILTRAR POR TIPO


    public void recetasCargadas(){
        System.out.println("Hay" + recetas.size() + "recetas cargadas");
    }

    public void mayorCantPasos(){
        Receta recetaMasPasos = null;
        for (Receta p: recetas){
            if (p.getPasos().size() > recetaMasPasos.getPasos().size()){
                recetaMasPasos = p;
            }
        }
    }
}
