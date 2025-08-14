package SistemaPoblaciones;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<ProvinciaEstado> provincias_estados;

    public Pais(String nombre, double latitud, double longitud, HashSet<ProvinciaEstado> provincias_estados) {
        super(nombre, latitud, longitud);
        this.provincias_estados = provincias_estados;
    }

    public HashSet<ProvinciaEstado> getProvincias_estados() {
        return provincias_estados;
    }

    public void setProvincias_estados(HashSet<ProvinciaEstado> provincias_estados) {
        this.provincias_estados = provincias_estados;
    }

    public int calcularPoblacion(){
        int total = 0;
        for (ProvinciaEstado pe : provincias_estados){
            for (Ciudad c : pe.getCiudades()){
                for (Barrio b : c.getBarrios()){
                    total += b.getPoblacion();
                }
            }
        }
        return total;
    }
}
