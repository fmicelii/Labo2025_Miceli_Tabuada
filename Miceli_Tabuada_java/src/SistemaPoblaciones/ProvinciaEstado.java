package SistemaPoblaciones;

import java.util.HashSet;

public class ProvinciaEstado extends Lugar{
    private HashSet<Ciudad> ciudades;

    public ProvinciaEstado(String nombre, double latitud, double longitud, HashSet<Ciudad> ciudades) {
        super(nombre, latitud, longitud);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public int calcularPoblacion(){
        int total = 0;
        for (Ciudad c : ciudades) {
            total += c.calcularPoblacion();
        }
        return total;
    }

}
