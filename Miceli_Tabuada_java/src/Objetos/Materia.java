package Objetos;
import java.util.ArrayList;

public class Materia {
    private NombreMateria nombre;
    private ArrayList <String> listaDeContenidos;
    private ArrayList <String> alumnosInscriptos;

    public Materia(){
        this.nombre = NombreMateria.HISTORIA;
        this.listaDeContenidos.add("revolucion industrial");
        this.listaDeContenidos.add("la maquina de river");
        this.alumnosInscriptos.add("Lopez");
    }
    public Materia(NombreMateria nombre, ArrayList<String> listaDeContenidos, ArrayList<String> alumnosInscriptos) {
        this.nombre = nombre;
        this.listaDeContenidos = listaDeContenidos;
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public NombreMateria getNombre() {
        return nombre;
    }

    public void setNombre(NombreMateria nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public ArrayList<String> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<String> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public static void main(String[] args) {

    }
}
