import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int Num = in.nextInt();
        System.out.println("");

        System.out.print("El factorial del numero " + Num + " es ");

        for (int i = Num - 1; i > 0; i--) {
            Num *= i;
        }
        System.out.println(Num);

    }
}
