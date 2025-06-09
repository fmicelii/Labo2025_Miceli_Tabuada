package TiendaElectronica;

public class EquipoSonido extends Electronica{
    private boolean BluetoothInt;

    public EquipoSonido(boolean bluetoothInt, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        BluetoothInt = bluetoothInt;
    }


}
