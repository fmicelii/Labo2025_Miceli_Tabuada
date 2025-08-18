package SistemaPoblaciones;

import java.util.HashSet;

public class Mundo extends Lugar{
    private HashSet<Continente> continentes;

    public Mundo(String nombre, double latitud, double longitud, HashSet<Continente> continentes) {
        super(nombre, latitud, longitud);
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public int calcularPoblacion() {
        int total = 0;
        for (Continente cont : continentes) {
            total += cont.calcularPoblacion();
        }
        return total;
    }

    public Continente masPoblado(){
        Continente elMasPoblado = null;
        for (Continente c : continentes) {
            if (elMasPoblado == null || c.calcularPoblacion() > elMasPoblado.calcularPoblacion()) {
                elMasPoblado = c;
            }
        }
        return elMasPoblado;
    }

    public Continente menosPoblado(){
        Continente elMenosPoblado = null;
        for (Continente c : continentes) {
            if (elMenosPoblado == null || c.calcularPoblacion() < elMenosPoblado.calcularPoblacion()) {
                elMenosPoblado = c;
            }
        }
        return elMenosPoblado;
    }

    public static void main(String[] args) {
        // --- Barrios ---
        Barrio b1 = new Barrio("Centro", -34.6, -58.4, 100000);
        Barrio b2 = new Barrio("Norte", -34.6, -58.5, 50000);
        Barrio b3 = new Barrio("Sur", -15.8, -47.9, 30000);

        // --- Ciudades ---
        HashSet<Barrio> barriosBsAs = new HashSet<>();
        barriosBsAs.add(b1);
        barriosBsAs.add(b2);

        HashSet<Barrio> barriosBrasilia = new HashSet<>();
        barriosBrasilia.add(b3);

        Ciudad laPlata = new Ciudad("La Plata", -34.9, -57.9, barriosBsAs);
        Ciudad brasilia = new Ciudad("Brasilia", -15.8, -47.9, barriosBrasilia);

        // --- Provincias / Estados ---
        HashSet<Ciudad> ciudadesBsAs = new HashSet<>();
        ciudadesBsAs.add(laPlata);

        HashSet<Ciudad> ciudadesBrasil = new HashSet<>();
        ciudadesBrasil.add(brasilia);

        ProvinciaEstado bsAs = new ProvinciaEstado("Buenos Aires", -34.6, -58.4, ciudadesBsAs);
        ProvinciaEstado df = new ProvinciaEstado("Distrito Federal", -15.8, -47.9, ciudadesBrasil);

        // --- Países ---
        HashSet<ProvinciaEstado> provsArgentina = new HashSet<>();
        provsArgentina.add(bsAs);

        HashSet<ProvinciaEstado> provsBrasil = new HashSet<>();
        provsBrasil.add(df);

        Pais argentina = new Pais("Argentina", -34.6, -58.4, provsArgentina);
        Pais brasil = new Pais("Brasil", -15.8, -47.9, provsBrasil);

        // --- Continentes ---
        HashSet<Pais> paisesAmerica = new HashSet<>();
        paisesAmerica.add(argentina);
        paisesAmerica.add(brasil);

        Continente america = new Continente("América", 0, 0, paisesAmerica);

        // --- Mundo ---
        HashSet<Continente> listaContinentes = new HashSet<>();
        listaContinentes.add(america);

        Mundo mundo = new Mundo("Planeta Tierra", 0, 0, listaContinentes);

        // --- Pantalla de información ---
        System.out.println("=== Pantalla de Información ===");

        // País más y menos poblado
        Pais paisMas = america.masPoblado();
        Pais paisMenos = america.menosPoblado();

        // Continente más y menos poblado
        Continente contMas = mundo.masPoblado();
        Continente contMenos = mundo.menosPoblado();

        System.out.println("País con más población: "
                + paisMas.getNombre() + " (" + paisMas.calcularPoblacion() + ")");
        System.out.println("País con menos población: "
                + paisMenos.getNombre() + " (" + paisMenos.calcularPoblacion() + ")");
        System.out.println("Continente con más población: "
                + contMas.getNombre() + " (" + contMas.calcularPoblacion() + ")");
        System.out.println("Continente con menos población: "
                + contMenos.getNombre() + " (" + contMenos.calcularPoblacion() + ")");
    }
}
