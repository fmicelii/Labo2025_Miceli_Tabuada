package Telefonia;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;

import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaTelefoniaTest {
    @Test
    public void TestGeneral() {
        SistemaTelefonia s1 = new SistemaTelefonia(new ArrayList<>());
        Llamada l1 = new Llamada();
        //comprobar si la fecha es de hoy
        assertEquals(l1.getFecha(),LocalDate.now());
        //comprobar si se agrega llamada
        s1.agregarLlamada(l1);
        assertEquals(l1,s1.getListadoLlamadas().getLast());
    }
}