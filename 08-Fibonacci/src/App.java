import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int Num = 0, Pre1 = 0, Pre2 = 1;

        System.out.print("Introduce un numero: ");
        Num = Math.abs(in.nextInt());

        System.out.print("La sucesión es: ");
        if (Num > 0) {
            System.out.print("1, ");
        }
        if (Num > 1) {
            for (int i = 0; i < Num - 1; i++) {
                int Tmp = Pre1;
                Pre1 = Pre2;
                Pre2 += Tmp;
                System.out.print(Pre2 + ", ");
            }
        }

    }
}
