package TiendaElectronica;

public class Cargador extends Electronica{
    private int CantCargas;

    public Cargador(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        CantCargas = cantCargas;
    }

}
