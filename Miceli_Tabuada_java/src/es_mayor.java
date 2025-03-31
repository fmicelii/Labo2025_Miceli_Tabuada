import java.util.Scanner;

public class es_mayor {
    public static void main(String [] args){
        Scanner esc = new Scanner(System.in);
        int n1 = esc.nextInt();
        int n2 = esc.nextInt();
        if (n1>n2){
            System.out.println("el primer numero es mayor");
        }
        else if (n1<n2){
            System.out.println("el segundo numero es mayor");
        }
        else{
            System.out.println("son iguales papa");
        }
    }
}
