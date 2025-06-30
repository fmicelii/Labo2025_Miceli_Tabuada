package Mascotas;

public class Perro extends Mascota{
    private int alegria;
    private static String saludo = "guau";
    public Perro(String nombre, String nombreDueno, int alegria) {
        super(nombre, nombreDueno);
        this.alegria = alegria;
    }
    public String saludar(){
        return "guau";
    }
    public void Saludar(String mascota, String dueno){
        if (esElDueno(mascota, dueno)) {
            System.out.println(saludar());
        } else {
            System.out.println(saludar().toUpperCase() + "!");
        }
    }

    public void Alimentar(){
        alegria ++;
    }

}
