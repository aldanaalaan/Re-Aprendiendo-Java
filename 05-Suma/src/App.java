import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Iniclizar Scanner
        Scanner in = new Scanner(System.in);

        // Variables
        int Num1 = 0, Num2 = 0;

        System.out.print("Ingresa un numero ");
        Num1 = in.nextInt();
        System.out.print("Ingresa otro numero ");
        Num2 = in.nextInt();

        System.out.println("La suma de " + Num1 + " y " + Num2 + " es " + (Num1 + Num2));

    }
}
