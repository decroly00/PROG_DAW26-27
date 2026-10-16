import java.util.Scanner;

public class E5 {
    //Crea un programa que pida veinte números reales por teclado, los almacene en un array
    //y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
    public static void main(String[] args) {
        IO.println("Vas a escribir 20 numeros");
        double[] nums = new double[20];
        double suma = 0;
        double media;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {

            IO.println("Escribe el valor " + i + " : ");
            nums[i] = scan.nextDouble();

        }
        for (int i = 0; i < nums.length; i++) {

            suma = suma + nums[i];

        }
        media = suma / nums.length;
        IO.println("La suma es: " + suma);
        IO.println("La media es: " + media);
    }
}