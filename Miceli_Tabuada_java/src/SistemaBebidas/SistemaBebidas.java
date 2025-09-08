package SistemaBebidas;

import java.util.HashSet;

public class SistemaBebidas {
    private HashSet<Bebedor> bebedores;

    public SistemaBebidas(HashSet<Bebedor> bebedores) {
        this.bebedores = bebedores;
    }

    public HashSet<Bebedor> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashSet<Bebedor> bebedores) {
        this.bebedores = bebedores;
    }

    public void agregarBebedor(Bebedor bebedor)throws DNIRepetidoException{
        for (Bebedor b : bebedores){
            if (b.getDni() == bebedor.getDni()){
                throw new DNIRepetidoException("el dni que se quiere ingresar ya esta pa");
            }
        }
    }

    public static void main(String[] args) {

    }
}
