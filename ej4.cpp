#include <iostream>
#include <vector>
using namespace std;

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Paciente{
    string nombre;
    int edad;
    int n_hist_clinica;
    Fecha fecha_cita;
};

void registrar_cita(vector <Paciente> &lista){
    Paciente pacienteX;
    cout<<"ingrese nombre del paciente: ";
    cin>>pacienteX.nombre;
    cout<<"ingrese edad del paciente: ";
    cin>>pacienteX.edad;    
    srand(time(0));
    int hc = rand() % 100;
    int nro_dia = rand() % 31;
    int nro_mes = rand() % 12;
    pacienteX.fecha_cita.anio=2025;
    pacienteX.fecha_cita.mes=nro_mes;
    pacienteX.fecha_cita.dia=nro_dia;
    cout<<"su fecha de cita será: "<<pacienteX.fecha_cita.dia<< "/"<< pacienteX.fecha_cita.mes<<"/"<<pacienteX.fecha_cita.anio<<endl;
    pacienteX.n_hist_clinica = hc;
    cout<<pacienteX.n_hist_clinica<<endl;
    lista.push_back(pacienteX);
}

void cancelar_cita(vector <Paciente> &lista){
    int h_clinica;
    cout<<"ingrese el numero de historia clinica del paciente para cancelar la cita: ";
    cin>>h_clinica;
    for (int i = 0; i < lista.size(); i++){
        if (lista[i].n_hist_clinica == h_clinica){
            lista.erase(lista.begin() +i);
        }
    }    
}
void buscar_cita(vector <Paciente> &lista){
    int d, m, a;
    cout<<"ingrese la fecha que quiera mostrar"<<endl;
    cout<<"ingrese el dia"<<endl;
    cin>>d;
    cout<<"ingrese el mes"<<endl;
    cin>>m;
    cout<<"ingrese el año"<<endl;
    cin>>a;
    for (int  i = 0; i < lista.size(); i++){
        if (lista[i].fecha_cita.anio==a && lista[i].fecha_cita.mes==m && lista[i].fecha_cita.dia==d){
            cout<<lista[i].nombre<<endl;
        }
    }
}

void buscar_cita2(vector <Paciente> &lista){
    int h_clinica;
    cout<<"ingrese el numero de historia clinica del paciente para mostrar su info: ";
    cin>>h_clinica;
    for (int i = 0; i < lista.size(); i++){
        if (lista[i].n_hist_clinica == h_clinica){
            cout<<"nombre: "<<lista[i].nombre<<"edad: "<<lista[i].edad<<endl;
        }
    }    
}

int main(){
    vector <Paciente> lista_espera;
}