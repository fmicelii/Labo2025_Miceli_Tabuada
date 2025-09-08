package SistemaBebidas;

public abstract class Bebida {
    private String nombre;
    private int coeficientePositividad, coeficienteNegatividad, contenidoML, hidratacion;

    public Bebida(String nombre, int contenidoML) {
        this.nombre = nombre;
        this.coeficientePositividad = 0;
        this.coeficienteNegatividad = 0;
        this.contenidoML = contenidoML;
        establecerCoeficiente();
        setHidratacion();
    }

    public Bebida(String nombre, int coeficientePositividad, int coeficienteNegatividad, int contenidoML) {
        this.nombre = nombre;
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
        this.contenidoML = contenidoML;
        calcularHidratacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public int getContenidoML() {
        return contenidoML;
    }

    public void setContenidoML(int contenidoML) {
        this.contenidoML = contenidoML;
    }

    public int getHidratacion() {
        return hidratacion;
    }

    public void setHidratacion() {
        this.hidratacion = calcularHidratacion();
    }

    public int calcularHidratacion() {
        int hidratacion = 0;
        hidratacion -= this.coeficienteNegatividad;
        hidratacion += this.coeficientePositividad;
        return hidratacion;
    }

    public abstract void establecerCoeficiente();
}
