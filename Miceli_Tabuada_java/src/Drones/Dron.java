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

    public Dron(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int bateria, double latitudDestino, double longitudDestino) {
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

    public static double calcularDistancia(double latitudOrigen, double longitudOrigen, double latitudDestino, double longitudDestino) {
        double lat1Rad = Math.toRadians(latitudOrigen);    // Latitud del punto de origen
        double lon1Rad = Math.toRadians(longitudOrigen);   // Longitud del punto de origen
        double lat2Rad = Math.toRadians(latitudDestino);   // Latitud del punto de destino
        double lon2Rad = Math.toRadians(longitudDestino);  // Longitud del punto de destino

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;

        return radioTierraKm * c; // Resultado en kilómetros (double)
    }

    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public void asignarMision(double latitudDestino, double longitudDestino){
        setLatitudDestino(latitudDestino);
        setLongitudDestino(longitudDestino);
    }

    abstract boolean esExitosa(double longOrigen, double latiOrigen, double longDestido, double latiDestino);
}