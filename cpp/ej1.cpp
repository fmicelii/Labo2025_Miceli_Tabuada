#include <iostream>
#include <vector>
using namespace std;

struct Empleado{
    string nombre;
    string apellido;
    string fecha_nacimiento;
    bool sexo;
    int salario;
};

void ingresarEmpleados(vector <Empleado> &empleados){

    for (int i = 1; i > 0; i++){
        int numerin;
        Empleado aux;
        
        cout<<"ingrese el nombre del empleado nro "<< i <<": ";
        cin>>aux.nombre;        
        cout<<"ingrese el apellido del empleado nro "<< i <<": ";
        cin>>aux.apellido;
        cout<<"ingrese la fecha de nacimiento del empleado nro "<< i <<" (xx/xx/xxxx): ";
        cin>>aux.fecha_nacimiento;
        cout<<"ingrese el sexo del empleado nro "<< i <<" (mujer=0 hombre=1): ";
        cin>>aux.sexo;
        cout<<"ingrese el salario del empleado nro "<< i <<": ";
        cin>>aux.salario;
        empleados.push_back(aux);

        cout<<"Empleado cargado exitosamente!"<<endl;
        cout<<"Desea ingresar otro empleado?"<<endl<<"escriba 1 si quiere continuar o 0 si desea terminar el ingreso de empleados"<<endl;
        cin>>numerin;
        if (numerin == 0){
            break;
        }
    }
}

Empleado empleadoConMayorSueldo(vector <Empleado> &empleados , vector <Empleado> &empleados_especiales){
    Empleado aux;
    Empleado empleado_mayor;

    for (int i = 0; empleados.size() ; i++){
        aux = empleados[i];

        if (aux.salario <= 400000){
            empleados_especiales.push_back(aux);
        }
        
        if (aux.salario > empleado_mayor.salario){
            empleado_mayor = aux;
        }
    }
    return empleado_mayor;
}

int main(){
    vector <Empleado> empleados;
    ingresarEmpleados(empleados);
    
    vector <Empleado> empleados_especiales;
    Empleado auxiliar = empleadoConMayorSueldo(empleados,empleados_especiales);

    cout<< "el empleado con el salario mas alto es: " << auxiliar.nombre <<" "<< auxiliar.apellido << " con el salario de: "<<auxiliar.salario;

    for (int i = 0; i < empleados_especiales.size(); i++)
    {
        cout<<empleados_especiales[i].apellido;
    }
    

}