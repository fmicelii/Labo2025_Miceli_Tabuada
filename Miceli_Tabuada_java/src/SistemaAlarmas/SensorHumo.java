package SistemaAlarmas;
import java.time.LocalDate;

public class SensorHumo extends Alarma{
    public SensorHumo(){
        super(0.0,10.0);
    }

    @Override
    public void comprobarMedida() {
        if (getMedida() > getUmbrialInicial()){
            System.out.println("-- LLAMANDO A LOS BOMBEROS --");
            System.out.println("**     LLAMANDO AL 100     **");
        }
    }
}
