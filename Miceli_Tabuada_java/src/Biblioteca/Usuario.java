package Biblioteca;

import Personas.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private TipoMembresia membresia;
    private HashSet<Libro>librosEnTenencia;

    public Usuario(String nombre, LocalDate fechaNacimiento, int dni, String mail, TipoMembresia membresia, HashSet<Libro> librosEnTenencia) {
        super(nombre, fechaNacimiento, dni);
        this.mail = mail;
        this.membresia = membresia;
        this.librosEnTenencia = librosEnTenencia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public TipoMembresia getMembresia() {
        return membresia;
    }

    public void setMembresia(TipoMembresia membresia) {
        this.membresia = membresia;
    }

    public HashSet<Libro> getLibrosEnTenencia() {
        return librosEnTenencia;
    }

    public void setLibrosEnTenencia(HashSet<Libro> librosEnTenencia) {
        this.librosEnTenencia = librosEnTenencia;
    }
}
