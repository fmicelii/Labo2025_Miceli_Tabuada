package TiendaElectronica;

import Restaurante.Plato;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Electronica> productos;

    public void AgregarProducto(Electronica e){ productos.add(e);}

    public void ModificarProducto(){

    }

    public void EliminarProducto(Electronica producto) {
        for (Electronica p : productos) {
            if (p == producto) {
                productos.remove(p);
            }
        }
    }


}
