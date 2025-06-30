package Mascotas;

public class Pajaro extends Mascota {
    private static String saludo = "pio";
    public Pajaro(String nombre, String nombreDueno) {
        super(nombre, nombreDueno);
    }
    public String saludar(){
        return "pio";
    }
    public void Saludar(String mascota, String dueno){
        if (esElDueno(mascota, dueno)) {
            System.out.println(saludo);
        } else {
            System.out.println("");
        }
    }
}
