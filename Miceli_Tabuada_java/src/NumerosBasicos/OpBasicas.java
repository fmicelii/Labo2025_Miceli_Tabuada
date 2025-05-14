package NumerosBasicos;

import Personas.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class OpBasicas {
    public static void main(String[] args) {
        int contador = 0;
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(11);
        numeros.add(21);

        for (Integer numero : numeros){
            contador += numero;
        }
        System.out.println(contador);

        ///////////////////////////////////////////////////////////////////
        Scanner esc = new Scanner(System.in);
        ArrayList <String> nombres = new ArrayList<String>();
        nombres.add("ernesto");
        nombres.add("Lolo");
        nombres.add("Eduardo");

        System.out.println("ingrese letra: ");
        char letra = esc.nextLine().charAt(0);

        for (String nombre : nombres){
            String may = nombre.toUpperCase();
            String min = nombre.toLowerCase();

            if (letra == may.charAt(0) || letra == min.charAt(0) ){
                System.out.println(nombre);
            }
        }
        ////////////////////////////////////////////////////////////////
        ArrayList <Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("Lolo",54,"tomba 6909"));
        personas.add(new Persona());
        for (Persona persona : personas){
            if (persona.getEdad() > 30){
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Nombre: " + persona.getNombre());
            }
        }
    }
}
