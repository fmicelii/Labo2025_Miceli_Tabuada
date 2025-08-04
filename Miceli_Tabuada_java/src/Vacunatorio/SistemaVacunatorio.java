package Vacunatorio;

import Personas.Provincia;
import Personas.Vacunado;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaVacunatorio {
    private HashMap<Integer,Vacunado> mapaVacunados;
    private HashMap<Vacunado, HashSet<Vacuna>> mapaVacunas;

    public SistemaVacunatorio(HashMap<Integer, Vacunado> mapaVacunados, HashMap<Vacunado, HashSet<Vacuna>> mapaVacunas, HashMap<Provincia, Vacunado> mapaProvincia) {
        this.mapaVacunados = mapaVacunados;
        this.mapaVacunas = mapaVacunas;
    }

    public HashMap<Integer, Vacunado> getMapaVacunados() {
        return mapaVacunados;
    }

    public void setMapaVacunados(HashMap<Integer, Vacunado> mapaVacunados) {
        this.mapaVacunados = mapaVacunados;
    }

    public HashMap<Vacunado, HashSet<Vacuna>> getMapaVacunas() {
        return mapaVacunas;
    }

    public void setMapaVacunas(HashMap<Vacunado, HashSet<Vacuna>> mapaVacunas) {
        this.mapaVacunas = mapaVacunas;
    }

    public void registrarVacuna(Vacunado pinchado,Vacuna pinchazo){
        mapaVacunas.get(pinchado).add(pinchazo);
        System.out.println("vacuna registrada a: " + pinchado.getNombre());
    }

    public void consultarHistorial(Integer dni){
        Vacunado v = mapaVacunados.get(dni);
        for(Vacuna vac: mapaVacunas.get(v)){
            System.out.println(vac.getNombreComercial());
        }
    }

    public void vacunadosPorProvincia(){
        HashMap<Provincia,Integer> mapaProvincia = new HashMap<>();//provincia y la cantidad de vacunados
        for (Vacunado v : mapaVacunados.values()){
            if (mapaProvincia.containsKey(v.getProvincia())){
                int actualizado=mapaProvincia.get(v.getProvincia())+1;
                mapaProvincia.put(v.getProvincia(),actualizado);
            } else{
                mapaProvincia.put(v.getProvincia(),1);
            }
        }
    }
}