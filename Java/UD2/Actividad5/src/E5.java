import java.util.Arrays;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine().toLowerCase().replace(" ", "");

        char[] a = A.toCharArray();
        char[] ai = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            ai[i] = a[(a.length - i - 1)];
        }
        if (Arrays.equals(a,ai)){
            IO.println("son palindromos");
        }
    }
}