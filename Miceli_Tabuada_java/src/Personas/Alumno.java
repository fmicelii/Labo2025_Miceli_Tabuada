package Personas;

import Objetos.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Alumno extends Persona{
    private ArrayList <Integer> notas;
    private ArrayList <Materia> materias;
    private String division;

    public Alumno(String division){
        super("","");
        this.division = division;
    }
    public Alumno(String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division = division;
    }

    public Alumno(){
        super("lolo","taborda",48392028,LocalDate.now(),"tamborini 3574");
        this.notas = new ArrayList<Integer>();
        this.notas.add(3);
        this.notas.add(32);
        this.notas.add(9);
    }
    public Alumno(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String direccion,ArrayList<Integer> notas,ArrayList<Materia> materias){
        super(nombre,apellido,dni,fechaNacimiento,direccion);
        this.notas = notas;
        this.materias = materias;
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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
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
