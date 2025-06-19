package Drones;

import java.time.LocalDate;

public class DeVigilancia extends Dron{
    private int memoria; //en su sd


    public DeVigilancia(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean esExitosa(){

    }
}
