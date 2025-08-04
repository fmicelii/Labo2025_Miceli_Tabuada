package Personas;
import Objetos.Materia;
import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int numeroTelefono;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    private int edad;
    private String direccion;
    private Pais pais;

    public Persona(){
        this.nombre = "juan";
        this.edad = 18;
        this.direccion = "tamborini 3574";
    }
    public Persona(int dni){
        this.nombre = "";
        this.apellido = "";
        this.numeroTelefono = 1100000000;
        this.dni = dni;
        this.pais = Pais.ARGENTINA;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String apellido,int numeroTelefono){
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
    }
    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = null;
    }

    public Persona(int dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }

    public void mostrarDatos(){
        System.out.println("nombre: " + nombre + ", edad: " + edad + ", direccion: " + direccion);
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public static void main(String[] args) {
        Persona pe1 = new Persona("Lolo",19,"tomba 6909");

        pe1.mostrarDatos();
    }

    public int antiguedad(){
        int cantAnos = 0;
        if (fechaIngreso == null){
            return cantAnos;
        } else {
            LocalDate viejardo = LocalDate.now().minusYears(fechaIngreso.getYear());
            cantAnos = viejardo.getYear();
            return cantAnos;
        }
    }
}
