package Drones;

import java.time.LocalDate;

public class DeCarga extends Dron{
    private int carga;
    public DeCarga(int carga, Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria, double latitudDestino, double longitudDestino) {
        super(estado, nombreModelo, fechaAdquisicion, nivelCarga, id, bateria, latitudDestino, longitudDestino);
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
