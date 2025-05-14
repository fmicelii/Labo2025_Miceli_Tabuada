package Peliculas;

import Personas.Persona;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private ArrayList <Persona> directores;
    private ArrayList <Persona> actores;
    private ArrayList <String> idiomas;

    public Pelicula(){
        this.nombre = "el imperio contraataca";
        this.genero = "ficcion";
        this.duracion = 120;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pelicula(String nombre){
        this.nombre = nombre;
        this.genero = "ficcion";
        this.duracion = 120;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    public Pelicula(String nombre, String genero, int duracion, ArrayList<Persona> directores, ArrayList<Persona> actores, ArrayList<String> idiomas) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomas = idiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores(){
        return directores;
    }

    public void setDirectores(ArrayList <Persona> directores){
        this.directores = directores;
    }

    public ArrayList<Persona> getActores(){
        return actores;
    }

    public void setActores(ArrayList <Persona> actores){
        this.actores = actores;
    }

    public ArrayList<String> getIdiomas(){
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas){
        this.idiomas = idiomas;
    }

    public ArrayList<Persona> actoresMayores(){
        ArrayList <Persona> actoresM = new ArrayList<>();
        for (Persona a : actores){
            if (a.getEdad() >= 18){
                actoresM.add(a);
            }
        }
        System.out.println("actores agregados al array");
        return actoresM;
    }

}

