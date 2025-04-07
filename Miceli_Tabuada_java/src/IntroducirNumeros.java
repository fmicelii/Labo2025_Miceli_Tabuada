import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String [] args) {
        Scanner esc = new Scanner(System.in);
        System.out.print("ingrese numero: ");
        int n = esc.nextInt();
        int contadorNumeros = 0;

        while(n != -1){
            System.out.print("ingrese numero: ");
            n = esc.nextInt();
            contadorNumeros++;
        }
        System.out.println("la cantidad de numeros es de: " + contadorNumeros);
    }
}