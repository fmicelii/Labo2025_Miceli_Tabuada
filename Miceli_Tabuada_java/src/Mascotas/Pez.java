package Mascotas;

public class Pez extends Mascota{
    private static int vidas = 10;

    public Pez(String nombre, String nombreDueno) {
        super(nombre, nombreDueno);
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    public String saludar(){
        return "";
    }
    public void Saludar(String mascota, String dueno){
        if (esElDueno(mascota,dueno)){
            setVidas(getVidas()-1);
        } else {
            setVidas(0);
        }
    }
}
