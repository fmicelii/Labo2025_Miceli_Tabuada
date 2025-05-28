package SistemaAlarmas;

public class SensorCompuesto{
    SensorTemperatura st;
    SensorHumo sh;
    SensorPresion sp;

    public SensorCompuesto(SensorTemperatura st, SensorHumo sh, SensorPresion sp){
        this.st = st;
        this.sh = sh;
        this.sp = sp;
    }
    public double sumaMedida(){
        return (st.getMedida() + sh.getMedida() + sp.getMedida()) / 3;
    }
    public void comprobarMedidaCompuesta(){
        double umbralCompuesto = (st.getUmbrialInicial() + sh.getUmbrialInicial() + sp.getUmbrialInicial()) / 3;
        if (sumaMedida() > umbralCompuesto){
            st.comprobarMedida();
            sh.comprobarMedida();
            sp.comprobarMedida();
        }
    }
}
