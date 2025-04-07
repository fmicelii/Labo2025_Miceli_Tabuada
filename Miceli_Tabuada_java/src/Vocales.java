import java.util.Scanner;

public class Vocales {
    public static void main(String [] args) {
        String frase = "Ayer me compre muñecos de la marca ToyCo por internet";
        int contadorVocales = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
            System.out.println("la cantidad de vocales es de: " + contadorVocales);
    }
}