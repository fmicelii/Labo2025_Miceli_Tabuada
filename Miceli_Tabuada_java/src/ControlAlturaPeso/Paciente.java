package ControlAlturaPeso;

import Personas.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {
    private HashMap<LocalDate,AlturaPeso> registroFechas;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, HashMap<LocalDate, AlturaPeso> registroFechas) {
        super(nombre, apellido, fechaNacimiento);
        this.registroFechas = registroFechas;
    }

    public HashMap<LocalDate, AlturaPeso> getRegistroFechas() {
        return registroFechas;
    }

    public void setRegistroFechas(HashMap<LocalDate, AlturaPeso> registroFechas) {
        this.registroFechas = registroFechas;
    }

    public void mostrarRegistroPorFecha(LocalDate fecha){
        AlturaPeso registro = registroFechas.get(fecha);
        System.out.println("altura: " + registro.getAltura());
        System.out.println("peso: " + registro.getPeso());
    }

    public void promedioAnual(int ano){
        int contador = 0;
        int sumaAltura = 0;
        int sumaPeso = 0;
        for (Map.Entry<LocalDate,AlturaPeso> valores : registroFechas.entrySet()){
            LocalDate fecha = valores.getKey();
            AlturaPeso registro = valores.getValue();
            if (fecha.getYear() == ano){
                contador++;
                sumaAltura += valores.getValue().getAltura();
                sumaPeso += valores.getValue().getPeso();
            }
        }
        double promedioAltura = sumaAltura / contador;
        double promedioPeso = sumaPeso / contador;
        System.out.println("el promedio de peso y altura en " + ano + ":");
        System.out.println("peso: " + promedioPeso);
        System.out.println("altura: " + promedioAltura);
    }

    public double porcentajeCrecimientoPeso(LocalDate fechaInicio, LocalDate fechaFin){
        int pesoInicio = registroFechas.get(fechaInicio).getPeso();
        int pesoFin = registroFechas.get(fechaFin).getPeso();
        double porcentajeCrecimientoPeso = ((pesoFin-pesoInicio)/pesoInicio)*100;
        return porcentajeCrecimientoPeso;
    }

    public double porcentajeCrecimientoAltura(LocalDate fechaInicio, LocalDate fechaFin){
        int alturaInicio = registroFechas.get(fechaInicio).getAltura();
        int alturaFin = registroFechas.get(fechaFin).getAltura();
        double porcentajeCrecimientoAltura = ((alturaFin-alturaInicio)/alturaInicio)*100;
        return porcentajeCrecimientoAltura;
    }
}
