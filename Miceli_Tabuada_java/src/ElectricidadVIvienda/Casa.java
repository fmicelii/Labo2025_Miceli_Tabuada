package ElectricidadVIvienda;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public abstract class Casa extends Vivienda {
    private static int dineroXkw = 100;
    private int metrosCubiertos;
    private int metrosDescubiertos;

    public Casa(String direccion, int codigoPostal, Duenio dueno, HashMap<Year, HashMap<Month, Double>> mesConsumo, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, codigoPostal, dueno, mesConsumo);
        this.metrosCubiertos = metrosCubiertos;
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public int getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(int metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public int getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(int metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

    @Override
    public int getDineroXkw() {
        return dineroXkw;
    }

    @Override
    public void setDineroXkw(int dineroXkw) {
        Casa.dineroXkw = dineroXkw;
    }
}
