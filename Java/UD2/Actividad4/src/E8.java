import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        // Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        //utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        //cuántos valores del array son igual o superiores a R.
        Scanner scan = new Scanner(System.in);
        double R = scan.nextDouble();
        IO.println("Introduce un numero entre 0.0 y 1.0");
        int S = 0;
        double[] T = new double[100];
        for (double num : T ) {
            num = Math.random();
            if (num>=R){
                S++;
            }
        }
        IO.println(S);
    }
}