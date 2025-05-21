package Restaurante;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

    private ArrayList<Plato> platos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void agregarPlato(Plato p) {
        platos.add(p);
        }

        public void eliminarPlato(String nombre) {


            }

            platos.remove();
        }

        public void modificarPrecioPlato(String nombre, double nuevoPrecio) {
            for (Plato p : platos) {
                if (p.getNombre().equalsIgnoreCase(nombre)) {
                    p.setPrecio(nuevoPrecio);
                    return;
                }
            }
        }

        // Agregar pedido
        public void agregarPedido(Pedido pedido) {
            pedidos.add(pedido);
        }

        // Listado de platos a cocinar en un día con precio con descuento aplicado
        public void listarPlatosPorDia(LocalDate fecha) {
            System.out.println("Pedidos para el día " + fecha + ":");
            for (Pedido pedido : pedidos) {
                if (pedido.getFecha().equals(fecha)) {
                    System.out.println("- " + pedido.getPlato().getNombre() + " | " +
                            pedido.getPrecioFinal() + " (" + pedido.solicitante.getNombreCompleto() + ")");
                }
            }
        }

        // Top 3 platos más pedidos
        public void mostrarTop3Platos() {
            Map<String, Long> conteo = pedidos.stream()
                    .collect(Collectors.groupingBy(p -> p.getPlato().getNombre(), Collectors.counting()));

            conteo.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .limit(3)
                    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue() + " pedidos"));
        }
    }

}
