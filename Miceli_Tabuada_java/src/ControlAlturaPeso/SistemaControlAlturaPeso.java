package ControlAlturaPeso;

import java.time.LocalDate;
import java.util.HashMap;

public class SistemaControlAlturaPeso {
    public static void main(String[] args) {
        HashMap<LocalDate, AlturaPeso> registros = new HashMap<>();
        registros.put(LocalDate.of(2022, 1, 10), new AlturaPeso(170, 70));
        registros.put(LocalDate.of(2022, 6, 10), new AlturaPeso(172, 73));
        registros.put(LocalDate.of(2023, 1, 10), new AlturaPeso(175, 75));
        registros.put(LocalDate.of(2023, 6, 10), new AlturaPeso(176, 78));

        Paciente paciente = new Paciente("Francisco", "González", LocalDate.of(2000, 5, 20), registros);

        System.out.println("Registro del 2022-06-10:");
        paciente.mostrarRegistroPorFecha(LocalDate.of(2022, 6, 10));

        paciente.promedioAnual(2022);
        paciente.promedioAnual(2023);

        double crecimientoPeso = paciente.porcentajeCrecimientoPeso(LocalDate.of(2022, 1, 10), LocalDate.of(2023, 6, 10));
        System.out.println("Porcentaje de crecimiento de peso entre 2022-01-10 y 2023-06-10: " + crecimientoPeso + "%");

        double crecimientoAltura = paciente.porcentajeCrecimientoAltura(LocalDate.of(2022, 1, 10), LocalDate.of(2023, 6, 10));
        System.out.println("Porcentaje de crecimiento de altura entre 2022-01-10 y 2023-06-10: " + crecimientoAltura + "%");

        System.out.println("\n--- TESTS MANUALES ---");

        AlturaPeso apTest = paciente.getRegistroFechas().get(LocalDate.of(2022, 6, 10));
        System.out.print("Test mostrarRegistroPorFecha: ");
        if (apTest != null && apTest.getAltura() == 172 && apTest.getPeso() == 73) {
            System.out.println("OK");
        } else {
            System.out.println("FALLÓ");
        }

        int sumaAltura2022 = 170 + 172;
        int sumaPeso2022 = 70 + 73;
        int count2022 = 2;
        double esperadoPromedioAltura2022 = sumaAltura2022 / (double) count2022;
        double esperadoPromedioPeso2022 = sumaPeso2022 / (double) count2022;

        System.out.print("Test promedioAnual 2022 (manual): ");
        if (Math.abs(esperadoPromedioAltura2022 - 171) < 0.01 && Math.abs(esperadoPromedioPeso2022 - 71.5) < 0.01) {
            System.out.println("OK");
        } else {
            System.out.println("FALLÓ");
        }

        double esperadoCrecPeso = ((78 - 70) / 70.0) * 100;
        double resultadoCrecPeso = paciente.porcentajeCrecimientoPeso(LocalDate.of(2022, 1, 10), LocalDate.of(2023, 6, 10));
        System.out.print("Test porcentajeCrecimientoPeso: ");
        if (Math.abs(esperadoCrecPeso - resultadoCrecPeso) < 0.01) {
            System.out.println("OK");
        } else {
            System.out.println("FALLÓ");
        }

        double esperadoCrecAltura = ((176 - 170) / 170.0) * 100;
        double resultadoCrecAltura = paciente.porcentajeCrecimientoAltura(LocalDate.of(2022, 1, 10), LocalDate.of(2023, 6, 10));
        System.out.print("Test porcentajeCrecimientoAltura: ");
        if (Math.abs(esperadoCrecAltura - resultadoCrecAltura) < 0.01) {
            System.out.println("OK");
        } else {
            System.out.println("FALLÓ");
        }
    }
}
