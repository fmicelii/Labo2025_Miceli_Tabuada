package Drones;

import java.time.LocalDate;

public class DeCarga extends Dron{
    private double carga;

    public DeCarga(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int bateria, double latitudDestino, double longitudDestino, double carga) {
        super(estado, nombreModelo, fechaAdquisicion, bateria, latitudDestino, longitudDestino);
        this.carga = carga;
    }

    public DeCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public boolean esExitosa(double longOrigen, double latiOrigen, double longDestido, double latiDestino){
        if (comprobarEstado()){
            asignarMision(latiDestino, longDestido);
            if (calcularDistancia( latiOrigen, longOrigen, latiDestino, longDestido) <= 30.0){
                setBateria(getBateria()-48);
                if (getBateria() < 0){
                    setBateria(0);
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
