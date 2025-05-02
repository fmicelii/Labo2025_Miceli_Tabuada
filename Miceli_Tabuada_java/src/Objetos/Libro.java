package Objetos;

import Fecha;
import SeresVivos.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public  Libro(String titulo, Persona autor, int isbn, int paginas, String editorial, Fecha fechapublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fechapublicacion;
    }

    public  Libro(String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = 100;
        this.paginas = 288;
        this.editorial = "anuel";
        this.fechaPublicacion = new Fecha(9,12,2018);
    }

    public Libro(){
        this.titulo = "El Hobbit";
        this.autor = new Persona("tolkien",69,"tamborini 3574");
        this.isbn = 100;
        this.paginas = 288;
        this.editorial = "anuel";
        this.fechaPublicacion = new Fecha(9,12,2018);
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

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInfo(){
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor.getNombre() + ", " + autor.getEdad() + ", " + autor.getDireccion());
        System.out.println("ISBN: " + isbn);
        System.out.println("paginas: " + paginas);
        System.out.println("editorial: " + editorial);
        System.out.println("fechaPublicacion: " + fechaPublicacion.getDia() + ", " + fechaPublicacion.getMes() + ", " + fechaPublicacion.getAnio());
    }

    public void compararFechas(Fecha fe2){
        LocalDate f1 = LocalDate.of(fechaPublicacion.getAnio(),fechaPublicacion.getMes(),fechaPublicacion.getDia());
        LocalDate f2 = LocalDate.of(fechaPublicacion.getAnio(),fechaPublicacion.getMes(),fechaPublicacion.getDia());
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

        hobbit.mostrarInfo();
        hobbit.compararFechas(baston.fechaPublicacion);
    }


}

