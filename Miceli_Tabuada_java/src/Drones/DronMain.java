package Drones;
import java.time.LocalDate;
public class DronMain {
    public static void main(String[] args) {
        DeVigilancia vigilante = new DeVigilancia(Estado.OPERATIVO, "DJI Vision", LocalDate.now(), 80, -34.61, -58.38, 500);
        System.out.println("Dron de vigiliancia");
        boolean vigila = vigilante.esExitosa(-58.504111, -34.573195, -58.38, -34.61);
        System.out.println("La mision tuvo exito? " + vigila);

        System.out.println("Dron de carga:");
        DeCarga cargobob = new DeCarga(Estado.OPERATIVO, "Cargobob gta", LocalDate.now(), 80, -34.64, -58.40, 25.0);

        System.out.println("Batería antes: " + cargobob.getBateria());
        boolean exitoCarga = cargobob.esExitosa(-58.504111, -34.573195, -58.40, -34.64);
        System.out.println("¿Misión exitosa? " + exitoCarga);
        System.out.println("Batería después: " + cargobob.getBateria());
    }
}


