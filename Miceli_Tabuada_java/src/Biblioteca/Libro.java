package Biblioteca;
import Personas.Persona;
import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private Editorial editorial;
    private LocalDate fechaPublicacion;

    private GeneroLibro genero;
    private String archivoPDF;
    private static int descargasDisponibles = 145;
    private Autor autorVirtual;

    public Libro(String titulo, GeneroLibro genero, String archivoPDF, Autor autorVirtual) {
        this.titulo = titulo;
        this.genero = genero;
        this.archivoPDF = archivoPDF;
        this.autorVirtual = autorVirtual;
    }

    public Libro(String titulo, Persona autor, int isbn, int paginas, Editorial editorial, LocalDate fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public  Libro(String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = 100;
        this.paginas = 288;
        this.editorial = Editorial.ATLANTIDA;
        this.fechaPublicacion = LocalDate.of(2008,9,12);
    }

    public Libro(){
        this.titulo = "El Hobbit";
        this.autor = new Persona("tolkien",69,"tamborini 3574");
        this.isbn = 100;
        this.paginas = 288;
        this.editorial = Editorial.EL_ATENEO;
        this.fechaPublicacion = LocalDate.of(2000,9,9);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public GeneroLibro getGenero() {
        return genero;
    }

    public void setGenero(GeneroLibro genero) {
        this.genero = genero;
    }

    public String getArchivoPDF() {
        return archivoPDF;
    }

    public void setArchivoPDF(String archivoPDF) {
        this.archivoPDF = archivoPDF;
    }

    public static int getDescargasDisponibles() {
        return descargasDisponibles;
    }

    public static void setDescargasDisponibles(int descargasDisponibles) {
        Libro.descargasDisponibles = descargasDisponibles;
    }

    public Autor getAutorVirtual() {
        return autorVirtual;
    }

    public void setAutorVirtual(Autor autorVirtual) {
        this.autorVirtual = autorVirtual;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", isbn=" + isbn +
                ", paginas=" + paginas +
                ", editorial=" + editorial +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }

    public void compararFechas(LocalDate fe2){
        LocalDate f1 = LocalDate.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());
        LocalDate f2 = LocalDate.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),LocalDate.now().getDayOfMonth());
        if (f1.isBefore(f2)) {
            System.out.println("La primera fecha es anterior.");
        } else if (f1.isAfter(f2)) {
            System.out.println("La primera fecha es posterior.");
        } else {
            System.out.println("Las fechas son iguales.");
        }
    }

    public static void main(String[] args) {
        Libro hobbit = new Libro();
        Libro baston = new Libro("El Baston De Plata", new Persona("lolo", 76, "anashe"));

        System.out.println(hobbit);
        hobbit.compararFechas(baston.fechaPublicacion);
    }
}