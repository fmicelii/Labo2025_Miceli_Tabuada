int mesetaMasLarga (vector &v) {
    int i = 0;
    int maxMeseta = 0;
    int meseta ;
    while ( i < v.size () ) {
        int j = i + 1;
        while ( j < v.size () && v [ i ] == v [ j ]) {
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

a) ¿Qué hace este programa?
    a- devuelve una meseta, osea la secuencia de numeros iguales consecutivos mas larga.
b) Calcular el tiempo de ejecución de peor caso de este programa en función
del tamaño del vector.
    b- O(n), nunca se llega a n al cuadrado pq aunque haya dos while, cada elemento
    se recorre una sola vez.
c) ¿Es posible escribir otro programa que resuelva el problema utilizando solo un
ciclo?
    c- si es posible, pero no sirve ya que no cambia el peor caso, seguiria siendo O(n).