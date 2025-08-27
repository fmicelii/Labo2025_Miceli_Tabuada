package ElectricidadVIvienda;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private int codigoPostal;
    private Duenio dueno;
    //{2019:{Enero, 20},{Fbrero, 20}., 2020: {ENetro, 2}. {sept, 3030}}
    private HashMap<Integer,HashMap<Mes,Double>> mesConsumo;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Duenio getDueno() {
        return dueno;
    }

    public void setDueno(Duenio dueno) {
        this.dueno = dueno;
    }

    public HashMap<Integer, HashMap<Mes, Double>> getMesConsumo() {
        return mesConsumo;
    }

    public void setMesConsumo(HashMap<Integer, HashMap<Mes, Double>> mesConsumo) {
        this.mesConsumo = mesConsumo;
    }

    public abstract double calcularConsumo(double consumo);

    public abstract double calcularConsumo(Vivienda v, Mes m, int anio);
}
