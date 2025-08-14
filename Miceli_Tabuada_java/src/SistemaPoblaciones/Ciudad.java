package SistemaPoblaciones;

import java.util.HashSet;

public class Ciudad extends Lugar{
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, double latitud, double longitud, HashSet<Barrio> barrops) {
        super(nombre, latitud, longitud);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrops(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public int calcularPoblacion(){
        int total = 0;
        for (Barrio b : barrios){
            total += b.getPoblacion();
        }
        return total;
    }
}
