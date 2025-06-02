package Telefonia;
import Personas.EmpleadoTelefonia;
import java.time.LocalDate;

public class Llamada {
    private EmpleadoTelefonia empleadoOrigen;
    private EmpleadoTelefonia empleadoDestino;
    private LocalDate fecha;
    private int duracion; //segundos

    public Llamada(EmpleadoTelefonia empleadoOrigen, EmpleadoTelefonia empleadoDestino, LocalDate fecha, int duracion) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.fecha = fecha;
        this.duracion = duracion;
    }
    public Llamada(){
        this.empleadoDestino = new EmpleadoTelefonia();
        this.empleadoOrigen = new EmpleadoTelefonia();
        this.fecha = LocalDate.now();
        this.duracion = 100;
    }

    public EmpleadoTelefonia getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(EmpleadoTelefonia empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public EmpleadoTelefonia getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(EmpleadoTelefonia empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
