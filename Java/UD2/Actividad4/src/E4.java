import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //Crea un programa que pida veinte números enteros por teclado, los almacene en un
        //array y luego muestre por separado la suma de todos los valores positivos y negativos.
        IO.println("Vas a escribir 20 numeros");
        double[] nums = new double[20];
        double sumapositivos = 0;
        double sumanegativos = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {

            IO.println("Escribe el valor " + i + " : ");
            nums[i] = scan.nextDouble();

        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]>0) {
                sumapositivos = sumapositivos + nums[i];
            } else {
                sumanegativos = sumanegativos + nums[i];
            }

        }
        IO.println("Suma numeros positivos: " + sumapositivos );
        IO.println("Suma numeros negativos: " + sumanegativos );
    }
}