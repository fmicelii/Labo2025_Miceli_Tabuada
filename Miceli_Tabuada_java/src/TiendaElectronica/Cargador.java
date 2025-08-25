package TiendaElectronica;

public class Cargador extends Electronica{
    private int CantCargas;

    public Cargador(String nombreFabricante, String nombreModelo, double precio, int stock, int cantCargas) {
        super(nombreFabricante, nombreModelo, precio, stock);
        CantCargas = cantCargas;
    }
}
