package EjerciciosCurso.HCM;

public class Employee {
    private int id;
    private String nombre;
    private double salario;
    private String department;

    public Employee(String nombre) {
        this.nombre = nombre;
        this.department = department;
    }
    public Employee(){
        this.nombre = "francisco";
        this.department = "robco";
    }

    public Employee(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "empleado:{id:"+id+", nombre:"+nombre+", salario:"+salario+"}";
    }
}
