public class ValorNuloException {
    public ValorNuloException() {
    }

    public void bloqueTryCatch(String nombre){
        try{
            //excepcion de una referenciacion a un puntero nulo
            System.out.println("El largo del nombre es:" + nombre.length());
        }catch(NullPointerException exc){
            //capturamos la excepcion
            System.err.println("se referencia a un puntero nulo, dale un valor man osea bro dale");
        }
    }


    public static void main(String[] args) {
        ValorNuloException vne = new ValorNuloException();
        String nombre = null;
        vne.bloqueTryCatch(nombre);


    }
}
