package SistemaAlarmas;
import java.time.LocalDate;

public class SensorTemperatura extends Alarma{
    public SensorTemperatura(){
        super(0.0,10.0);
    }

    @Override
    public void comprobarMedida() {
        if (getMedida() > getUmbrialInicial()){
            System.out.println("¡Cuidado! La temperatura sube");
        }
    }
}

