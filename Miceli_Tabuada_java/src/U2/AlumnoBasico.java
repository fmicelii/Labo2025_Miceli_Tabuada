package U2;
import U1.Fecha;

import java.time.LocalDate;
import java.util.ArrayList;


public class AlumnoBasico {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private ArrayList <Integer> notas;

    public AlumnoBasico(){
        this.nombre = "Lolo";
        this.apellido = "Taborda";
        this.fechaNacimiento = LocalDate.now(); //fecha por defecto
        this.notas = new ArrayList<Integer>();
        this.notas.add(3);
        this.notas.add(32);
        this.notas.add(9);
    }
}
