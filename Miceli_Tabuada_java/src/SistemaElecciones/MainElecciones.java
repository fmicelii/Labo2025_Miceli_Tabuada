package SistemaElecciones;


import java.time.LocalDate;
import java.util.HashSet;

public class MainElecciones {
        public static void main(String[] args) {
            // Creamos algunos mensajeros
            Trabajador trabajador = new Trabajador(
                    "Juan", "Pérez", 12345678,
                    LocalDate.of(1990, 5, 20),
                    "Calle Falsa 123",
                    20123456, 50000.0, 8, 18
            );

            TelefonoMovil telefono = new TelefonoMovil(
                    111, "Samsung", "Galaxy S20",
                    11223344, CompaniaTelefonica.PERSONAL,
                    true, true
            );

            PalomaMensajera paloma = new PalomaMensajera(
                    "Blanquita", "Blanca", "Mensajera",
                    true
            );

            // Creamos un partido político y le agregamos mensajeros
            HashSet<Mensajero> mensajeros = new HashSet<>();
            PartidoPolitico partido = new PartidoPolitico("Partido Futuro", "Av. Siempreviva 742", 1000, mensajeros);

            partido.agregarMensajero(trabajador);
            partido.agregarMensajero(telefono);
            partido.agregarMensajero(paloma);

            // Simulación de campaña
            try {
                partido.hacerCampania();
            } catch (TelefonoException | NoEsSuHorarioLaboralException | PalomaNoSabeVolarException e) {
                System.err.println("⚠️ Error durante la campaña: " + e.getMessage());
            }
        }
    }


