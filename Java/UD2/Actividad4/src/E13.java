import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        int V;
        int N;
        int I;
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce valor inicial: ");
        V = scan.nextInt();
        IO.println("Introduce valor I");
        I = scan.nextInt();
        IO.println("Introduce valor N");
        N = scan.nextInt();
        int[] J = new int[N];
        J[0] = V;
        IO.println(J[0]);
        for (int i = 1; i < J.length; i++) {
            J[i] = J[i-1] + I;
            IO.println(J[i]);
        }
    }
}