package SistemaElecciones;

import TiendaElectronica.Electronica;

public class TelefonoMovil extends Electronica implements Mensajero{
    private int numeroCelular;
    private CompaniaTelefonica companiaTelefonica;
    private boolean estaPrendido;
    private boolean tieneCredito;

    public TelefonoMovil(int numeroSerie, String nombreFabricante, String nombreModelo, int numeroCelular, CompaniaTelefonica companiaTelefonica, boolean estaPrendido, boolean tieneCredito) {
        super(numeroSerie, nombreFabricante, nombreModelo);
        this.numeroCelular = numeroCelular;
        this.companiaTelefonica = companiaTelefonica;
        this.estaPrendido = estaPrendido;
        this.tieneCredito = tieneCredito;
    }

    @Override
    public String configurarMensaje() throws TelefonoException{
        if (estaPrendido && tieneCredito){
            String m = "Conectando con la antena más cercana";
            return m;
        }
        throw new TelefonoException("el telefono no esta prendido o no tiene credito");
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public CompaniaTelefonica getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(CompaniaTelefonica companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }
}
