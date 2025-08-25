package SistemaAlarmas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAlarma {
    private ArrayList<Alarma> alarmas;

    public SistemaAlarma() {
        this.alarmas = new ArrayList<>();
    }

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    public static void main(String[] args) {
        SistemaAlarma alarmitas = new SistemaAlarma();
        SensorPresion sp1 = new SensorPresion(10.0,5.0);
        SensorHumo sh1 = new SensorHumo();
        SensorTemperatura st1 = new SensorTemperatura();
        SensorCompuesto sc1 = new SensorCompuesto(st1,sh1,sp1);

        sh1.comprobarMedida();
        sp1.comprobarMedida();
        st1.comprobarMedida();
        sc1.comprobarMedidaCompuesta();

        alarmitas.alarmas.add(sh1);
        alarmitas.alarmas.add(sp1);
        alarmitas.alarmas.add(st1);

        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 3) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("0 - Humo");
            System.out.println("1 - Presion");
            System.out.println("2 - Temperatura");
            System.out.println("3 - Me voooy");
            System.out.print("Elegí una opción: ");

            try {
                opcion = sc.nextInt();

                if (opcion < 0 || opcion > 4) {
                    throw new IllegalArgumentException("La opción debe estar entre 0 y 2.");
                }
                System.out.println(alarmitas.getAlarmas().get(opcion));

            } catch (InputMismatchException e) {
                System.err.println("Error: Debés ingresar un número entero.");
                sc.nextLine();
            }
            catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
            catch (Exception e) {
                System.err.println("Error inesperado: " + e.getMessage());
            }
        }
        sc.close();
    }
}
