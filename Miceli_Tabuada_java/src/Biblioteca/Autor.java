package Biblioteca;

import Personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<Libro>bibliografia;

    public Autor(String nombre, LocalDate fechaNacimiento, int dni, HashSet<Libro> bibliografia) {
        super(nombre, fechaNacimiento, dni);
        this.bibliografia = bibliografia;
    }

    public HashSet<Libro> getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(HashSet<Libro> bibliografia) {
        this.bibliografia = bibliografia;
    }

}
