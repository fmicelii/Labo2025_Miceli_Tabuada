package SistemaElecciones;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccionOficinaCentral;
    private int cantidadAfiliados;
    private HashSet<Mensajero> mensajeros;

    public PartidoPolitico(String nombre, String direccionOficinaCentral, int cantidadAfiliados, HashSet<Mensajero> mensajeros) {
        this.nombre = nombre;
        this.direccionOficinaCentral = direccionOficinaCentral;
        this.cantidadAfiliados = cantidadAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficinaCentral() {
        return direccionOficinaCentral;
    }

    public void setDireccionOficinaCentral(String direccionOficinaCentral) {
        this.direccionOficinaCentral = direccionOficinaCentral;
    }

    public int getCantidadAfiliados() {
        return cantidadAfiliados;
    }

    public void setCantidadAfiliados(int cantidadAfiliados) {
        this.cantidadAfiliados = cantidadAfiliados;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajero mensajerito){
        if (mensajeros.contains(mensajerito)){
            System.err.println("mensajero ya agregado");
        }else {
            mensajeros.add(mensajerito);
        }
    }

    public void hacerCampania(){
        for (Mensajero m : mensajeros){
            System.out.println(m.configurarMensaje() + "Vote por el partido para un mejor futuro");
        }
    }
}
