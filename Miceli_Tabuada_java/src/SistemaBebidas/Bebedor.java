package SistemaBebidas;

import Personas.Persona;

import java.util.ArrayList;

public class Bebedor extends Persona {
    private int coeficienteHidratacion;
    private ArrayList<Bebida> bebidasIngeridas;
    private static Bebedor def = new Bebedor("def", "def", 0);
    private static Bebedor mejorCoeficiente = def, peorCoeficiente = def;

    public Bebedor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.coeficienteHidratacion = 0;
        this.bebidasIngeridas = new ArrayList<>();
    }

    public int getCoeficienteHidratacion() {
        return coeficienteHidratacion;
    }

    public void setCoeficienteHidratacion(int coeficienteHidratacion) {
        this.coeficienteHidratacion = coeficienteHidratacion;
    }

    public void ingerirBebida(Bebida bebida, int cantidad){
        for (int i = 0; i < cantidad; i++){
            this.bebidasIngeridas.add(bebida);
            this.coeficienteHidratacion += bebida.getHidratacion();
        }
    }

    public void hidratacion(){
        int hidratacion = 0;
        for (Bebida b:bebidasIngeridas){
            hidratacion += b.getHidratacion();
        }
        this.coeficienteHidratacion = hidratacion;
    }

    public void peorCoeficiente(){
        if (this.coeficienteHidratacion < peorCoeficiente.getCoeficienteHidratacion()){
            peorCoeficiente = this;
        }
    }

    public void mejorCoeficiente(){
        if (this.coeficienteHidratacion > mejorCoeficiente.getCoeficienteHidratacion()){
            mejorCoeficiente = this;
        }
    }
}
