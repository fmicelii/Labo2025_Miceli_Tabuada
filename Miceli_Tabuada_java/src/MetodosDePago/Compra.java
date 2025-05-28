package MetodosDePago;

import java.util.ArrayList;

public class Compra {
    private Cliente cliente;
    private CPU cpu;
    private ArrayList<PerisfericoEntrada> entradas;
    private ArrayList<PerisfericoSalida> salidas;
    private String metodoPago;
    private String datosTarjeta = null;
    private double precioTotal;

    public Compra(Cliente cliente, CPU cpu, ArrayList<PerisfericoEntrada> entradas, ArrayList<PerisfericoSalida> salidas, String metodoPago, String datosTarjeta) {
        this.cliente = cliente;
        this.cpu = cpu;
        this.entradas = entradas;
        this.salidas = salidas;
        this.metodoPago = metodoPago;
        this.datosTarjeta = datosTarjeta;
        calcularPrecioTotal();
    }

    private void calcularPrecioTotal() {
        precioTotal = cpu.getPrecio();
        for (PerisfericoEntrada p : entradas) precioTotal += p.getPrecio();
        for (PerisfericoSalida p : salidas) precioTotal += p.getPrecio();

        if (metodoPago.equals("tarjeta")) {
            precioTotal *= 1.05;
        }
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getCantidadEntrada() {
        return entradas.size();
    }

    public int getCantidadSalida() {
        return salidas.size();
    }

    public boolean actualizarStock() {

    }
}
}
