import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean negativo = false;
        int negativos = 0;
        int positivos = 0;
        int J = 1;
        while (J!=0) {
            System.out.println("Introduce numero no nulo: ");
            J = scan.nextInt();
            if (J<0){
                negativo = true;
                negativos++;
            }
            if (J>0) {
                positivos++;
            }
        }
        System.out.println("Has introducido un 0");
        System.out.println("¿Negativos? " + negativo + " Nª negativos:" + negativos + " Nª postivos: " + positivos);
    }
}
