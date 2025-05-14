package Peliculas;

import Personas.Persona;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<VideoClub> videoClubs;

    public Sistema(){
        this.videoClubs = new ArrayList<>();
    }
    public Sistema(ArrayList<VideoClub> videoClubs) {
        this.videoClubs = videoClubs;
    }

    public ArrayList<VideoClub> getVideoClubs() {
        return videoClubs;
    }

    public void setVideoClubs(ArrayList<VideoClub> videoClubs) {
        this.videoClubs = videoClubs;
    }

    public ArrayList<String> direccionComuna(int comu){
        ArrayList <String> cdDir = new ArrayList<>();
        for (int i = 0; i < videoClubs.size(); i++) {
            if (videoClubs.get(i).getComuna() == comu){
                cdDir.add(videoClubs.get(i).getDireccion());
            }
        }
        return cdDir;
    }

    public VideoClub vcMasPelis(){
        VideoClub vcPeliculero = new VideoClub();
        ArrayList <Integer> pelis = new ArrayList<>();
        for (int i = 0; i < videoClubs.size(); i++) {
            int contador = 0;
            for (int j = 0; j < videoClubs.get(i).getEstanterias().size(); j++) {
                for (int k = 0; k < videoClubs.get(i).getEstanterias().get(j).getPeliculas().size(); k++) {
                    contador++;
                }
            }
            pelis.add(contador);
        }
        int max = pelis.getFirst();
        int indiceMax = 0;
        for (int i = 1; i < pelis.size(); i++) {
            if (pelis.get(i) > max) {
                max = pelis.get(i);
                indiceMax = i;
            }
        }
        vcPeliculero = videoClubs.get(indiceMax);
        return vcPeliculero;
    }

    public void peliculasPorGenero(String gen){
        for (int i = 0; i < videoClubs.size(); i++) {
            System.out.println("video club de la direccion: " + videoClubs.get(i).getDireccion());
            for (int j = 0; j < videoClubs.get(i).getEstanterias().size(); j++) {
                for (int k = 0; k < videoClubs.get(i).getEstanterias().get(j).getPeliculas().size(); k++) {
                    if (videoClubs.get(i).getEstanterias().get(j).getPeliculas().get(k).getGenero() == gen){
                        System.out.println("pelicula: " + videoClubs.get(i).getEstanterias().get(j).getPeliculas().get(k).getNombre());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        VideoClub v1 = new VideoClub();
        Estanteria e1 = new Estanteria();
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("el retorno del rey");
        ArrayList<Persona> d1 = new ArrayList<>();

        d1.add(new Persona());
        p1.setDirectores(d1);
        ArrayList<Pelicula> pelis = new ArrayList<>();
        pelis.add(p1);
        pelis.add(p1);
        pelis.add(p1);
        pelis.add(p2);
        e1.setPeliculas(pelis);

        v1.getEstanterias().add(e1);
        v1.peliculaLarga();
        System.out.println("directores en mas de una peli: " + e1.directoresExitosos());
    }
}
