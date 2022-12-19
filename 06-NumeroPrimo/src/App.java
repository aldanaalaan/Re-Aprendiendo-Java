import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializacion de Scanner
        Scanner in = new Scanner(System.in);

        // Variables
        int Num = 1;
        int Divisores = 0;

        while (Num != 0) {
            System.out.print("Introduce un numero(0 para salir): ");
            Num = Math.abs(in.nextInt());
            System.out.println("Tomaremos el valor absoluto.");
            if (Num != 0) {

                for (int i = 1; i <= Num; i++) {
                    if (Num % i == 0) {
                        Divisores++;
                    }
                }
                if (Divisores < 3) {
                    System.out.println("El numero " + Num + " es primo");
                } else {
                    System.out.println("El numero " + Num + " no es primo");
                }
            } else {
                System.out.println("Saliendo...");
            }

        }

    }
}
