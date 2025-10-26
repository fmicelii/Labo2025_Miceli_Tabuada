package MasterChef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements PlatoPrincipalOperator{
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
        System.out.println("Mi stock a utilizar es de " + recorrerIngredientes());
    }

    public String recorrerIngredientes(){
        String ingredientes = "";
        for (Map.Entry<Ingrediente,Integer> i : ingredienteStock.entrySet()){
            if (i.getValue() > 1){
                ingredientes = ingredientes + i.getKey().toString() + ", ";
            }
        }
        return ingredientes;
    }

    @Override
    public void cocinarPlato(PlatoPrincipal plato) throws StockInsuficienteException{
        for (Map.Entry<Ingrediente,Integer> i : ingredienteStock.entrySet()){
            if (i.getValue() < 1){ //no tiene stock
                throw new StockInsuficienteException("el stock del ingrediente es insuficiente.");
            }
        }
        System.out.println("cocinando plato...");
    }

    @Override
    public void servirPlato(PlatoPrincipal plato) {
        System.out.println("sirviendo plato...");
    }
}