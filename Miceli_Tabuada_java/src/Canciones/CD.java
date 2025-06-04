package Canciones;
import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> canciones;

    public CD(){
        this.canciones = new ArrayList<Cancion>();
        this.canciones.add(new Cancion("todo un palo","redondos"));
        this.canciones.add(new Cancion("adriancito","yayo"));
        this.canciones.add(new Cancion("veni, veni","el cuarteto obrero"));
    }
    public CD(ArrayList <Cancion> canciones){
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int cantCanciones(){
        int cantidad = canciones.size();
        return cantidad;
    }

    public void verCancion(int posicion){
        Cancion nashec = canciones.get(posicion);
        System.out.println(nashec.getTitulo());
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        canciones.set(posicion,nuevaCancion);
        System.out.println("cancion reemplazada exitosamente");
    }

    public void agrega(Cancion cancion){
        canciones.addLast(cancion);
        System.out.println("cancion agregada exitosamente");
    }

    public void elimina(int posicion){
        canciones.remove(posicion);
        System.out.println("cancion eliminada exitosamente");
    }

    public static void main(String[] args) {
        CD cd1 = new CD();

        System.out.println(cd1.cantCanciones());
        cd1.verCancion(1);
        cd1.grabaCancion(0,new Cancion("demonia","anuel"));
        cd1.agrega(new Cancion("posta","tini"));
        //cd1.elimina(0);
    }

}
