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
        for (Pais p : paises) {
            total += p.calcularPoblacion();
        }
        return total;
    }

    public Pais masPoblado(){
        Pais elMasPoblado = null;
        for (Pais p : paises) {
            if (elMasPoblado == null || p.calcularPoblacion() > elMasPoblado.calcularPoblacion()) {
                elMasPoblado = p;
            }
        }
        return elMasPoblado;
    }

    public Pais menosPoblado(){
        Pais elMenosPoblado = null;
        for (Pais p : paises) {
            if (elMenosPoblado == null || p.calcularPoblacion() < elMenosPoblado.calcularPoblacion()) {
                elMenosPoblado = p;
            }
        }
        return elMenosPoblado;
    }
}
