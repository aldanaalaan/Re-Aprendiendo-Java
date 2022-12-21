import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int Numeros[] = new int[5];
        int Resultado = 0;

        for (int i = 0; i < Numeros.length; i++) {
            System.out.print("Ingresa un numero: ");
            Numeros[i] = in.nextInt();
            Resultado += Numeros[i];
        }
        System.out.print("Los numeros son: ");
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[i] + ", ");
        }
        System.out.println("");

        System.out.println("La suma de todos los numeros es " + Resultado);

        System.out.print("Los numeros al reves son: ");
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[Numeros.length - (i + 1)] + ", ");
        }

    }
}
