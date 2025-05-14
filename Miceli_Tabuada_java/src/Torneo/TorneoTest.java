package Torneo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;

public class TorneoTest {

    @Test
    public void testComprobarNumeroCamiseta(){
        Jugador j1 = new Jugador("santiago", LocalDate.now(), 7);
        Jugador j2 = new Jugador("luciano", LocalDate.now(), 8);


        Equipo e1 = new Equipo();
        e1.agregarJugador(j1);
        e1.agregarJugador(j2);
        assertTrue(e1.comprobarNumeroCamiseta(99));
    }
}
