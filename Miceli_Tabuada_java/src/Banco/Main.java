package Banco;

import SeresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Miguel", "Lopez", 32987990, LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        Persona p2 = new Persona("Juana", "Gomez", 39987990, LocalDate.of(1986, 7, 28));
        Persona p3 = new Persona("Candela", "Navarro", 40987990, LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("tamborini 3574", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("av. salvador maria del carril 3413", true, true);

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregarTrabajador(p1);
        sucursalUrquiza.agregarTrabajador(p3);
        sucursalPueyrredon.agregarTrabajador(p2);

        sucursalPueyrredon.cantidadTrabajadores();

        for (BancoNacion b : sucursales) {
            Persona p = b.trabajadorMayorAntiguedad();
            System.out.println(p.getNombre() + " " + p.antiguedad());
        }
    }
}
