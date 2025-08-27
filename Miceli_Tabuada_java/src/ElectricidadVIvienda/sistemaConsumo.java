package ElectricidadVIvienda;

public class sistemaConsumo {

    public void agregarConsumo(Vivienda v, double c, Mes m){
        if (!v.getMesConsumo().containsKey(m)){
            v.getMesConsumo().put(m, c);
        }
    }
}
