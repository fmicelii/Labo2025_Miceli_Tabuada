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

void mostrar_menu(){
    cout<<"elija una opcion: "<<endl;
    cout<<"1- mostrar columna mas cara"<<endl;
    cout<<"2- nombre del producto de la fila 2, columna 3"<<endl;
    cout<<"3- promedio de precios de todo el pasillo"<<endl;
    cout<<"4- cantidad de productos con fecha de vencimiento"<<endl;
    cout<<"5- salir del programa"<<endl;
    cout<<"-- opcion: ";
}

//1
void columna_mas_cara(Producto gondolaa[3][4]){
    int columna_carisima = 0;
    int max_precio_columna = 0;

    for (int j = 0; j < 4; j++){
        int columna_acutal = 0;

        for (int i = 0; i < 3; i++){
            columna_acutal += gondolaa[i][j].precio;
        }
    
        if (columna_acutal >= max_precio_columna){
            max_precio_columna = columna_acutal;
            columna_carisima = j;
        }
    }
    cout<<"la columna mas cara es la numero: "<< columna_carisima<<", con un total de: "<<max_precio_columna<<endl;
}

//2
void producto_2_3(Producto gondolaa[3][4]){
    cout<<"El nombre del producto de la fila 2 y columna 3 es: "<< gondolaa[2][3].nombre<<endl;
}

//3
void promedio(Producto gondolaa[3][4]){
    int n = 0;
    for (int j = 0; j < 4; j++){
        for (int i = 0; i < 3; i++){
            n += gondolaa[i][j].precio;
        }
    }
    int promedio = n / 12;
    cout<<"el promedio de precios es: "<< promedio<<endl;
}

//4
void productos_con_vencimiento(Producto gondolaa[3][4]){
    int n = 0;
    for (int j = 0; j < 4; j++){
        for (int i = 0; i < 3; i++){
            if (gondolaa[i][j].fecha_vencimiento){
                n++;
            }   
        }
    }
    cout<<"La cantidad de productos con fecha de vencimiento es de: "<< n <<endl;
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
            {333444555, "Pasta", "MarcaF", 300, true},
            {222333444, "Galletas", "MarcaG", 80, true},
            {555666777, "Leche", "MarcaH", 250, true}
        },
        {
            {999888777, "Jugo", "MarcaI", 120, true},
            {666777888, "Cereal", "MarcaJ", 300, true},
            {444333222, "Frijoles", "MarcaK", 300, false},
            {333222111, "Queso", "MarcaL", 450, false}
        }
    };
    int opcion;
    bool continuar = 1;
    string var;
    while (opcion != 5)
    {
        if (!continuar){
            cout<<endl<<"Desea continuar con el programa?"<<endl;
            cin>>var;
            if (var == "si"){
                continuar = 1;
            }else{
                opcion = 5;
                cout<<"Gracias por utilizar el programa."<<endl;
                return 0;
            }
        }
        if(continuar){
            continuar = 0;
        
            mostrar_menu();
            cin>>opcion;

            switch (opcion){
                case 1:
                    columna_mas_cara(gondola);
                    break;
                case 2:
                    producto_2_3(gondola);
                    break;
                case 3:
                    promedio(gondola);
                    break;
                case 4:
                    productos_con_vencimiento(gondola);
                    break;
                case 5:
                    cout<<"Gracias por utilizar el programa."<<endl;
                    return 0;
                default:
                    cout<<"Opcion invalida."<<endl;
                    break;
            }
        }
    }
}
