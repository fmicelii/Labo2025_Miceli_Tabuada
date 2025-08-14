package SistemaPoblaciones;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente(String nombre, double latitud, double longitud, HashSet<Pais> paises) {
        super(nombre, latitud, longitud);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    public int calcularPoblacion(){
        int total = 0;
        for (Pais p : paises){
            for (ProvinciaEstado pe : p.getProvincias_estados()){
                for (Ciudad c : pe.getCiudades()){
                    for (Barrio b : c.getBarrios()){
                        total += b.getPoblacion();
                    }
                }
            }
        }
        return total;
    }
}
