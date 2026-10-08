import java.util.Scanner;

public class E6 {
    //Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
    //N, escriba M en todas sus posiciones y lo muestre por pantalla.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        IO.println("Introduce 2 numeros: ");
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] O = new int[N];

        for (int i = 0; i < O.length; i++) {
            O[i] = M;
            IO.println("El valor de la posicion " + i + " es " + O[i]);
        }
    }
}