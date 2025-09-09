package CampeonatoArcoFlecha;

import CampeonatoArcoFlecha.Beneficios.*;
import Restaurante.Plato;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaArcoFlecha {
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficiosOfrecidos;

    public SistemaArcoFlecha(HashSet<Bar> bares, HashSet<Diana> dianas, HashSet<Beneficio> beneficiosOfrecidos) {
        this.bares = bares;
        this.dianas = dianas;
        this.beneficiosOfrecidos = beneficiosOfrecidos;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficiosOfrecidos() {
        return beneficiosOfrecidos;
    }

    public void setBeneficiosOfrecidos(HashSet<Beneficio> beneficiosOfrecidos) {
        this.beneficiosOfrecidos = beneficiosOfrecidos;
    }
     public double conocerAreaDiana(Diana diana)throws DianaNotFoundException{
        if (dianas.contains(diana)){
            return diana.getFormaDiana().calcularArea();
        }
        throw new DianaNotFoundException("la diana solicitada no esta en el sistema bro");
     }

     public Diana dianaConMasPuntajes(){
        Diana dianaX = null;
        for (Diana d : dianas){
            if (dianaX == null || d.getPuntaje().size() > dianaX.getPuntaje().size()){
                dianaX = d;
            }
        }
        return dianaX;
     }

    public static void main(String[] args) {
        //dianas
        HashMap<Integer, Colores.Color> puntajesCircular = new HashMap<>();
        puntajesCircular.put(10, Colores.Color.ROJO);
        puntajesCircular.put(20, Colores.Color.VERDE);
        puntajesCircular.put(30, Colores.Color.AMARILLO);

        HashMap<Integer, Colores.Color> puntajesRect = new HashMap<>();
        puntajesRect.put(5, Colores.Color.NEGRO);
        puntajesRect.put(15, Colores.Color.BLANCO);

        HashMap<Integer, Colores.Color> puntajesCuad = new HashMap<>();
        puntajesCuad.put(25, Colores.Color.ROJO);
        puntajesCuad.put(50, Colores.Color.VERDE);

        Diana dianaCircular = new Diana(new FigurasGeometricas.Circulo(13), "Circular1", "Alta", puntajesCircular);
        Diana dianaRectangular = new Diana(new FigurasGeometricas.Rectangulo(10, 20), "Rect1", "Media", puntajesRect);
        Diana dianaCuadrada = new Diana(new FigurasGeometricas.Cuadrado(15), "Cuad1", "Baja", puntajesCuad);

        //beneficios
        HashSet<Plato> comidas = new HashSet<>();
        comidas.add(new Plato(Restaurante.NombrePlato.PIZZA, 500));
        comidas.add(new Plato(Restaurante.NombrePlato.EMPANADA, 250));
        BeneficioComida beneficioComida = new BeneficioComida("Promo Comida", "Ana", comidas);

        HashSet<Plato> gaseosas = new HashSet<>();
        gaseosas.add(new Plato(Restaurante.NombrePlato.COCA, 200));
        gaseosas.add(new Plato(Restaurante.NombrePlato.SPRITE, 180));
        BeneficioGaseosa beneficioGaseosa = new BeneficioGaseosa("Promo Gaseosa", "Juan", gaseosas);

        HashSet<Plato> tragos = new HashSet<>();
        tragos.add(new Plato(Restaurante.NombrePlato.FERNET, 600));
        tragos.add(new Plato(Restaurante.NombrePlato.CUBA_LIBRE, 550));
        BeneficioTrago beneficioTrago = new BeneficioTrago("Promo Trago", "Pedro", tragos);

        //barsito
        HashSet<Diana> dianasBar = new HashSet<>();
        dianasBar.add(dianaCircular);
        dianasBar.add(dianaRectangular);
        dianasBar.add(dianaCuadrada);

        HashSet<Beneficio> beneficiosBar = new HashSet<>();
        beneficiosBar.add(beneficioComida);
        beneficiosBar.add(beneficioGaseosa);
        beneficiosBar.add(beneficioTrago);

        HashSet<BeneficioAcumulable> beneficiosAcumBar = new HashSet<>();
        beneficiosAcumBar.add(beneficioComida);
        beneficiosAcumBar.add(beneficioGaseosa);

        Bar bar = new Bar(dianasBar, 5, 10000, beneficiosBar, beneficiosAcumBar);

        //sistema
        HashSet<Bar> baresSistema = new HashSet<>();
        baresSistema.add(bar);

        HashSet<Diana> dianasSistema = new HashSet<>();
        dianasSistema.add(dianaCircular);
        dianasSistema.add(dianaRectangular);
        dianasSistema.add(dianaCuadrada);

        HashSet<Beneficio> beneficiosSistema = new HashSet<>();
        beneficiosSistema.add(beneficioComida);
        beneficiosSistema.add(beneficioGaseosa);
        beneficiosSistema.add(beneficioTrago);

        SistemaArcoFlecha sistema = new SistemaArcoFlecha(baresSistema, dianasSistema, beneficiosSistema);

        //1- area dianas
        System.out.println("=== Áreas de las Dianas ===");
        for (Diana d : dianasSistema) {
            try {
                System.out.println(d.getNombre() + ": " + sistema.conocerAreaDiana(d));
            } catch (DianaNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        //2- mostrar beneficios de tragos
        System.out.println("\n=== Cantidad de beneficios de tragos en el bar ===");
        System.out.println(bar.cantBeneficiosTrags());

        //3- diana con mas puntajes
        System.out.println("\n=== Diana con más puntajes distintos ===");
        Diana dianaMax = sistema.dianaConMasPuntajes();
        if (dianaMax != null) {
            System.out.println(dianaMax.getNombre() + " con " + dianaMax.getPuntaje().size() + " puntajes");
        } else {
            System.out.println("No hay dianas en el sistema.");
        }
    }

}