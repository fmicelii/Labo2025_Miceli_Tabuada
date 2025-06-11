package Drones;

import java.time.LocalDate;

public class DeVigilancia extends Dron{
    public DeVigilancia(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria) {
        super(estado, nombreModelo, fechaAdquisicion, nivelCarga, id, bateria);
    }
}
