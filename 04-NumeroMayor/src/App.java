import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializacion de Scanner
        Scanner in = new Scanner(System.in);

        // Variables
        int Num1 = 0, Num2 = 0;

        System.out.print("Ingresa un numero: ");
        Num1 = in.nextInt();

        System.out.print("Ingresa otro numero: ");
        Num2 = in.nextInt();

        if (Num1 > Num2) {
            System.out.println("El numero " + Num1 + " es mayor que " + Num2);
        } else if (Num2 > Num1) {
            System.out.println("El numero " + Num2 + " es mayor que " + Num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
