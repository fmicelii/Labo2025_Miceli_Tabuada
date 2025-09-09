package SistemaElecciones;

import Animales.Ave;

public class PalomaMensajera extends Ave implements Mensajero {
    private boolean aprendioElMapa;

    public PalomaMensajera(String nombre, String color, String especie, boolean aprendioElMapa) {
        super(nombre, color, especie);
        this.aprendioElMapa = aprendioElMapa;
    }

    @Override
    public String configurarMensaje() throws PalomaNoSabeVolarException{
        if (aprendioElMapa){
            return "Lanzando un papelito que dice: ";
        }
        throw new PalomaNoSabeVolarException("la paloma es petit y no sabe volar");
    }

    public boolean isAprendioElMapa() {
        return aprendioElMapa;
    }

    public void setAprendioElMapa(boolean aprendioElMapa) {
        this.aprendioElMapa = aprendioElMapa;
    }
}
