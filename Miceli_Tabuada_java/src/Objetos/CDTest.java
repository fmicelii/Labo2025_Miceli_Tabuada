package Objetos;
import  org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CDTest {

    @Test
    public void testCantCanciones(){
        Cancion c1 = new Cancion();
        Cancion c2   = new Cancion();


        CD cd1 = new CD();
        assertEquals(3,cd1.cantCanciones());
        cd1.agrega(c1);
        assertEquals(4,cd1.cantCanciones());
        cd1.agrega(c2);
        assertEquals(5,cd1.cantCanciones());
    }

}
