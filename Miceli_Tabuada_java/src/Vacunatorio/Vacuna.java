package Vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private int numLote;
    private int numFabricacion;
    private String nombreComercial;
    private LocalDate fechaFarbicacion;
    private LocalDate fechaAplicacion;

    public Vacuna(int numLote, int numFabricacion, String nombreComercial, LocalDate fechaFarbicacion, LocalDate fechaAplicacion) {
        this.numLote = numLote;
        this.numFabricacion = numFabricacion;
        this.nombreComercial = nombreComercial;
        this.fechaFarbicacion = fechaFarbicacion;
        this.fechaAplicacion = fechaAplicacion;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public int getNumFabricacion() {
        return numFabricacion;
    }

    public void setNumFabricacion(int numFabricacion) {
        this.numFabricacion = numFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public LocalDate getFechaFarbicacion() {
        return fechaFarbicacion;
    }

    public void setFechaFarbicacion(LocalDate fechaFarbicacion) {
        this.fechaFarbicacion = fechaFarbicacion;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }
}
