import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializar Scanner
        Scanner in = new Scanner(System.in);

        // Variables de pares e impares
        int Pares = 0;
        int Impares = 0;

        System.out.print("Intriduce un numero: ");
        int Num = in.nextInt();

        for (int i = 0; i <= Num; i++) {
            if (i % 2 == 0) {
                Pares += i;
            } else {
                Impares += i;
            }
        }

        System.out.println("La suma de pares es: " + Pares);
        System.out.println("La suma de impares: " + Impares);
    }
}
