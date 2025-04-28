package U2.Torneo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Campeonato {
    private ArrayList <Equipo> equipos;
    private ArrayList <Equipo> equiposManana;
    private ArrayList <Equipo> equiposTarde;
    private ArrayList <Equipo> equiposNoche;
    private ArrayList <Partido> partidos;


    public Campeonato(ArrayList<Equipo> equipos, ArrayList<Partido> partidos, ArrayList<Equipo> equiposManana, ArrayList<Equipo> equiposTarde, ArrayList<Equipo> equiposNoche) {
        this.equipos = equipos;
        this.partidos = partidos;
        this.equiposManana = equiposManana;
        this.equiposTarde = equiposTarde;
        this.equiposNoche = equiposNoche;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquiposManana() {
        return equiposManana;
    }

    public void setEquiposManana(ArrayList<Equipo> equiposManana) {
        this.equiposManana = equiposManana;
    }

    public ArrayList<Equipo> getEquiposTarde() {
        return equiposTarde;
    }

    public void setEquiposTarde(ArrayList<Equipo> equiposTarde) {
        this.equiposTarde = equiposTarde;
    }

    public ArrayList<Equipo> getEquiposNoche() {
        return equiposNoche;
    }

    public void setEquiposNoche(ArrayList<Equipo> equiposNoche) {
        this.equiposNoche = equiposNoche;
    }

    public void filtrarTurno(){
        for (Equipo equipo : equipos) {
            if (equipo.getDisponibilidad().equals("manana")) {
                equiposManana.add(equipo);
            } else if (equipo.getDisponibilidad().equals("tarde")) {
                equiposTarde.add(equipo);
            } else {
                equiposNoche.add(equipo);
            }
        }
    }
    public void enfrentarManana(){
        for (int i = 0; i < equiposManana.size()-1; i++) {
            for (int j = 1; j < equiposManana.size(); j++) {
                Equipo e1 = new Equipo(equiposManana.get(i).getNombre(),equiposManana.get(i).getBarrio(),equiposManana.get(i).getDisponibilidad());
                Equipo e2 = new Equipo(equiposManana.get(j).getNombre(),equiposManana.get(j).getBarrio(),equiposManana.get(j).getDisponibilidad());
                Partido pI = new Partido(e1,e2, LocalDate.now().plusWeeks(1),"manana");
            }
        }
    }
    public void enfrentarTarde(){
        for (int i = 0; i < equiposManana.size()-1; i++) {
            for (int j = 1; j < equiposManana.size(); j++) {
                Equipo e1 = new Equipo(equiposManana.get(i).getNombre(),equiposManana.get(i).getBarrio(),equiposManana.get(i).getDisponibilidad());
                Equipo e2 = new Equipo(equiposManana.get(j).getNombre(),equiposManana.get(j).getBarrio(),equiposManana.get(j).getDisponibilidad());
                Partido pI = new Partido(e1,e2, LocalDate.now().plusWeeks(1),"tarde");
            }
        }
    }
    public void enfrentarNoche(){
        for (int i = 0; i < equiposManana.size()-1; i++) {
            for (int j = 1; j < equiposManana.size(); j++) {
                Equipo e1 = new Equipo(equiposManana.get(i).getNombre(),equiposManana.get(i).getBarrio(),equiposManana.get(i).getDisponibilidad());
                Equipo e2 = new Equipo(equiposManana.get(j).getNombre(),equiposManana.get(j).getBarrio(),equiposManana.get(j).getDisponibilidad());
                Partido pI = new Partido(e1,e2, LocalDate.now().plusWeeks(1),"noche");
            }
        }
    }

}
