package VideoClub;

import java.util.ArrayList;

public class Sede {
    private String direccion;
    private int codPostal;
    private ArrayList <Estanteria> estanterias;

    public Sede(){
        this.direccion = "tamborini 3574";
        this.codPostal = 1416;
        this.estanterias = new ArrayList<>();
    }

    public Sede(String direccion, int codPostal, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.estanterias = estanterias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public void agregarEstanteria(Estanteria est){
        estanterias.add(est);
    }

    public void eliminarEstanteria(Estanteria est){
        for (Estanteria e : estanterias){
            if (e == est){
                estanterias.remove(e);
                System.out.println("estanteria eliminada");
                break;
            }
        }
        System.out.println("la estanteria no esta");
    }

    public void peliculaLarga(){
        int durMax = 0;
        String name = "";
        int code = 0;
        for (int i = 0; i < estanterias.size(); i++) {
            for (int j = 0; j < estanterias.get(i).getPeliculas().size(); j++) {
                if (durMax > estanterias.get(i).getPeliculas().get(j).getDuracion()){
                    durMax = estanterias.get(i).getPeliculas().get(j).getDuracion();
                    name = estanterias.get(i).getPeliculas().get(j).getNombre();
                    code = estanterias.get(i).getId();
                }
            }
        }
        System.out.println("duracion: " + durMax + " nombre de peli: " + " codigo de estante: " + code);
    }

    public static void main(String[] args) {
        Sede s1 = new Sede();
        Estanteria e1 = new Estanteria();
        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula("el retorno del rey");
        ArrayList<Pelicula> pelis = new ArrayList<>();
        pelis.add(p1);
        pelis.add(p2);
        e1.setPeliculas(pelis);
        s1.estanterias.add(e1);
        s1.peliculaLarga();
    }
}
