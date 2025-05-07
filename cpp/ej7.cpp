#include <iostream>
#include <vector>
using namespace std;

struct Vuelta_rapida{
  int numero_vuelta;
  int tiempo;
  string nombre_piloto;
};
    
struct Equipo{
   string nombre;
   int puntos;
};

struct Piloto{
    int n_auto;
    string nombre;
    string nombre_equipo;
    int posc_inicio_carrera;
    int posc_final_carrera;
    int cant_puntos;
    bool vuelta_rapida;
};

void cargar_datos_carrera(){
    string equipo_nombre;
    Piloto piloto1;
    Piloto piloto2;

    cout<<"ingrese el nombre del equipo que desea ingresar sus 2 pilotos: ";
    cin>>equipo_nombre;
    cout<<"ingrese el numero de auto del primer pioloto: ";
    cin>>piloto1.n_auto;
    cout<<"ingrese el nombre del primer piloto: ";
    cin>>piloto1.nombre;
    piloto1.nombre_equipo=equipo_nombre;
    cout<<"ingrese la posicion de inicio del primer piloto: ";
    cin>>piloto1.posc_inicio_carrera;
    cout<<"ingrese la posicion final del primer piloto: ";
    cin>>piloto1.posc_final_carrera;

}


int main(){
   vector <Equipo> equipos;
   vector <Piloto> pilotos;

   for (int i = 0; i < 24; i++){
      // 1
      cargar_datos_carrera();
      // 2
      calcular_puntaje_piloto_equipo();
   }
   // 3
   ordenar_tabla_equipos();
   mostrar_tabla_equipos();
}