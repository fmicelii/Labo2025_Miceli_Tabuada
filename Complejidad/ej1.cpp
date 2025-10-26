//1. Contar la cantidad de operaciones elementales que realizan los siguientes programas.
int ultimo1 (vector v) {
 return v[ v.size() - 1 ]; // 4
}
int ultimo2 (vector v) {
int i = v.size();  // 3
return v[ i - 1 ];  // 3
}
int ultimo3 (vector v) {
int i = 0;  // 2
while ( i < v.size() ) { // 2n
i ++; // O(2)  (asignacion y suma)
}
return v[ i - 1 ]; // 3
}

// 