
// Importaciones
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializacion del Scanner
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el numero ");
        int Num = in.nextInt();
        String signo = "", paridad = "";

        if (Num > 0) {
            signo = "positivo";
        } else {
            signo = "negativo";
        }
        if (Num % 2 == 0) {
            paridad = "par";
        } else {
            paridad = "impar";
        }

        System.out.println("El numero " + Num + " es " + paridad + " y " + signo + ".");
    }
}
