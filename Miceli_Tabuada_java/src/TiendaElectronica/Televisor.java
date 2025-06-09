package TiendaElectronica;

public class Televisor extends Electronica {
    private Tecnologia tecnologia;
    private int ResolucionPx;

    public Televisor(String nombre, double precio, int stock, int resolucionPx, Tecnologia tecnologia) {
        super(nombre, precio, stock);
        ResolucionPx = resolucionPx;
        this.tecnologia = tecnologia;
    }
}
