package ElectricidadVIvienda;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public abstract class Departamento extends Vivienda{
    private static int dineroXkw = 50;
    private int cantAmbientes;

    public Departamento(String direccion, int codigoPostal, Duenio dueno, HashMap<Year, HashMap<Month, Double>> mesConsumo, int cantAmbientes) {
        super(direccion, codigoPostal, dueno, mesConsumo);
        this.cantAmbientes = cantAmbientes;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    @Override
    public int getDineroXkw() {
        return dineroXkw;
    }

    @Override
    public void setDineroXkw(int dineroXkw) {
        Departamento.dineroXkw = dineroXkw;
    }
}
