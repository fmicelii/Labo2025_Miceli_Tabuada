package Personas;

public class Vacunado extends Persona{
    private String mail;
    private Provincia provincia;
    public Vacunado(int dni,String nombre,String apellido,Provincia provincia,String direccion,String mail){
        super(dni,nombre,apellido,direccion);
        this.mail = mail;
        this.provincia = provincia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
