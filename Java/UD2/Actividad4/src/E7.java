import java.util.Scanner;

public class E7{
    public static void main(String[] args){
        //Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        //todos los valores desde P hasta Q, y lo muestre por pantalla.
        Scanner scan = new Scanner(System.in);

        IO.println("Introduce 2 numeros: ");
        int P = scan.nextInt();
        int Q = scan.nextInt();
        int dif = Math.abs(P-Q);
        int[] R = new int[dif + 1];
        for (int i = 0; i < R.length; i++) {
            R[i] = i + dif;
            IO.println("El valor de la posicion " + (i) + " es " + R[i]);
        }

    }
}