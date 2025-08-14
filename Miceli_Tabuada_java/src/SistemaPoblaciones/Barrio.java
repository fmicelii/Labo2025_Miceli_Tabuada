package SistemaPoblaciones;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, double latitud, double longitud, int poblacion) {
        super(nombre, latitud, longitud);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int calcularPoblacion(){
        return getPoblacion();
    }
}
