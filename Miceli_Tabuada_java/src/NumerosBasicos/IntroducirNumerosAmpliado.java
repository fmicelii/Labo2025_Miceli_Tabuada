package NumerosBasicos;

import java.util.Scanner;

public class IntroducirNumerosAmpliado {
    public static void main(String [] args) {
        Scanner esc = new Scanner(System.in);
        int n = 0;
        System.out.print("ingrese numero: ");
        n = esc.nextInt();
        int contadorNumeros = 0;
        int mayor = n;
        int menor = n;
        int suma = 0;
        int sumaP = 0;
        int sumaN = 0;

        while(n != -1){
            //mayor numero introducido
            if (n > mayor){
                mayor = n;
            }
            //menor numero introducido
            if (n < menor){
                menor = n;
            }
            //suma de todos los numeros
            suma += n;
            //suma numeros positivos
            if (n > 0){
                sumaP += n;
            }
            //suma numeros negativos
            if (n < 0){
                sumaN += n;
            }
            System.out.print("ingrese numero: ");
            n = esc.nextInt();
            contadorNumeros++;
        }
        System.out.println("la cantidad de numeros es de: " + contadorNumeros);
        System.out.println("mayor numero introducido: " + mayor);
        System.out.println("menor numero introducido: " + menor);
        System.out.println("suma todos los numeros: " + suma);
        System.out.println("suma todos los numeros positivos: " + sumaP);
        System.out.println("suma todos los numeros negativos: " + sumaN);

    }
}