package Restaurante;
import Personas.Profesor;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class SistemaRestaurante {
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Plato> platos = new ArrayList<>();

    public SistemaRestaurante(ArrayList<Plato> platos, ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
        this.platos = platos;
    }
    public void agregarPlato(Plato p) {
        platos.add(p);
    }

    public void eliminarPlato(Plato plato) {
        for (Plato p : platos) {
            if (p == plato) {
                platos.remove(p);
            }
        }
    }

    public void modificarPrecioPlato(String nombre, double nuevoPrecio) {
        for (Plato p : platos) {
            if (p.getNombre().equals(nombre)) {
                p.setPrecio(nuevoPrecio);
                return;
            }
        }
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Plato> platosACocinar(LocalDate fechaDeseada){
        ArrayList <Plato> platosACocinar = new ArrayList<>();
        for (Pedido p : pedidos){
            if (p.getFecha().equals(fechaDeseada)){
                if (!p.isEstaEntregado()){
                    if (p.getSolicitante() instanceof Profesor){
                        Profesor pro;
                        pro = (Profesor) p.getSolicitante();
                        p.getPlato().setPrecio(p.getPlato().getPrecio() - (p.getPlato().getPrecio() * (pro.getPorcentajeDescuento()) / 100.0));
                        platosACocinar.add(p.getPlato());
                    }
                    platosACocinar.add(p.getPlato());
                }
            }
        }
        return platosACocinar;
    }

    public void top3Platos(){

    }
}


