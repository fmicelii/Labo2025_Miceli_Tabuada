package Vehiculos;

import java.util.ArrayList;
import java.util.Arrays;

public class Sistema {
    private ArrayList<Vehiculo> flota;

    public Sistema(){
        this.flota = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getFlota() {
        return flota;
    }

    public void setFlota(ArrayList<Vehiculo> flota) {
        this.flota = flota;
    }

    public String tipoConMayorCantidad(){
        String mayorTipoVehiculo = "";
        int cantCoche = 0;
        int cantBici = 0;
        int cantCamion = 0;
        for (Vehiculo v : flota){
            String vehi = v.tipoDeVehiculo();
            if (vehi.equals("Coche")){
                cantCoche++;
            } else if (vehi.equals("Camion")) {
                cantCamion++;
            }else {
                cantBici++;
            }
        }
        if (cantCoche > cantCamion && cantCoche > cantBici){
            mayorTipoVehiculo = "Coche";
        } else if (cantCamion > cantCoche && cantCamion > cantBici) {
            mayorTipoVehiculo = "Camion";
        }else {
            mayorTipoVehiculo = "Bicicleta";
        }
        return  mayorTipoVehiculo;
    }

    public void porcentajeDescapotables(){
        int cantDescapotables;
        for(Vehiculo D : flota){

        }
    }
    public void agregarCargaCamion(double cargaAgregada){
        for (Vehiculo v : flota){
            String vehi = v.tipoDeVehiculo();
            if (vehi.equals("Camion")){
                v.
            }
        }

    }


    public static void main(String[] args) {
        ArrayList<Vehiculo> flota = new ArrayList<>();
        Bicicleta b1 = new Bicicleta();
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        Camion ca1 = new Camion();
        Camion ca2 = new Camion();
        Camion ca3 = new Camion();

        flota.addAll(Arrays.asList(b1,c1,c2,ca1,ca2,ca3));
        Sistema s1 = new Sistema();
        s1.setFlota(flota);

        System.out.println("tipo de vehiculo de mayor cantidad: " + s1.tipoConMayorCantidad());

    }
}
