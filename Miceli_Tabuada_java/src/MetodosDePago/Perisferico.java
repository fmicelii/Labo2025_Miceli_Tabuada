package MetodosDePago;

public class Perisferico extends Componente{
    private String puerto;

    public Perisferico(String fabricante, String modelo, double precio, int stock, String puerto){
        super(fabricante, modelo, precio, stock);
        this.puerto = puerto;


    }
}
