package Mascotas;

public abstract class Mascota {
    private String nombre;
    private String nombreDueno;

    public Mascota(String nombre, String nombreDueno) {
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    abstract String saludar();

    abstract void Saludar(String mascota, String dueno);

    public boolean esElDueno(String mascota, String dueno){
        if (mascota.equals(dueno)){
            return true;
        } else {
            return false;
        }
    }
}
