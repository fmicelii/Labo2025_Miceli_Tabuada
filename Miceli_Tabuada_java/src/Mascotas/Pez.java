package Mascotas;

import java.util.ArrayList;

public class Pez extends Mascota{
    private static int vidas = 10;

    public Pez(String nombre, String nombreDueno, int vidas){
        super(nombre, nombreDueno);
        Pez.vidas = vidas;
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

        public void Alimentar(Pez pez, ArrayList<Mascota> mascotas){
            if (pez.getVidas() != 0) {
                setVidas(getVidas()+1);
            } else {
                mascotas.remove(pez);
            }
        }


}