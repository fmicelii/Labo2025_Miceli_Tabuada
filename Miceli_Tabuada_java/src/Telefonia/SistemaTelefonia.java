package Telefonia;
import java.util.ArrayList;
import java.util.Objects;

public class SistemaTelefonia {
    private ArrayList<Llamada> listadoLlamadas;

    public SistemaTelefonia(ArrayList<Llamada> listadoLlamadas) {
        this.listadoLlamadas = listadoLlamadas;
    }

    public ArrayList<Llamada> getListadoLlamadas() {
        return listadoLlamadas;
    }

    public void setListadoLlamadas(ArrayList<Llamada> listadoLlamadas) {
        this.listadoLlamadas = listadoLlamadas;
    }


    public void agregarLlamada(Llamada llamada){
        listadoLlamadas.add(llamada);
    }

    public ArrayList<Llamada> llamadasPorEmpleado(int dni){
        ArrayList<Llamada> listadoReturn = new ArrayList<>();
        for (Llamada l : listadoLlamadas){
            if (l.getEmpleadoDestino().getDni() == dni || l.getEmpleadoOrigen().getDni() == dni){
                listadoReturn.add(l);
            }
        }
        return listadoReturn;
    }

    public ArrayList<Llamada> empleadosConLlamadosExterior(){
        ArrayList<Llamada> noArgentinas = new ArrayList<>();
        for (Llamada l : listadoLlamadas){
            if (!Objects.equals(l.getEmpleadoDestino().getPais(), "Argentina")){
                noArgentinas.add(l);
            }
        }
        noArgentinas.sort((l1,l2) -> Integer.compare(l2.getDuracion(),l1.getDuracion()));
        return noArgentinas;
    }

}
