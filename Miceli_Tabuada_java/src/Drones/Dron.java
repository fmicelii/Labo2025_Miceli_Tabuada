package Drones;

import java.time.LocalDate;

public abstract class Dron {
    private Estado estado;
    private String nombreModelo;
    private LocalDate fechaAdquisicion;
    private static int contador = 0;
    private int id;
    private int bateria;
    private static double latitudOrigen = -34.573195;
    private static double longitudOrigen = -58.504111;
    private double latitudDestino;
    private double longitudDestino;

    public Dron(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria, double latitudDestino, double longitudDestino) {
        this.estado = estado;
        this.nombreModelo = nombreModelo;
        this.fechaAdquisicion = fechaAdquisicion;
        Dron.setContador(Dron.getContador()+1);
        this.id = getContador();
        this.bateria = bateria;
        this.latitudDestino = latitudDestino;
        this.longitudDestino = longitudDestino;
    }

    public Dron(){
        this.estado = Estado.OPERATIVO;
        this.nombreModelo = "sompapa";
        this.fechaAdquisicion = LocalDate.now();
        Dron.setContador(Dron.getContador()+1);
        this.id = getContador();
        this.bateria = 50;
        this.latitudDestino = -34.633500;
        this.longitudDestino = -58.429200;
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

    public boolean comprobarEstado(){
        if (estado.name().equals("EN_VUELO") || estado.name().equals("OPERATIVO")){
            return true;
        }
        return false;
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