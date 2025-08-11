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

    public double conocerSueldo(Disenador d){
        double sueldoTotal = 0;
        for (Proyecto p : proyectos){
            sueldoTotal += p.getPrecio();
            sueldoTotal = sueldoTotal * d.getTipoDisenador().getComision();
        }
        return sueldoTotal;
    }

    public int conocerPrecio(Proyecto proyectoAConocer){
        if (proyectos.contains(proyectoAConocer)){
            return proyectoAConocer.getPrecio();
        }
        return 0;
    }

    public void sueldoDiscriminado(Disenador d){
        for (Proyecto p : proyectos){
            System.out.println("nombre del proyecto: " + p.getNombre());
            System.out.println("cuanto se ganó (con comision): " + (p.getPrecio()*d.getTipoDisenador().getComision()));
            System.out.println("cuanto representa la comision: " + (p.getPrecio()*(d.getTipoDisenador().getComision() - 1)));
        }
    }
}
