package SeresVivos;

import Objetos.Materia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private ArrayList <Integer> notas;
    private ArrayList <Materia> materias;

    public Alumno(){
        this.nombre = "Lolo";
        this.apellido = "Taborda";
        this.fechaNacimiento = LocalDate.now(); //fecha por defecto
        this.notas = new ArrayList<Integer>();
        this.notas.add(3);
        this.notas.add(32);
        this.notas.add(9);
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregarNota(){
        Scanner esc = new Scanner(System.in);
        int num = esc.nextInt();
        notas.add(num);
        System.out.println("nota agregada");
    }
    public void menorNota(){
        int less = Collections.min(notas);
        System.out.println("la menor nota es: " + less);
    }
    public void mayorNota(){
        int mas = Collections.max(notas);
        System.out.println("la menor nota es: " + mas);
    }
    public void agregarMateria(Materia materia){
        materias.addLast(materia);
    }

    public static void main(String[] args) {
        Materia m1 = new Materia();

    }
}
