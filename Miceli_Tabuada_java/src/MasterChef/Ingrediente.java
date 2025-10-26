package MasterChef;

public class Ingrediente {
    private String nombre;
    private int proteinas;

    public Ingrediente(String nombre, int proteinas) {
        this.nombre = nombre;
        this.proteinas = proteinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
