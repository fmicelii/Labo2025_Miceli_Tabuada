package CreativoSinLimites;

import Personas.Persona;
import Personas.Vacunado;

import java.util.HashMap;
import java.util.HashSet;

public class Disenador extends Persona {
    private TipoDisenadores tipoDisenador;
    private HashSet<Proyecto> proyectos;

    public Disenador(int dni, TipoDisenadores tipoDisenador, HashSet<Proyecto> proyectos) {
        super(dni);
        this.tipoDisenador = tipoDisenador;
        this.proyectos = proyectos;
    }

    public TipoDisenadores getTipoDisenador() {
        return tipoDisenador;
    }

    public void setTipoDisenador(TipoDisenadores tipoDisenador) {
        this.tipoDisenador = tipoDisenador;
    }

    public HashSet<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashSet<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public int conocerSueldo(int dni){
        int sueldoTotal = 0;
        for (Proyecto p : proyectos){
            sueldoTotal += p.getPrecio();

        }
        return sueldoTotal;
    }

    public int conocerPrecio(Proyecto proyectoAConocer){
        return proyectoAConocer.getPrecio();
    }

    public void sueldoDiscriminado(){
        for (Proyecto p : proyectos){

        }
    }
}
