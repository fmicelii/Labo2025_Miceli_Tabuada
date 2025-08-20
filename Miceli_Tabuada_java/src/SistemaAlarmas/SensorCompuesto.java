package SistemaAlarmas;

public class SensorCompuesto{
    private SensorTemperatura st;
    private SensorHumo sh;
    private SensorPresion sp;

    public SensorCompuesto(SensorTemperatura st, SensorHumo sh, SensorPresion sp){
        this.st = st;
        this.sh = sh;
        this.sp = sp;
    }
    public double sumaMedida(){
        return (st.getMedida() + sh.getMedida() + sp.getMedida()) / 3;
    }
    public double sumaUmbral(){
        return (st.getUmbrialInicial() + sh.getUmbrialInicial() + sp.getUmbrialInicial()) / 3;
    }
    public void comprobarMedidaCompuesta(){
        if (sumaMedida() > sumaUmbral()){
            st.comprobarMedida();
            sh.comprobarMedida();
            sp.comprobarMedida();
        }
    }
}
