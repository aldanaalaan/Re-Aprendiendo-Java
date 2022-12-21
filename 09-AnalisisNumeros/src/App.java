import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner
        Scanner in = new Scanner(System.in);

        // Variables por paridad
        int pares = 0, sumPares = 0;
        int impares = 0, sumImpares = 0;

        // Variables por signo
        int positivos = 0, sumPositivos = 0;
        int negativos = 0, sumNegativos = 0;

        // Mantener ciclo
        boolean estado = true;

        // Numero a introducir
        int Num = 0, Numeros = 0, sumNumeros = 0;
        // Mantener?
        String Res = "";

        while (estado) {
            System.out.print("Dame un numero: ");
            Num = in.nextInt();
            Numeros++;
            sumNumeros += Num;

            if (Num > 0) {
                positivos++;
                sumPositivos += Num;
            } else {
                negativos++;
                sumNegativos += Num;
            }
            if (Num % 2 == 0) {
                pares++;
                sumPares += Num;
            } else {
                impares++;
                sumImpares += Num;
            }
            System.out.print("¿Quieres introducir otro numero? <S>: ");
            Res = in.next();
            estado = Res.equalsIgnoreCase("s");
        }
        System.out.println("La suma de los " + pares + " pares es " + sumPares);
        System.out.println("La suma de los " + impares + " impares es " + sumImpares);
        System.out.println("La suma de los " + positivos + " positivos es " + sumPositivos);
        System.out.println("La suma de los " + negativos + " negativos es " + sumNegativos);
        System.out.println("La media de los " + Numeros + " numeros es " + (sumNumeros / Numeros));

    }
}
