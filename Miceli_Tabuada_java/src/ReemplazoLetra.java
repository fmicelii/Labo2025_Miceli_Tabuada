import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        String frase = "Ayer me compre muñecos de la marca ToyCo por internet";
        frase = frase.toLowerCase();
        System.out.print("ingrese la letra para reemplazar: ");
        Scanner esc = new Scanner(System.in);
        char letra = esc.next().charAt(0);
        String nuevaFrase= "";
        for (int i = 0 ; i < frase.length(); i++){
            char l = frase.charAt(i);
            if ('e' == l){
                nuevaFrase += letra;
            }else{
                nuevaFrase += l;
            }
        }
        System.out.println(nuevaFrase);
    }
}
