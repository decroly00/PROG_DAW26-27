import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //1.  Crea un programa que pida diez números reales por teclado, los almacene en un array,
        //y luego muestre todos sus valores.
        double[] nums = new double[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {

            IO.println("Escribe un numero: ");
            nums[i] = scan.nextDouble();

        }
        for (int i = 0; i < nums.length; i++) {
            IO.println("Valor " + i + " es " + nums[i]);
        }
        //2. Crea un programa que pida diez números reales por teclado, los almacene en un array,
        //y luego muestre la suma de todos los valores.
        double suma = 0;
        for (int i = 0; i < nums.length; i++) {

            IO.println("Escribe un numero: ");
            nums[i] = scan.nextDouble();

        }
        for (int i = 0; i < nums.length; i++) {
            suma = suma + nums[i];
        }
        IO.println("La suma es: " + suma);
        //3. Crea un programa que pida diez números reales por teclado, los almacene en un array,
        //y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        for (int i = 0; i < nums.length; i++) {

            IO.println("Escribe un numero: ");
            nums[i] = scan.nextDouble();

        }
        double max = -Double.MAX_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, nums[i]);

        }

        for (int i = 0; i < nums.length; i++) {

            min = Math.min(min, nums[i]);

        }
        IO.println("El numero maximo es: " + max);
        IO.println("El numero minimo es: " + min);

    }
}
