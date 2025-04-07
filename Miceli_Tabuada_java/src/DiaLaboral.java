import java.util.Objects;
import java.util.Scanner;

public class DiaLaboral {
    public static void main(String [] args) {
        Scanner esc = new Scanner(System.in);
        System.out.print("ignrese dia de la semana: ");
        String dia = esc.nextLine();

        if (dia.equals("sabado") || dia.equals("domingo")){
            System.out.println("el dia es no laboral");
        } else {
            System.out.println("el dia es laboral");
        }
    }
}