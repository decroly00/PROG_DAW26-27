import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Escribe un programa que dé los “buenos días”.
         */
        System.out.println("Buenos días");
        /*
        2. Escribe un programa que calcule y muestre el área de un cuadrado de lado ig4ual a 5.
         */
        int side = 5;
        System.out.println(side * side);
        /*
        3. Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por
        teclado.
         */
        int side1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el lado: ");
        side1 = scan.nextInt();
        System.out.println(side1 * side1);
        /*
        4.  Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        producto y división.
         */
        double value1, value2;
        scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        value1 = scan.nextDouble();
        System.out.print("Introduce otro numero: ");
        value2 = scan.nextDouble();
        System.out.println("Suma: " + (value1 + value2));
        System.out.println("Resta: " + (value1 - value2));
        System.out.println("Producto: " + (value1 * value2));
        System.out.println("División: " + (value1 / value2));
        /*
        5. Escribe un programa que toma como dato de entrada un número que corresponde a la
        longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        volumen de la esfera que corresponden con dicho radio.
         */
        int rad;
        scan = new Scanner(System.in);
        System.out.print("Introduce longitud radio: ");
        rad = scan.nextInt();
        System.out.println("Longitud de la circunferencia: " + rad * Math.PI);
        System.out.println("Área del círculo: " + rad * Math.PI * Math.PI);
        System.out.println("Volumen esfera: " + 4.0 / 3.0 * Math.PI * Math.pow(rad, 3));

        /*
        6. Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        muestre el porcentaje de descuento realizado.
         */
        double price1, price2;
        scan = new Scanner(System.in);
        System.out.print("Precio artículo: ");
        price1 = scan.nextDouble();
        System.out.print("Precio venta real: ");
        price2 = scan.nextDouble();
        /* no va
        System.out.println("Descuento: " + Math.abs(price2 / price1 - 1.0) * 100.0 + "%");
         */
        System.out.println("Descuento: " + (price1 - price2) / price1 * 100 + "%");
        /*
        7. Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
         */
        double nmi;
        scan = new Scanner(System.in);
        System.out.print("Introduzca millas marinas para convertir en metros: 1");
        nmi = scan.nextDouble();
        System.out.println(nmi + " Millas marinas son " + (nmi * 1.852) + " metros" );
        /*
        8. Escribe un programa que lee dos números y los visualiza en orden ascendente.
         */
        System.out.println("Ejercicio 8");
        double value81, value82;
        scan = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        value81 = scan.nextDouble();
        System.out.print("Introduzca otro numero: ");
        value82 = scan.nextDouble();
        System.out.println(Math.max(value81, value82) + ", " + Math.min(value81, value82));
        /*
        9. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
         */
        System.out.println("Ejercicio 9");
        double value91, value92;
        scan = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        value91 = scan.nextDouble();
        System.out.print("Introduzca otro numero: ");
        value92 = scan.nextDouble();

    }
}