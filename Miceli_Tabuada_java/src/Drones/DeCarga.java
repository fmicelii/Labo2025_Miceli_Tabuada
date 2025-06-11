package Drones;

import java.time.LocalDate;

public class DeCarga extends Dron{
    public DeCarga(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria) {
        super(estado, nombreModelo, fechaAdquisicion, nivelCarga, id, bateria);
    }

    public boolean esExitosa(){

    }
}
