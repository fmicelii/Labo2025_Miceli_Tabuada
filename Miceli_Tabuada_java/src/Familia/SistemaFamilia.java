package Familia;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaFamilia {
    private HashMap<Plato, Familiar> comidas;
    private HashSet<Familiar> familiares;
    HashMap<Familiar, Integer> caloriasXFamiliar;

    public SistemaFamilia(HashMap<Plato, Familiar> comidas, HashSet<Familiar> familiares, HashMap<Familiar, Integer> caloriasXFamiliar) {
        this.comidas = comidas;
        this.familiares = familiares;
        this.caloriasXFamiliar = caloriasXFamiliar;
    }

    public HashMap<Plato, Familiar> getComidas() {
        return comidas;
    }

    public void setComidas(HashMap<Plato, Familiar> comidas) {
        this.comidas = comidas;
    }

    public HashSet<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(HashSet<Familiar> familiares) {
        this.familiares = familiares;
    }

    public HashMap<Familiar, Integer> getCaloriasXFamiliar() {
        return caloriasXFamiliar;
    }

    public void setCaloriasXFamiliar(HashMap<Familiar, Integer> caloriasXFamiliar) {
        this.caloriasXFamiliar = caloriasXFamiliar;
    }

    public void caloriasXPersona(Familiar familiero) {
        int caloriasTotales = 0;
        Plato plato;
        Familiar p = null;
        for (Map.Entry<Plato, Familiar> entry : comidas.entrySet()) {
            plato = entry.getKey();
            p = entry.getValue();
            if (p.equals(familiero)) {
                caloriasTotales += plato.getCalorias();
            }
        }
        System.out.println(p.getNombre() + " consumió: " + caloriasTotales + " calorias");
    }

    public double promedioFamilia(){
        int contador = 0;
        int caloriasFamilia = 0;
        for (Map.Entry<Familiar, Integer> c : caloriasXFamiliar.entrySet()){
            caloriasFamilia += c.getValue();
            contador++;
        }
        return caloriasFamilia / contador;
    }

    public Familiar masGordito(){
        Map.Entry<Familiar, Integer> gordix = null;
        for (Map.Entry<Familiar, Integer> g : caloriasXFamiliar.entrySet()){
            if (gordix == null || g.getValue() > gordix.getValue()){
                gordix = g;
            }
        }
        return gordix.getKey();
    }

    public Familiar flaquito(){
        Map.Entry<Familiar, Integer> palo = null;
        for (Map.Entry<Familiar, Integer> g : caloriasXFamiliar.entrySet()){
            if (palo == null || g.getValue() < palo.getValue()){
                palo = g;
            }
        }
        return palo.getKey();
    }

    public static void main(String[] args) {
        Familiar fran = new Familiar("Fran", LocalDate.of(2000, 5, 20));
        Familiar ana = new Familiar("Ana", LocalDate.of(1995, 3, 14));
        Familiar pedro = new Familiar("Pedro", LocalDate.of(1998, 8, 10));

        HashSet<Familiar> familiares = new HashSet<>();
        familiares.add(fran);
        familiares.add(ana);
        familiares.add(pedro);

        HashSet<String> ing1 = new HashSet<>();
        ing1.add("Pollo");
        ing1.add("Arroz");
        Plato plato1 = new Plato("Pollo con arroz", ing1, 500);

        HashSet<String> ing2 = new HashSet<>();
        ing2.add("Carne");
        ing2.add("Papas");
        Plato plato2 = new Plato("Bife con papas", ing2, 700);

        HashSet<String> ing3 = new HashSet<>();
        ing3.add("Lechuga");
        ing3.add("Tomate");
        Plato plato3 = new Plato("Ensalada", ing3, 200);

        HashMap<Plato, Familiar> comidas = new HashMap<>();
        comidas.put(plato1, fran);
        comidas.put(plato2, ana);
        comidas.put(plato3, pedro);
        comidas.put(new Plato("Pizza", new HashSet<>(), 800), fran);

        HashMap<Familiar, Integer> caloriasXFamiliar = new HashMap<>();
        caloriasXFamiliar.put(fran, 500 + 800);
        caloriasXFamiliar.put(ana, 700);
        caloriasXFamiliar.put(pedro, 200);

        SistemaFamilia sistema = new SistemaFamilia(comidas, familiares, caloriasXFamiliar);

        sistema.caloriasXPersona(fran);
        sistema.caloriasXPersona(ana);
        sistema.caloriasXPersona(pedro);

        System.out.println("Promedio de calorías consumidas por la familia: " + sistema.promedioFamilia());

        Familiar masGordo = sistema.masGordito();
        System.out.println("El mas gordito es: " + masGordo.getNombre());

        Familiar masFlaco = sistema.flaquito();
        System.out.println("El peter la anguila de la familia: " + masFlaco.getNombre());
    }

}


