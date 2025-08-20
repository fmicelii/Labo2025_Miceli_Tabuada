package SistemaAlarmas;

import java.util.ArrayList;

public class SistemaAlarma {
    private ArrayList<Alarma> alarmas;

    public SistemaAlarma() {
        this.alarmas = new ArrayList<>();
    }

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    public static void main(String[] args) {
        SistemaAlarma alarmitas = new SistemaAlarma();
        SensorPresion sp1 = new SensorPresion(10.0,5.0);
        SensorHumo sh1 = new SensorHumo();
        SensorTemperatura st1 = new SensorTemperatura();
        SensorCompuesto sc1 = new SensorCompuesto(st1,sh1,sp1);

        sh1.comprobarMedida();
        sp1.comprobarMedida();
        st1.comprobarMedida();
        sc1.comprobarMedidaCompuesta();

        alarmitas.alarmas.add(sh1);
        alarmitas.alarmas.add(sp1);
        alarmitas.alarmas.add(st1);



    }
}
