package SistemaElecciones;

import TiendaElectronica.Electronica;

public class TelefonoMovil extends Electronica {
    private int numeroCelular;
    private CompaniaTelefonica companiaTelefonica;

    public TelefonoMovil(int numeroSerie, String nombreFabricante, String nombreModelo, int numeroCelular, CompaniaTelefonica companiaTelefonica) {
        super(numeroSerie, nombreFabricante, nombreModelo);
        this.numeroCelular = numeroCelular;
        this.companiaTelefonica = companiaTelefonica;
    }
}
