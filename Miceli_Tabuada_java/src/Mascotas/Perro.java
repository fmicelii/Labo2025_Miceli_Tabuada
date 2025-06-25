package Mascotas;

public class Perro extends Mascota{
    private static String saludo = "guau";
    public Perro(String nombre, String nombreDueno) {
        super(nombre, nombreDueno);
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
}
