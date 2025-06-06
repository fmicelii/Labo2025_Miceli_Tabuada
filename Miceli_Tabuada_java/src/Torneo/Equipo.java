package Torneo;

import Biblioteca.Editorial;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    private Turno disponibilidad;
    private Jugador capitan;

    public Equipo(){
        this.nombre = "viejardos";
        this.barrio = "coghlan";
        this.jugadores = new ArrayList<>();
        this.disponibilidad = Turno.TARDE;
        this.capitan = null;
    }

    public Equipo(String nombre, String barrio, Turno disponibilidad) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Turno getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Turno disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public boolean comprobarNumeroCamiseta(int number){
        for (Jugador jugador : jugadores){
            if (jugador.getNumero() == number){
                return false;
            }
        }
        return true;
    }
    public void agregarJugador(Jugador jugador){
        boolean numerin = comprobarNumeroCamiseta(jugador.getNumero());
        if (numerin){
            jugadores.add(jugador);
            System.out.println("jugador agregado exitosamente");
        } else {
            System.out.println("no se pudo agregar jugador");
        }
    }

    public void definirCapitan(Jugador jugador){
        for (Jugador jugadorcito : jugadores){
            if (Objects.equals(jugador, jugadorcito)) {
                capitan = jugador;
                return;
            }
        }
        System.out.println("el jugador no esta en la lista del equipo papi");
    }
}