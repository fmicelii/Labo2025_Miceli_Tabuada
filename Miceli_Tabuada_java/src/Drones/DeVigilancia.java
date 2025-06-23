package Drones;

import java.time.LocalDate;

public class DeVigilancia extends Dron{
    private int memoria; //en su sd (en Mb)

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

    public boolean chequearAlmacenamiento(){
        double memoriaAUtilizar = (calcularDistancia(getLatitudOrigen(), getLongitudOrigen(), getLatitudDestino(), getLongitudDestino()) / 2 ) * 12;
        if (memoriaAUtilizar > getMemoria()){
            return false;
        }else {
            return true;
        }
    }

    public boolean esExitosa(double longOrigen, double latiOrigen, double longDestido, double latiDestino){
        if (comprobarEstado()){
            asignarDestino(latiDestino, longDestido);
            return chequearAlmacenamiento();
        } else {
            return false;
        }
    }
}
