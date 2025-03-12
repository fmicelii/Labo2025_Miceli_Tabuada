#include <iostream>
#include <vector>
using namespace std;

struct Producto{
    int codigo_barra;
    string nombre;
    string marca;
    int precio;
    bool fecha_vencimiento;
};

void columna_mas_cara(Producto gondola[3][4]){
    int columna_carisima = 0;
    int max_precio_columna = 0;

    for (int j = 0; j < 4; j++){
        int columna_acutal = 0;

        for (int i = 0; i < 3; i++){
            columna_acutal += gondola[i][j].precio;
        }
    
        if (columna_acutal >= max_precio_columna){
            max_precio_columna = columna_acutal;
            columna_carisima = j;
        }
    }
    cout<<"la columna mas cara es la numero: "<< columna_carisima<<", con un total de: "<<max_precio_columna<<endl;
}

int main(){
        Producto gondola[3][4] = {
        {
            {123456789, "Arroz", "MarcaA", 500, true},
            {987654321, "Aceite", "MarcaB", 300, true},
            {111222333, "Azúcar", "MarcaC", 100, false},
            {444555666, "Sal", "MarcaD", 50, false}
        },
        {
            {777888999, "Harina", "MarcaE", 200, false},
            {333444555, "Pasta", "MarcaF", 150, true},
            {222333444, "Galletas", "MarcaG", 80, true},
            {555666777, "Leche", "MarcaH", 250, true}
        },
        {
            {999888777, "Jugo", "MarcaI", 120, true},
            {666777888, "Cereal", "MarcaJ", 400, true},
            {444333222, "Frijoles", "MarcaK", 300, false},
            {333222111, "Queso", "MarcaL", 450, false}
        }
    };

}
