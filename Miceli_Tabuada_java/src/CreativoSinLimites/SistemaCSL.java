package CreativoSinLimites;

import java.util.HashMap;

public class SistemaCSL {
    private HashMap<Proyecto,Disenador> listaDisenadores;

    public SistemaCSL(HashMap<Proyecto, Disenador> listaDisenadores) {
        this.listaDisenadores = listaDisenadores;
    }

    public HashMap<Proyecto, Disenador> getListaDisenadores() {
        return listaDisenadores;
    }

    public void setListaDisenadores(HashMap<Proyecto, Disenador> listaDisenadores) {
        this.listaDisenadores = listaDisenadores;
    }
}
