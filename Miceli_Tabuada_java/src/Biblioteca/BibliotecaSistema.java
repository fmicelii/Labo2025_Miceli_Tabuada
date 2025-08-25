package Biblioteca;

import java.util.HashMap;
import java.util.HashSet;

public class BibliotecaSistema {
    HashSet<Autor>autores=new HashSet<>();
    HashSet<Libro>libros=new HashSet<>();

    HashMap<TipoMembresia,Integer> cantLibros = BibliotecaSistema.asignarCantLibros();

    public static HashMap<TipoMembresia,Integer> asignarCantLibros() {
        HashMap<TipoMembresia,Integer>cantLibros = new HashMap<TipoMembresia,Integer>();
        cantLibros.put(TipoMembresia.BRONCE,5);
        cantLibros.put(TipoMembresia.PLATA, 15);
        cantLibros.put(TipoMembresia.ORO, 50);
        return cantLibros;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public BibliotecaSistema(HashMap<TipoMembresia, Integer> cantLibros) {
        this.cantLibros = cantLibros;
    }

    public HashMap<TipoMembresia, Integer> getLibrosPrestados() {
        return cantLibros;
    }

    public void setLibrosPrestados(HashMap<TipoMembresia, Integer> cantLibros) {
        this.cantLibros = cantLibros;
    }

    public void gestionarPrestamo(Libro libro, Usuario usuario) throws LimiteDescargasAlcanzadoExeption, MembresiaException {
        if (Libro.getDescargasDisponibles() == 0){
            throw new LimiteDescargasAlcanzadoExeption("El libro llego al maximo de descargas disp.");
        }else if (usuario.getLibrosEnTenencia().size() > cantLibros.get(usuario.getMembresia())){
            throw new MembresiaException("el usuario llego a la cantidad maxima de prestamos LOL");
        }
        Libro.setDescargasDisponibles(Libro.getDescargasDisponibles()-1);
        usuario.getLibrosEnTenencia().add(libro);
    }

    public void gestionarDevolucion(Libro libro, Usuario usuario) throws LimiteDescargasAlcanzadoExeption, MembresiaException{

    }

    public static void main(String[] args) {

    }

}
