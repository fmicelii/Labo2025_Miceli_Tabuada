package MasterChef;

import Recetas.Dificultad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        // Ingredientes
        Ingrediente tomate = new Ingrediente("Tomate", 2);
        Ingrediente carne = new Ingrediente("Carne", 10);
        Ingrediente lechuga = new Ingrediente("Lechuga", 1);

        // Pasos de recetas
        ArrayList<String> pasosEntrada = new ArrayList<>();
        pasosEntrada.add("Cortar tomate");
        pasosEntrada.add("Servir en plato");

        ArrayList<String> pasosPrincipal = new ArrayList<>();
        pasosPrincipal.add("Cocinar carne");
        pasosPrincipal.add("Acompañar con ensalada");

        // Ingredientes necesarios para cada plato
        HashMap<Ingrediente, Integer> ingEntrada = new HashMap<>();
        ingEntrada.put(tomate, 2);
        ingEntrada.put(lechuga, 1);

        HashMap<Ingrediente, Integer> ingPrincipal = new HashMap<>();
        ingPrincipal.put(carne, 1);
        ingPrincipal.put(lechuga, 2);

        // Platos
        PlatoEntrada entrada = new PlatoEntrada("Ensalada fresca", Dificultad.FACIL, pasosEntrada, 10, 2, ingEntrada);
        PlatoPrincipal principal = new PlatoPrincipal("Bife con ensalada", Dificultad.MEDIO, pasosPrincipal, 30, 2, ingPrincipal);

        // Participantes
        Experto experto = new Experto("Juan", "Pérez", LocalDate.of(1990, 5, 20), "Buenos Aires");

        HashMap<Ingrediente, Integer> stock = new HashMap<>();
        stock.put(carne, 2);
        stock.put(lechuga, 3);
        Intermedio intermedio = new Intermedio("Ana", "Gómez", LocalDate.of(1995, 8, 15), "Córdoba", stock);

        HashSet<Ingrediente> prohibidos = new HashSet<>();
        prohibidos.add(carne);
        Principiante principiante = new Principiante("Luis", "Martínez", LocalDate.of(2000, 1, 10), "Rosario", prohibidos);

        // Probar funcionalidades
        System.out.println("=== EXPERTO ===");
        experto.PrepararCocina();
        try {
            experto.cocinarEntrada(entrada);
            experto.servirEntrada(entrada);
            experto.cocinarPlato(principal);
            experto.servirPlato(principal);
        } catch (Exception e) {
            System.out.println("Error experto: " + e.getMessage());
        }

        System.out.println("\n=== INTERMEDIO ===");
        intermedio.PrepararCocina();
        try {
            intermedio.cocinarPlato(principal);
            intermedio.servirPlato(principal);
        } catch (Exception e) {
            System.out.println("Error intermedio: " + e.getMessage());
        }

        System.out.println("\n=== PRINCIPIANTE ===");
        principiante.PrepararCocina();
        try {
            principiante.cocinarEntrada(entrada);
            principiante.servirEntrada(entrada);
        } catch (Exception e) {
            System.out.println("Error principiante: " + e.getMessage());
        }
    }
}
