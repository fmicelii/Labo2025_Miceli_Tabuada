import java.util.Scanner;

public class ingreso_datos {
    public static void main(String[] args){
        Scanner esc = new Scanner(System.in);

        // Lee los valores de entrada
        int N = esc.nextInt();
        double A = esc.nextDouble();
          // Consume el salto de línea residual
        //char C = esc.nextLine().charAt(0);

        // Muestra los resultados
        System.out.println(N);
        System.out.println(A);
        //System.out.print(C);
        System.out.println(N + A);
        System.out.println(A - N);

        // Muestra el valor ASCII del carácter C
        //int var = C;
        //System.out.println(var);
    }
}
