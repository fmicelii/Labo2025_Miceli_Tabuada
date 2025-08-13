package SistemaPoblaciones;

public abstract class Lugar {
    private String nombre;
    private static int codigo = 0;
    private double latitud;
    private double longitud;

    public Lugar(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        Lugar.codigo = getCodigo()+1;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Lugar.codigo = codigo;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public abstract int calcularPoblacion();
}
