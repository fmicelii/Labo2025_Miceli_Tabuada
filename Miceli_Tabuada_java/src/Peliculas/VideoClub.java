package Peliculas;

import SeresVivos.Persona;

import java.util.ArrayList;

public class VideoClub {
    private int comuna;
    private String direccion;
    private int codPostal;
    private ArrayList <Estanteria> estanterias;

    public VideoClub(){
        this.comuna = 12;
        this.direccion = "tamborini 3574";
        this.codPostal = 1416;
        this.estanterias = new ArrayList<>();
    }

    public VideoClub(int comuna, String direccion, int codPostal, ArrayList<Estanteria> estanterias) {
        this.comuna = comuna;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.estanterias = estanterias;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
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
}
