package Banco;

import SeresVivos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean enActivo;
    private boolean dolaresDisponibles;
    private ArrayList<Persona> trabajadores;

    public BancoNacion(String direccion, boolean enActivo, boolean dolaresDisponibles) {
        this.direccion = direccion;
        this.enActivo = enActivo;
        this.dolaresDisponibles = dolaresDisponibles;
        this.trabajadores = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEnActivo() {
        return enActivo;
    }

    public void setEnActivo(boolean enActivo) {
        this.enActivo = enActivo;
    }

    public boolean isDolaresDisponibles() {
        return dolaresDisponibles;
    }

    public void setDolaresDisponibles(boolean dolaresDisponibles) {
        this.dolaresDisponibles = dolaresDisponibles;
    }

    public ArrayList<Persona> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Persona> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void agregarTrabajador(Persona p){
        trabajadores.add(p);
        System.out.println("trabajador agregado");
    }

    public void cantidadTrabajadores(){
        System.out.println(trabajadores.size());

    };

    public Persona trabajadorMayorAntiguedad() {
        Persona trabajadorAntiguo = trabajadores.getFirst();
        for (int i = 1; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getFechaIngreso() == null) {
                System.out.println("El trabajador no tiene fecha de ingreso");
            } else {
                if (trabajadores.get(i).getFechaIngreso().isBefore(trabajadorAntiguo.getFechaIngreso())) {
                    trabajadorAntiguo = trabajadores.get(i);
                }
            }
        }
        return trabajadorAntiguo;
    }
    };