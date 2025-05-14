package Vehiculos;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {

    @Test
    public void testVelocidad(){
        Coche ch1 = new Coche();

        assertEquals(0,ch1.mostrarVelocidad());
    }
}
