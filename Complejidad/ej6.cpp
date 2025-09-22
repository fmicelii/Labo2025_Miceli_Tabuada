Dada una secuencia de n números enteros, dar un programa que encuentre la
máxima cantidad de elementos impares consecutivos cuya tiempo de ejecución de
peor caso pertenezca a O(n).
    -

int contarMesetaImpares(vector &v){
    int i = 0;
    int maxMeseta = 0;
    int meseta ;
    while ( i < v.size () ) {
        int j = i + 1;
        while ( j < v.size () && i % 2 == 1) {
            j ++;
        }
        meseta = j - i ;
        i = j ;
        if ( meseta > maxMeseta ) {
            maxMeseta = meseta ;
        }
    }
    return maxMeseta ;
}