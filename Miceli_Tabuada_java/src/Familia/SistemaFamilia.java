package Familia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaFamilia {
    private HashMap<Plato, Familiar> comidas;
    private HashSet<Familiar> familiares;
    HashMap<Familiar, Integer> personita;

    public SistemaFamilia(HashMap<Plato, Familiar> comidas, HashSet<Familiar> familiares, HashMap<Familiar, Integer> personita) {
        this.comidas = comidas;
        this.familiares = familiares;
        this.personita = personita;
    }

    public int caloriasXPersona(Familiar familiero){
        for (Map.Entry<Plato, Familiar> control : comidas.entrySet()){
            Plato p = control.getKey();
            Familiar f = control.getValue();
            int calorias = p.getCalorias();
            personita.put(f, personita.getOrDefault(f,0) + calorias);
        }
    }
}

