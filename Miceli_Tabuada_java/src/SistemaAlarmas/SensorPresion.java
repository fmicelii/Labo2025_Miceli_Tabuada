package SistemaAlarmas;
import java.time.LocalDate;

public class SensorPresion extends Alarma {
    public SensorPresion(){
        super(0.0,10.0);
    }
    public SensorPresion(double medida, double umbralinicial){
        super(medida,umbralinicial);
    }

    @Override
    public void comprobarMedida() {
        if (getMedida() > getUmbrialInicial()){
            System.out.println("Sensor de presión activado");
        }
    }
}
