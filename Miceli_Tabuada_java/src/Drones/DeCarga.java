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

    public boolean esExitosa(){
        if (comprobarEstado()){

        }
        else {
            return false;
        }
    }
}
