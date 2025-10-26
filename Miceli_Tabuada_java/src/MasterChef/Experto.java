package MasterChef;

import java.time.LocalDate;

public class Experto extends Participante implements PlatoPrincipalOperator,PlatoEntradaOperator{
    private static int tiempoLimite = 80; //minutos
    private int tiempoLimitePersonal;

    public Experto(String nombre, String apellido, LocalDate fechaNacimiento, String localidad) {
        super(nombre, apellido, fechaNacimiento, localidad);
        this.tiempoLimitePersonal = tiempoLimite;
    }

    public static int getTiempoLimite() {
        return tiempoLimite;
    }

    public static void setTiempoLimite(int tiempoLimite) {
        Experto.tiempoLimite = tiempoLimite;
    }

    public int getTiempoLimitePersonal() {
        return tiempoLimitePersonal;
    }

    public void setTiempoLimitePersonal(int tiempoLimitePersonal) {
        this.tiempoLimitePersonal = tiempoLimitePersonal;
    }

    @Override
    public void PrepararCocina() {
        System.out.println("Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + (getTiempoLimitePersonal()-5));
        setTiempoLimitePersonal(getTiempoLimitePersonal()-5);
    }

    @Override
    public void cocinarEntrada(PlatoEntrada plato) throws TiempoInsuficienteException{
        if (getTiempoLimitePersonal() < plato.getTiempoCoccion()){
            throw new TiempoInsuficienteException("el tiempo del experto es insuficiente."); //uso el atributo tiempoCoccion que ya estaba antes en Plato
        }
        System.out.println("experto cocinando entrada lol...");
    }

    @Override
    public void servirEntrada(PlatoEntrada plato) {
        System.out.println("experto sirviendo entrada lol...");
    }

    @Override
    public void cocinarPlato(PlatoPrincipal plato) throws TiempoInsuficienteException{
        if (getTiempoLimitePersonal() < plato.getTiempoCoccion()){
            throw new TiempoInsuficienteException("el tiempo del experto es insuficiente."); //uso el atributo tiempoCoccion que ya estaba antes en Plato
        }
        System.out.println("experto cocinando principal lol...");
    }

    @Override
    public void servirPlato(PlatoPrincipal plato) {
        System.out.println("experto sirviendo principal anashe...");
    }
}
