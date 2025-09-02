package SistemaBebidas;

import java.util.ArrayList;

public class Persona {
    private String nombre, apellido;
    private int DNI, coeficienteHidratacion;
    private ArrayList<Bebida> bebidasIngeridas;
    private static Persona def = new Persona("def", "def", 0);
    private static Persona mejorCoeficiente = def, peorCoeficiente = def;

    public Persona(String nombre, String apellido, int DNI) throws DNIRepetidoException{
        if ()
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.bebidasIngeridas = new ArrayList<>();
        this.coeficienteHidratacion = 0;
        mejorCoeficiente();
        peorCoeficiente();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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
