import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        //Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        //personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
        //teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        //miden por encima y por debajo de la media.
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce numero de personas:");
        int N = scan.nextInt();
        double[] alturas = new double[N];
        double max = -Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        double cmedia = 0;
        double media;
        for (double altura : alturas) {
            IO.println("Introduce altura:");
            altura = scan.nextDouble();
            max = Math.max(max, altura);
            min = Math.min(min, altura);
            cmedia = cmedia + altura;
        }
        media = cmedia /N;
        IO.println("Altura maxima: " + max);
        IO.println("Altura minima: " + min);
        IO.println("Altura media: " + media);
    }
}