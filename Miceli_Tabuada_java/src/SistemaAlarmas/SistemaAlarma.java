package SistemaAlarmas;

public class SistemaAlarma {
    public static void main(String[] args) {
        SensorPresion sp1 = new SensorPresion(10.0,5.0);
        SensorHumo sh1 = new SensorHumo();
        SensorTemperatura st1 = new SensorTemperatura();
        SensorCompuesto sc1 = new SensorCompuesto(st1,sh1,sp1);

        sh1.comprobarMedida();
        sp1.comprobarMedida();
        st1.comprobarMedida();
        sc1.comprobarMedidaCompuesta();
    }
}
