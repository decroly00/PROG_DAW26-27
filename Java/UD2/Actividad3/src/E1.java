import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int cantidad = 1;
        int billete500, billete200, billete100, billete50, billete20, billete10, billete5;
        int resto;
        Scanner scan = new Scanner(System.in);
        while (cantidad%5!=0) {
            IO.println("Introduce un numero multiplo de 5: ");
            cantidad = scan.nextInt();
        }
        billete500 = cantidad/500;
        resto = cantidad%500;
        if (resto!=0) {
            billete200 = resto/200;
            resto = resto%200;
            if (resto!=0) {
                billete100 = resto/100;
                resto = resto%100;
                if (resto!=0) {
                    billete50 = resto / 50;
                    resto = resto % 50;
                    if (resto != 0) {
                        billete50 = resto / 50;
                        resto = resto % 50;
                        if (resto != 0) {
                            billete20 = resto / 20;
                            resto = resto % 20;
                            if (resto != 0) {
                                billete10 = resto / 10;
                                resto = resto % 10;
                                if (resto != 0) {
                                    billete5 = resto / 5;
                                }
                            }
                        }
                    }
                }
            }


        if (billete200!=0){
            IO.println("Billetes 200: " + billete200);
        }
        if (billete100!=0){
            IO.println("Billetes 100: " + billete100);
        }
        if (billete50!=0){
            IO.println("Billetes 50: " + billete50);
        }
        if (billete20!=0){
            IO.println("Billetes 20: " + billete20);
        }
        if (billete10!=0){
            IO.println("Billetes 10: " + billete10);
        }
        if (billete5!=0){
            IO.println("Billetes 5: " + billete5);
        }

    }
}
}
