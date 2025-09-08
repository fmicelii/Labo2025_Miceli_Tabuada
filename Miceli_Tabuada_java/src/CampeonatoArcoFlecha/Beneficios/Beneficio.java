package CampeonatoArcoFlecha.Beneficios;

public abstract class Beneficio {
    private String nombre;
    private String nombreCreador;

    public Beneficio(String nombre, String nombreCreador) {
        this.nombre = nombre;
        this.nombreCreador = nombreCreador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }
}
