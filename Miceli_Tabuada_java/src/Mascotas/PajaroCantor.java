package Mascotas;

public class PajaroCantor extends Mascota{
    private String saludo;
    public PajaroCantor(String nombre, String nombreDueno) {
        super(nombre, nombreDueno);
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String saludar(){
        return saludo;
    }
    public void Saludar(String mascota, String dueno){
        if (esElDueno(mascota, dueno)) {
            System.out.println(saludar());
        } else {
            System.out.println("");
        }
    }
}
