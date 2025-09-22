vector hacerAlgo (vector &v) {
    vector res ;
    for (int i = 0; i < 100; i ++) {
        res . push_back ( contarApariciones (v , i +1) );
    }
    return res ;
}
int contarApariciones (vector &v , int elem ) {
    int cantAp = 0;
    for (int i = 0; i < v . size (); i ++) {
        if ( v [ i ] == elem ) {
            cantAp ++;
        }
    }
}
Calcular el tiempo de ejecución de peor caso del programa hacerAlgo con
respecto al largo de v.
    - O(n)