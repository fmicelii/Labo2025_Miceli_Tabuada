package Drones;

import java.time.LocalDate;

public class DeVigilancia extends Dron{
    private int memoria; //en su sd

    public DeVigilancia(Estado estado, String nombreModelo, LocalDate fechaAdquisicion, int bateria, double latitudDestino, double longitudDestino, int memoria) {
        super(estado, nombreModelo, fechaAdquisicion, bateria, latitudDestino, longitudDestino);
        this.memoria = memoria;
    }

    public DeVigilancia(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean esExitosa(double longOrigen, double latiOrigen, double longDestido, double latiDestino){
        if (comprobarEstado()){
            asignarMision(latiDestino, longDestido);
            if (calcularDistancia(latiOrigen, longOrigen, latiDestino, longDestido) <= 30.0){
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
