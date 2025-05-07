package Peliculas;

import SeresVivos.Persona;

import java.util.ArrayList;

public class Estanteria {
    private int id;
    private ArrayList<Pelicula> peliculas;

    public Estanteria() {
        this.id = 99;
        this.peliculas = new ArrayList<>();
    }

    public Estanteria(int id, ArrayList<Pelicula> peliculas) {
        this.id = id;
        this.peliculas = peliculas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void agregarPelicula(Pelicula peli) {
        peliculas.add(peli);
    }

    public void eliminarPelicula(Pelicula peli) {
        for (Pelicula p : peliculas) {
            if (p == peli) {
                peliculas.remove(p);
                System.out.println("pelicula eliminada");
                break;
            }
        }
        System.out.println("la peli no esta");
    }

    public void mostrarPelisCortas(){
        for (Pelicula p : peliculas){
            if (p.getDuracion() < 90){
                System.out.println(p.getNombre());
            }
        }
    }

    public ArrayList<Persona> todosLosDirectores() {
        ArrayList<Persona> directores = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            directores.addAll(pelicula.getDirectores());
        }
        return directores;
    }

    public ArrayList<Persona> directoresExitosos() {
        ArrayList<Persona> directores = todosLosDirectores();
        ArrayList<Persona> directoresE = new ArrayList<>();

        for (int i = 0; i < directores.size(); i++) {
            Persona p = directores.get(i);

            for (int j = 0; j < directores.size(); j++) {
                if (i != j && directores.get(j).equals(p) && !directoresE.contains(p)) {
                    directoresE.add(p);
                }
            }
        }
        return directoresE;
    }


}
