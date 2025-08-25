package TiendaElectronica;

public class EquipoSonido extends Electronica{
    private boolean BluetoothInt;

    public EquipoSonido(String nombreFabricante, String nombreModelo, double precio, int stock, boolean bluetoothInt) {
        super(nombreFabricante, nombreModelo, precio, stock);
        BluetoothInt = bluetoothInt;
    }
}
