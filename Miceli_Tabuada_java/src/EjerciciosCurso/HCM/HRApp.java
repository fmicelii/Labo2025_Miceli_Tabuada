package EjerciciosCurso.HCM;

import java.util.ArrayList;

public class HRApp {
    public static void main(String[] args) throws Exception {
        System.out.println("HR App Starts");

        Employee e1 = new Employee(67, "fran",676767);
        Employee e2 = new Employee(696969,"lolo",69);

        Department dept = new Department("RRHH",new ArrayList<>());
        dept.agregarEmpleado(e1);
        dept.agregarEmpleado(e2);


        System.out.println("empleadito"+e1);
        System.out.println("empleadito"+e2);

        for (Employee e: dept.getEmpleados()){
            System.out.println("empleadooos"+e);
        }
        System.out.println("salario de todos"+dept.salarioDeTodos());
        System.out.println("promedio salarios"+dept.promedioSalarios());
    }
}
