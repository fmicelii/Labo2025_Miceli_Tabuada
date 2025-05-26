package Restaurante;
import Personas.Alumno;
import Personas.Profesor;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static junit.framework.Assert.*;

public class RestauranteTest {

    @Test
    public void testAgregarPlato(){
        Alumno alumno1 = new Alumno();
        Profesor profesor1 = new Profesor();
        Plato plato1 = new Plato("Sushi", 2500.00);
        Plato plato2 = new Plato("Pizza", 1500.00);
        ArrayList <Plato> platos = new ArrayList<>();
        platos.add(plato1);
        platos.add(plato2);
        Pedido pedido1 = new Pedido(plato1);
        Pedido pedido2 = new Pedido(plato2);
        Pedido pedido3 = new Pedido(LocalDate.now(), LocalTime.now(),plato2,alumno1,false);
        Pedido pedido4 = new Pedido(LocalDate.now(), LocalTime.now(),plato1,profesor1,false);
        ArrayList <Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        SistemaRestaurante s = new SistemaRestaurante(platos,pedidos);


        //agregar plato al pedido
        pedido1.setPlato(plato1);
        assertSame(plato1,pedido1.getPlato());
        //eliminar un plato al pedido
        pedido1.setPlato(null);
        assertNull(pedido1.getPlato());
        //listado de platos a cocinar en el dia
        assertEquals(s.platosACocinar(LocalDate.now()),new ArrayList<>());
        //precio de un peddio de alumno
        assertEquals(pedido3.getPlato().getPrecio(),1500.0);
        //precio de un pedido de profesor
        assertEquals(pedido4.getPlato().getPrecio(),2500.0);
    }
}
