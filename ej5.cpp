#include <iostream>
#include <vector>
using namespace std;


struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Producto{
    int codigo;
    string nombre;
    int cant_ventas;
    int precio;
    string categoria;
    bool tiene_promocion;
    //promocion descuenta 20%
};

struct Pedido{
    string nombre_cliente;
    vector <Producto> productos_pedidos;
    int cant_cada_producto;
    int precio_total;
    Fecha fecha_pedido;
};

void hacer_pedido(vector <Producto> p){
    for (int i = 0; i < -1; i++)
    {
        cout<<"ingrese el codigo del producto que desea: ";
        cin
    }
    
}
int main() {
    // Crear un vector de productos de McDonald's con códigos numéricos del 1 al 20
    vector<Producto> productos = {
        {1, "Big Mac", 5000, 150, "Hamburguesa", true},
        {2, "McPollo", 4000, 120, "Hamburguesa", false},
        {3, "Cuarto de Libra con Queso", 3000, 130, "Hamburguesa", false},
        {4, "McNuggets", 6000, 80, "Papas fritas", true},
        {5, "Papas Fritas", 7000, 60, "Papas fritas", false},
        {6, "McFlurry Oreo", 2500, 100, "Postre", true},
        {7, "McFlurry M&M", 2000, 100, "Postre", true},
        {8, "Coca-Cola", 10000, 50, "Bebida", false},
        {9, "Sprite", 9000, 50, "Bebida", false},
        {10, "Fanta", 8000, 50, "Bebida", false},
        {11, "McCafe Espresso", 3500, 90, "Bebida", true},
        {12, "McCafe Latte", 3000, 95, "Bebida", true},
        {13, "Cheddar McMelt", 1500, 140, "Hamburguesa", false},
        {14, "Filet-O-Fish", 2000, 120, "Hamburguesa", false},
        {15, "Sundae Chocolate", 1800, 110, "Postre", false},
        {16, "Sundae Fresa", 1600, 110, "Postre", false},
        {17, "Happy Meal", 2500, 150, "Menú infantil", true},
        {18, "McWrap Pollo", 2200, 130, "Wraps", false},
        {19, "McWrap Vegetal", 1800, 120, "Wraps", false},
        {20, "McCombo", 5000, 250, "Combo", true}
    };

    hacer_pedido(productos);
}