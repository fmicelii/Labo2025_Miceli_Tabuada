package Mascotas;

import java.util.ArrayList;

public class SistemaMascota {
    private ArrayList<Mascota> mascotas;

    public SistemaMascota() {
        this.mascotas = new ArrayList<>();
    }

    public SistemaMascota(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(mascota.getNombre())) {
                System.out.println("Ya existe una mascota con ese nombre");
                return;
            }
        }
        mascotas.add(mascota);
    }
    public void eliminarMascota(Mascota mascota){
        mascotas.remove(mascota);
    }
    public void modificarMascota(Mascota mascotaReemplazada, String nuevoNombre){
        for (Mascota m : mascotas) {
            if (m.equals(mascotaReemplazada)) {
                m.setNombre(nuevoNombre);
                break;
            }
        }
    }

    public void Saludar(){

    }

    public static void main(String[] args) {
        Perro perrito1 = new Perro("pedro","juliansito");
        Gato gatito1 = new Gato("lulo","sofi");
        Pez pecesito1 = new Pez("dory","lolo");

        SistemaMascota s1 = new SistemaMascota();
        s1.agregarMascota(perrito1);
        s1.agregarMascota(gatito1);
    }
}
