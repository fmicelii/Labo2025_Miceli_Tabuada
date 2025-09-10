package EjerciciosCurso.HCM;

import java.util.ArrayList;

public class Department {
    private String nombre;
    private ArrayList <Employee> empleados;

    public Department(){
        this.nombre = "robco";
        this.empleados = new ArrayList<>();
    }

    public Department(String nombre, ArrayList<Employee> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Employee> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Employee> empleados) {
        this.empleados = empleados;
    }

    public void mostrarEmpleados(){
        for (Employee empleado : empleados){
            System.out.println(empleado.toString());
        }
    }

    public void agregarEmpleado(Employee e)throws Exception{
        if (empleados.size()>10||empleados.contains(e)){
            throw new Exception("lol error");
        }else {
            empleados.add(e);
        }
    }

    public int numeroDeEmpleados(){
        return empleados.size();
    }

    public Employee identificarEmpleadoPorId(int idd)throws Exception{
        for (Employee e : empleados){
            if (e.getId() == idd){
                return e;
            }
        }
        throw new Exception("no existe empleado con ese id");
    }

    public double salarioDeTodos(){
        double total=0;
        for (Employee e : empleados){
            total+=e.getSalario();
        }
        return total;
    }

    public double promedioSalarios(){
        double total=0;
        for (Employee e : empleados){
            total+=e.getSalario();
        }
        return total/empleados.size();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Department d1 = new Department();
        d1.empleados.add(e1);
        d1.mostrarEmpleados();
    }
}
