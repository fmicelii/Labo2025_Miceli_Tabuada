package SistemaPoblaciones;

import java.util.HashSet;

public class Mundo extends Lugar{
    private HashSet<Continente> continentes;

    public Mundo(String nombre, double latitud, double longitud, HashSet<Continente> continentes) {
        super(nombre, latitud, longitud);
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public int calcularPoblacion(){
        int total = 0;
        for (Continente cont : continentes){
            for (Pais p : cont.getPaises()){
                for (ProvinciaEstado pe : p.getProvincias_estados()){
                    for (Ciudad c : pe.getCiudades()){
                        for (Barrio b : c.getBarrios()){
                            total += b.getPoblacion();
                        }
                    }
                }
            }
        }
        return total;
    }
}
