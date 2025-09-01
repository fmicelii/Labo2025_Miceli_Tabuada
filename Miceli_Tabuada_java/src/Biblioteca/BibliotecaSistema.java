package Biblioteca;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class BibliotecaSistema {
    HashSet<Autor>autores = new HashSet<>();
    HashSet<Libro>libros = new HashSet<>();

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

    public void gestionarDevolucion(Libro libro, Usuario usuario)throws Exception{
        if (usuario.getLibrosEnTenencia().contains(libro)){
            usuario.getLibrosEnTenencia().remove(libro);
        }else {
            throw new Exception("el usuario no tiene ese libro en tenencia ANNAAASHE");
        }
    }

    public void agregarLibro(Libro libro)throws LibroYaCargadoException{
        if (!getLibros().contains(libro)){
            getLibros().add(libro);
        }else {
            throw new LibroYaCargadoException("el librito ya esta en el hashset bro, respeta");
        }
    }

    public void borrarLibro(Libro libro)throws LibroNoExiseException{
        if (!getLibros().contains(libro)){
            getLibros().remove(libro);
        }else {
            throw new LibroNoExiseException("el librito ya esta en el hashset bro, respeta");
        }
    }

    public void modificarLibro(Libro libro,String nuevoTitulo){
        borrarLibro(libro);
        libro.setTitulo(nuevoTitulo);
        agregarLibro(libro);
    }

    public static void main(String[] args) {
        // -------------------- Crear autores --------------------
        HashSet<Libro> bib1 = new HashSet<>();
        Autor autor1 = new Autor("J.K. Rowling", LocalDate.of(1965, 7, 31), 12345, bib1);

        HashSet<Libro> bib2 = new HashSet<>();
        Autor autor2 = new Autor("Isaac Asimov", LocalDate.of(1920, 1, 2), 67890, bib2);

        // -------------------- Crear libros --------------------
        Libro libro1 = new Libro("Harry Potter y la Piedra Filosofal", GeneroLibro.FICCION, "hp1.pdf", autor1);
        Libro libro2 = new Libro("Fundación", GeneroLibro.SCI_FI, "fundacion.pdf", autor2);
        Libro libro3 = new Libro("Yo, Robot", GeneroLibro.SCI_FI, "yorobot.pdf", autor2);

        // -------------------- Crear usuarios --------------------
        HashSet<Libro> librosFran = new HashSet<>();
        Usuario u1 = new Usuario("Fran", LocalDate.of(2006, 1, 1), 44556677, "fran@mail.com", TipoMembresia.BRONCE, librosFran);

        HashSet<Libro> librosPepe = new HashSet<>();
        Usuario u2 = new Usuario("Pepe", LocalDate.of(1999, 3, 15), 99887766, "pepe@mail.com", TipoMembresia.ORO, librosPepe);

        // -------------------- Crear sistema --------------------
        BibliotecaSistema sistema = new BibliotecaSistema(BibliotecaSistema.asignarCantLibros());

        try {
            // Agregar libros al sistema
            sistema.agregarLibro(libro1);
            sistema.agregarLibro(libro2);
            sistema.agregarLibro(libro3);

            // -------------------- Préstamos --------------------
            sistema.gestionarPrestamo(libro1, u1);
            sistema.gestionarPrestamo(libro2, u1);
            sistema.gestionarPrestamo(libro3, u1); // BRONCE tiene hasta 5 → ok

            sistema.gestionarPrestamo(libro1, u2); // ORO puede hasta 50
        } catch (MembresiaException e) {
            System.out.println("❌ Error membresía: " + e.getMessage());
        } catch (LimiteDescargasAlcanzadoExeption e) {
            System.out.println("❌ Error descargas: " + e.getMessage());
        } catch (LibroYaCargadoException e) {
            System.out.println("❌ Error libro ya cargado: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Otro error: " + e.getMessage());
        }

        // -------------------- Devoluciones --------------------
        try {
            sistema.gestionarDevolucion(libro2, u1); // u1 devuelve libro2
            sistema.gestionarDevolucion(libro2, u1); // error: ya lo devolvió
        } catch (Exception e) {
            System.out.println("❌ Error en devolución: " + e.getMessage());
        }

        // -------------------- Modificar libro --------------------
        try {
            sistema.modificarLibro(libro3, "Yo, Robot - Edición Especial");
        } catch (Exception e) {
            System.out.println("❌ Error al modificar libro: " + e.getMessage());
        }

        // -------------------- Mostrar estado final --------------------
        System.out.println("\nEstado de usuarios:");
        System.out.println(u1.getNombre() + " tiene libros: " + u1.getLibrosEnTenencia());
        System.out.println(u2.getNombre() + " tiene libros: " + u2.getLibrosEnTenencia());

        System.out.println("\nLibros en sistema:");
        for (Libro l : sistema.getLibros()) {
            System.out.println(l);
        }
    }
}
