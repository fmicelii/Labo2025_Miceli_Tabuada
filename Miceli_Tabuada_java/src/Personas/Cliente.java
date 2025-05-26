package Personas;

public class Cliente extends Persona{
    private String metodoDePago;

    public Cliente(String apellido, int numeroTelefono,String metodoDePago) {
        super(apellido,numeroTelefono);
        this.metodoDePago = metodoDePago;
    }
    public Cliente() {
        super("tabuada",1162351561);
        this.metodoDePago = "tarjeta";
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }
}
