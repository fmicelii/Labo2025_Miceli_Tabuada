package U1;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre = "juan";
        this.edad = 18;
        this.direccion = "tamborini 3574";
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", direccion: " + direccion);
    }

    public static void main(String[] args) {
        Persona pe1 = new Persona("Lolo",19,"tomba 6909");

        pe1.mostrarDatos();
    }
}
