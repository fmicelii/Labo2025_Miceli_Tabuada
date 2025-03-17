#include <iostream>
#include <vector>
using namespace std;

struct Producto{
    int codigo;
    string nombre_producto;
    float precio;
};

struct Pedido{
    int n_pedido;
    string nombre_cliente;
    vector <Producto> lista;
    float precios;
};

void mostrarProductos(vector <Producto> productos, int cantidad) {
    for (const auto& producto : productos) {
        // Mostrar el id, nombre y precio de cada producto
        cout << "ID: " << producto.codigo 
             << ", Producto: " << producto.nombre_producto 
             << " - Precio: $" << producto.precio << endl;
    }
}

Producto buscar_producto(int codigo, vector <Producto> productos){
    for (int i = 0; i < productos.size(); i++){
        if (codigo == productos[i].codigo){
            return productos[i];
        }
    }
}



int main(){
    vector <Pedido> lista_pedidos;

    vector <Producto> productos = {
        {1,"Papa", 15.50},
        {2,"Pizza", 120.75},
        {3,"Smartphone", 3500.99},
        {4,"Camiseta", 45.20},
        {5,"Laptop", 9500.00}
    };

    agregar_pedido(productos, lista_pedidos);
}