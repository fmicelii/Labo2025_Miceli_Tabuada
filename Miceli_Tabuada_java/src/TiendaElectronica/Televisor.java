package TiendaElectronica;

public class Televisor extends Electronica {
    private Tecnologia tecnologia;
    private int ResolucionPx;

    public Televisor(String nombreFabricante, String nombreModelo, double precio, int stock, Tecnologia tecnologia, int resolucionPx) {
        super(nombreFabricante, nombreModelo, precio, stock);
        this.tecnologia = tecnologia;
        ResolucionPx = resolucionPx;
    }
}
