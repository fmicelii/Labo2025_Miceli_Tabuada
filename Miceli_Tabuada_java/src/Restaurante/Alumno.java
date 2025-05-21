package Restaurante;

public class Alumno extends Persona {
    private String division;

    public Alumno(String apellido, String nombre, String division) {
        super(apellido, nombre);
        this.division = division;
    }

    public Alumno(String division) {
        this.division = division;
    }

    public String getDivision(){
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
