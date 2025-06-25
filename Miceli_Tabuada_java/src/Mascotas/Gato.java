package Mascotas;

public class Gato extends Mascota {
    private static String saludo = "miau";
    public Gato(String nombre, String nombreDueno) {
        super(nombre, nombreDueno);
    }
    public String saludar(){
        return "miau";
    }
    public void Saludar(String mascota, String dueno){
        if (esElDueno( mascota, dueno)) {
            System.out.println(saludar());
        } else {
            System.out.println(saludar().toUpperCase() + "!");
        }
    }
}
