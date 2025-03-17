#include <iostream>
#include <vector>
using namespace std;

struct Paciente{
    string nombre;
    int edad;
    int n_hist_clinica;
    vector <Fecha> fecha_cita;
};

struct Fecha{
    int dia;
    int mes;
    int anio;
};

void registrar_pacientes(vector <Paciente> &lista)
//literalmente lo unico q hay q hacer es ingresar datos del paciente, y meterlo a la lista



int main(){
    vector <Paciente> lista_espera;

    
}