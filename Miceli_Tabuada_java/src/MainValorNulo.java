public class MainValorNulo {
    public MainValorNulo() {
    }

    public void bloqueTryCatch(String nombre){
        try{
            System.out.println("El largo del nombre es:" + nombre.length());
        }catch(NullPointerException exc){
            System.err.println("se referencia a un puntero nulo, dale un valor man osea bro dale");
        }
    }

    public void bloqueThrow(String nombre) throws Exception{
        try {
            if (nombre == null){
                throw new NullPointerException("estas referenciando a una variable NULA tontin");
            }
            System.out.println("el largo es :" + nombre.length());
        }catch (NullPointerException e){
            System.err.println(e);
        }
    }

    public int mostrarLargo(String nombre)throws NullPointerException{
        return nombre.length();
    }

    public void bloqueThrows(String nombre){
        try {
            System.out.println(mostrarLargo(nombre));
        }catch (NullPointerException e){
            System.err.println("el puntero es nulo pa, espabila");
        }
    }

    public void bloquePersonalizado(String nombre) throws ValorNuloException{
        if (nombre == null){
            throw new ValorNuloException("el valor del nombre es nulo");
        }
        System.out.println("la cantidad de letras es de:" + nombre.length());
    }

    public static void main(String[] args) throws Exception {
        MainValorNulo vne = new MainValorNulo();
        String nombre = null;

        vne.bloqueTryCatch(nombre);

        vne.bloqueThrow(nombre);

        vne.bloqueThrows(nombre);

        vne.bloquePersonalizado(nombre);
    }
}

