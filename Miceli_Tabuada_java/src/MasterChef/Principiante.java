package MasterChef;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements PlatoEntradaOperator{
    private HashSet<Ingrediente> ingredientesProhibidos;

    public Principiante(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, HashSet<Ingrediente> ingredientesProhibidos) {
        super(nombre, apellido, fechaNacimiento, localidad);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<Ingrediente> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<Ingrediente> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    @Override
    public void PrepararCocina() {
        System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: " + recorrerIngredientes());
    }

    public String recorrerIngredientes(){
        String ingredientes = "";
        for (Ingrediente i : ingredientesProhibidos){
            ingredientes = ingredientes + i.toString();
        }
        return ingredientes;
    }

    @Override
    public void cocinarEntrada(PlatoEntrada plato) throws AccesoIngredienteProhibidoException{
        for (Ingrediente i : ingredientesProhibidos){
            if (plato.getIngredientesCantidadNecesaria().entrySet().contains(i)){
                throw new AccesoIngredienteProhibidoException("el inrgediente " + i.getNombre() + " lo tiene prohibido el participante");
            }
        }
        System.out.println("cocinando entrada...");
    }

    @Override
    public void servirEntrada(PlatoEntrada plato) {
        System.out.println("sirviendo entrada...");
    }
}
