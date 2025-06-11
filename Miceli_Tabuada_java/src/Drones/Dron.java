package Drones;

import java.time.LocalDate;

public abstract class Dron {
    private Estado estado;
    private String nombreModelo;
    private LocalDate fechaAdquisicion;
    private int nivelCarga;
    private static int contador = 0;
    private int id;
    private int bateria;
    private static double latitudOrigen = -34.573195;
    private static double longitudOrigen = -58.504111;

    public Dron(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria) {
        this.estado = estado;
        this.nombreModelo = nombreModelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.nivelCarga = nivelCarga;
        this.id = getContador();
        Dron.setContador(Dron.getContador()+1);
        this.bateria = bateria;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Dron.contador = contador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void recargarBateria(){
        if (bateria > 20){
            setBateria(getBateria()+10);
        } else {
            setBateria(100);
        }
    }

    public static double getLatitudOrigen() {
        return latitudOrigen;
    }

    public static void setLatitudOrigen(double latitudOrigen) {
        Dron.latitudOrigen = latitudOrigen;
    }

    public static double getLongitudOrigen() {
        return longitudOrigen;
    }

    public static void setLongitudOrigen(double longitudOrigen) {
        Dron.longitudOrigen = longitudOrigen;
    }

    abstract boolean esExitosa();
}