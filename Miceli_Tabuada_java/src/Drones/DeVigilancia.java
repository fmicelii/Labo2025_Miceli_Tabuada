package Drones;

import java.time.LocalDate;

public class DeVigilancia extends Dron{
    private int memoria; //en su sd
    public DeVigilancia(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int nivelCarga, int id, int bateria, double latitudDestino, double longitudDestino, int memoria) {
        super(estado, nombreModelo, fechaAdquisicion, nivelCarga, id, bateria, latitudDestino, longitudDestino);
        this.memoria = memoria;
    }

    public DeVigilancia(int memoria) {
        this.memoria = memoria;
    }

    public DeVigilancia() {
    }

    public boolean esExitosa(){

    }
}
