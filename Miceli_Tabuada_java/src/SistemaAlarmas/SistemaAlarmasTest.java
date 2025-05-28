package SistemaAlarmas;
import static junit.framework.Assert.*;
import org.junit.Test;

import java.time.LocalDate;

public class SistemaAlarmasTest {
    @Test
    public void TestGneneral() {
        SensorPresion sp1 = new SensorPresion(10.0, 5.0);
        SensorHumo sh1 = new SensorHumo();
        SensorTemperatura st1 = new SensorTemperatura();
        SensorCompuesto sc1 = new SensorCompuesto(st1, sh1, sp1);

        //comprobar su estado
        assertTrue(sp1.isEstado());
        assertTrue(sh1.isEstado());
        assertTrue(st1.isEstado());
        //comprobar si la medida es menor que el umbral
        assertTrue( sc1.sumaMedida()< sc1.sumaUmbral());
        //comprobar la fecha para mantenimiento (elegimos cada 1 año)
        LocalDate fechaLimite = sp1.getAnoAdquisicion().plusYears(1);
        assertTrue("la fecha superó el año",LocalDate.now().isBefore(fechaLimite));
    }
}