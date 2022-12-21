import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String Res = "", Ret = "";
        int En = Aleatorio(1, 3), Am = 0;
        System.out.println("Jugemos piedra papel o tijeras!");
        System.out.println("[1] Piedra");
        System.out.println("[2] Papel");
        System.out.println("[3] Tijeras");
        System.out.print("Elige uno: ");
        Am = in.nextInt();
        Res = elec(Am);
        Ret = elec(En);

        System.out.println("Contrincante: " + Ret);
        System.out.println("Tu: " + Res);

    }

    public static int Aleatorio(int Mínimo, int Máximo) {
        int Num = 0;
        do {
            Num = (int) Math.round(Math.random() * Máximo);
        } while (Num < Mínimo || Num > Máximo);
        return Num;
    }

    public static String elec(int Eleccion) {
        if (Eleccion == 1) {
            return "Piedra";
        } else if (Eleccion == 2) {
            return "Papel";
        } else {
            return "Tijeras";
        }
    }
}
