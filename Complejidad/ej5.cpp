int sumarPotenciaHasta (int n) {
    int res = 0;
    int i = 1;
    while ( i < n ) {
        res = res + i;
         i = i * 2;
    }
    return res;
}
¿Qué tiempo de ejecución de peor caso tiene el programa en función del valor n?
    - O(log2(n))