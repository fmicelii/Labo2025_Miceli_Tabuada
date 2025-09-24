package MasterChef;

import java.time.LocalDate;
import java.util.HashMap;

public class Intermedio extends Participante{
    private HashMap<Ingrediente,Integer> ingredienteStock;

    public Intermedio(String nombre, String apellido, LocalDate fechaNacimiento, String localidad, HashMap<Ingrediente, Integer> ingredienteStock) {
        super(nombre, apellido, fechaNacimiento, localidad);
        this.ingredienteStock = ingredienteStock;
    }

    public HashMap<Ingrediente, Integer> getIngredienteStock() {
        return ingredienteStock;
    }

    public void setIngredienteStock(HashMap<Ingrediente, Integer> ingredienteStock) {
        this.ingredienteStock = ingredienteStock;
    }

    @Override
    public void PrepararCocina() {
        System.out.println("Mi stock a utilizar es de ");
    }

    public String recorrerIngredientes(){
        String ingredientes = "";
        for (Ingrediente i : ingredienteStock){

        }
    }
}