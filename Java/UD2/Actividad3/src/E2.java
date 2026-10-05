import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        double n1;
        double n2;
        int J;
        Scanner scan = new Scanner(System.in);
        while (1 == 1) {
            IO.println("Selecciona una de las opciones:");
            IO.println("1. Sumar");
            IO.println("2. Restar");
            IO.println("3. Multiplicar");
            IO.println("4. Dividir");
            IO.println("5. Salir");
            J = scan.nextInt();
            if (J == 1) {
                IO.println("Introduce 2 numeros para sumar:");
                n1 = scan.nextDouble();
                n2 = scan.nextDouble();
                IO.println(n1+n2);
            } else if (J == 2) {
                IO.println("Introduce 2 numeros para restar:");
                n1 = scan.nextDouble();
                n2 = scan.nextDouble();
                IO.println(n1-n2);
            } else if (J == 3) {
                IO.println("Introduce 2 numeros para multiplicar:");
                n1 = scan.nextDouble();
                n2 = scan.nextDouble();
                IO.println(n1*n2);
            } else if (J == 4) {
                IO.println("Introduce 2 numeros para dividir:");
                n1 = scan.nextDouble();
                n2 = scan.nextDouble();
                if (n2==0){
                    IO.println("No se puede dividir por 0");
                }
                IO.println(n1/n2);
            } else if (J == 5) {
                IO.println("salir");
                return;
            }
        }
    }
}