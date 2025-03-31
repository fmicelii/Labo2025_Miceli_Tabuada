#include <iostream>
#include <vector>
using namespace std;

struct Equipo{
    string nombre;
    string jugadores[11];  
    int cant_goles_favor;
    int cant_goles_contra;
    int posicion;
};

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Partido{
    string equipo_local;
    string equipo_visita;
    int goles_local;
    int goles_visita;
    vector <Fecha> fecha;
    string estadio;
};



void agregar_equipos(){
    for (int i = 0; i < -1; i++)
    {
       Equipo aux;
       cout<<"ingrese el nombre del equipo: "<<endl;
       cin>>aux.nombre;
}
}
    
void registrar_partidos(){
    Partido auxiliar;
    Fecha auxi;
    cout<<"ingrese el equipo local"<<endl;
    cin>>auxiliar.equipo_local;
    cout<<"ingrese el equipo visitante"<<endl;
    cin>>auxiliar.equipo_visita;
    cout<<"ingrese la cantidad de goles del equipo local"<<endl;
    cin>>auxiliar.goles_local;
    cout<<"ingrese la cantidad de goles del equipo visitante"<<endl;
    cin>>auxiliar.goles_visita;
    cout<<"ingrese el dia del partido"<<endl;
    cin>>auxi.dia;
    cout<<"ingrese el mes del partido"<<endl;
    cin>>auxi.mes;
    cout<<"ingrese el año del partido"<<endl;
    cin>>auxi.anio;
    cout<<"ingrese el estadio en el que se jugo"<<endl;
    cin>>auxiliar.estadio;
}

void mostrar_partido(vector <Partido> &partidos, vector<Fecha> &fechas){
    string L;
    string V;
    cout<<"ingrese el nombre del equipo local"<<endl;
    cin>>L;
    cout<<"ingrese el nombre del equipo visitante"<<endl;
    cin>>V;

    for (int i = 0; i < -1; i++)
    {
        if (L == partidos[i].equipo_local && V == partidos[i].equipo_visita)
        {
            cout<<"el equipo local hizo"<<partidos[i].goles_local<<" goles"<<endl;
            cout<<"el equipo visitante hizo"<<partidos[i].equipo_visita<<"goles"<<endl;
            cout<<"se jugo el"<<fechas[i].dia<<"/"<< fechas[i].mes<<"/"<< fechas[i].anio<<endl;
            cout<<"se jugo en"<<partidos[i].estadio<<endl;

        }
        
    }
    
}
int main(){
    vector<Equipo> equipos;
    vector<Partido> partidos;
    vector<Fecha> fechas;
    agregar_equipos();
    registrar_partidos();
    mostrar_partido(partidos);
    //falta terminar
}

