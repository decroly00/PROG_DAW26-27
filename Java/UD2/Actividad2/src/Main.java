import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        //mayor de edad” solo si lo somos.
        int edad;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca edad: ");
        edad = scan.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        // 2. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
        //mayor de edad” o el mensaje de “eres menor de edad”.
        System.out.print("Introduzca edad: ");
        edad = scan.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        else if (edad < 18) {
            System.out.println("Eres menor de edad.");
        }
        // 3. Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
        //3... 20).
        int contador0 = 0;
        while (contador0 < 21) {
            System.out.println(contador0);
            contador0 = contador0 + 1;
        }
        // 4. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Para ello utiliza un contador y suma de 2 en 2.
        int contador = 0;
        while (contador < 200) {
            contador = contador + 2;
            System.out.println(contador);
        }
        // 5. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Esta vez utiliza un contador sumando de 1 en 1.
        int contador2 = 0;

        while (contador2 < 200) {
            contador2 = contador2 + 1;
            if (contador2 % 2 == 0) {
                System.out.println(contador2);
                contador2 = contador2 + 1;
            }
        }
        // 6. Realiza un programa que muestre los números desde el 1 hasta un número N que se
        //introducirá por teclado.
        int n;
        System.out.println("Introduzca un numero: ");
        n = scan.nextInt();
        int contador3 = 0;
        while (contador3 < n) {
            contador3 = contador3 + 1;
            System.out.println(contador3);
        }
        // 7. Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
        //calificación alfabética, escribiendo el resultado.
        double calificacion;
        System.out.println("Introduzca calificacion: ");
        calificacion = scan.nextDouble();
        if (calificacion >= 0 && calificacion < 3) {
            System.out.println("Muy Deficiente");
        } else if (calificacion >= 3 && calificacion < 5) {
            System.out.println("Insuficiente");
        } else if (calificacion >= 5 && calificacion < 6) {
            System.out.println("Bien");
        } else if (calificacion >= 6 && calificacion < 9) {
            System.out.println("Notable");
        } else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("xd");
        }
        // 8. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        //Siendo el factorial:
        int N;
          System.out.println("Introudce un numero: ");
          N = scan.nextInt();
        double i = N;
        double Nf = 1;
        while (i != 0) {
            Nf = Nf * i;
            i--;
        }
        System.out.println("El factorial de " + N + " es " + Nf);
        // 9. Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        //minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        //transcurrido un segundo.
        int Hora;
        int Minutos;
        int Segundos;
        System.out.println("Introduce la Hora: ");
        Hora = scan.nextInt();
        System.out.println("Introduce los Minutos: ");
        Minutos = scan.nextInt();
        System.out.println("Introduce los Segundos: ");
        Segundos = scan.nextInt();
        Segundos++;
        if (Segundos==60) {
            Segundos = 0;
            Minutos++;
        }
        if (Minutos==60) {
            Minutos = 0;
            Hora++;
        }
        if (Hora==24) {
            Hora = 0;
        }
        System.out.println("Son las: " + Hora + ":" + Minutos + ":" + Segundos);
        // 10. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        //leído algún número negativo o no.
        int J;
        boolean negativo = false;
        for (i=0; i <= 10; i++){
            System.out.println("Introduce numero no nulo: ");
            J = scan.nextInt();
            if (J==0) {
                System.out.println("No nulo: ");
                J = scan.nextInt();
            }
            if (J<0){
                negativo = true;
            }

        }
        System.out.println("Negativos " + negativo);
        // 11. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
        //indicando cuántos son positivos y cuantos negativos.
        int Nnegativos = 0;
        for (i=0; i <= 10; i++){
            System.out.println("Introduce numero no nulo: ");
            J = scan.nextInt();
            if (J==0) {
                System.out.println("No nulo: ");
                J = scan.nextInt();
                if (J==0) {
                    System.out.println("subnormal");
                }
            }
            if (J<0){
                Nnegativos++;
            }

        }
        System.out.println("Negativos " + Nnegativos);

    }
}
