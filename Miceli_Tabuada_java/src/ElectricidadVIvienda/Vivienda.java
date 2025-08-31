package ElectricidadVIvienda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public abstract class Vivienda {
    private String direccion;
    private int codigoPostal;
    private Duenio dueno;
    //{2019:{Enero, 20},{Fbrero, 20}., 2020: {ENetro, 2}. {sept, 3030}}
    private HashMap<Year,HashMap<Month,Double>> mesConsumo;

    public Vivienda(String direccion, int codigoPostal, Duenio dueno, HashMap<Year, HashMap<Month, Double>> mesConsumo) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.dueno = dueno;
        this.mesConsumo = mesConsumo;
    }

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

    public HashMap<Year, HashMap<Month, Double>> getMesConsumo() {
        return mesConsumo;
    }

    public void setMesConsumo(HashMap<Year, HashMap<Month, Double>> mesConsumo) {
        this.mesConsumo = mesConsumo;
    }

    public void cargarMesConsumo(LocalDate fecha, double consumo)throws MesCargadoException{
        if (getMesConsumo().containsKey(fecha.getYear())){
            if (getMesConsumo().get(fecha.getYear()).containsKey(fecha.getMonth())){
                throw new MesCargadoException("la fecha ya ha sido ingresada");
            }else {
                getMesConsumo().get(fecha.getYear()).put(fecha.getMonth(),consumo);
            }
        }else {
            HashMap<Month,Double> mc = new HashMap<>();
            mc.put(fecha.getMonth(),consumo);
            getMesConsumo().put(Year.of(fecha.getYear()),mc);
        }
    }


    public abstract int getDineroXkw();

    public abstract void setDineroXkw(int dineroXkw);
}
