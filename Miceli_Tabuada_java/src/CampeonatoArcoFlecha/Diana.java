package CampeonatoArcoFlecha;

import Colores.Color;
import FigurasGeometricas.FiguraGeometrica;

import java.util.HashMap;

public class Diana {
    private FiguraGeometrica formaDiana;
    private String nombre;
    private String lvlDificultad;
    private HashMap<Integer, Color> puntaje;

    public Diana(FiguraGeometrica formaDiana, String nombre, String lvlDificultad, HashMap<Integer, Color> puntaje) {
        this.formaDiana = formaDiana;
        this.nombre = nombre;
        this.lvlDificultad = lvlDificultad;
        this.puntaje = puntaje;
    }

    public FiguraGeometrica getFormaDiana() {
        return formaDiana;
    }

    public void setFormaDiana(FiguraGeometrica formaDiana) {
        this.formaDiana = formaDiana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLvlDificultad() {
        return lvlDificultad;
    }

    public void setLvlDificultad(String lvlDificultad) {
        this.lvlDificultad = lvlDificultad;
    }

    public HashMap<Integer, Color> getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(HashMap<Integer, Color> puntaje) {
        this.puntaje = puntaje;
    }
}
