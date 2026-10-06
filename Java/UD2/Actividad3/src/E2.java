import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        double n1;
        double n2;
        String J;
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce un numero:");
        n1 = scan.nextDouble();
        IO.println("Introduce otro numero:");
        n2 = scan.nextDouble();
        while (1 == 1) {
            IO.println("Selecciona una de las opciones:");
            IO.println("1. Sumar");
            IO.println("2. Restar");
            IO.println("3. Multiplicar");
            IO.println("4. Dividir");
            IO.println("5. Salir");
            J = scan.nextLine();
            if (J.equals("1")) {
                IO.println("La suma es:");
                IO.println(n1+n2);
            } else if (J.equals("2")) {
                IO.println("La resta es");
                IO.println(n1-n2);
            } else if (J.equals("3")) {
                IO.println("El producto es:");
                IO.println(n1*n2);
            } else if (J.equals("4")) {
                IO.println("El resultado es: ");
                if (n2==0){
                    IO.println("No se puede dividir por 0");
                } else {
                    IO.println(n1 / n2);
                }
            } else if (J.equals("5")) {
                IO.println("salir");
                return;
            } else {
                IO.println("Subnormal, son validos solo los siguientes NUMEROS: \n 1 \n 2 \n 3 \n 4 \n 5");
            }
        }
    }
}