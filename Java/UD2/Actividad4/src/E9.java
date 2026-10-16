import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        //Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        //enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        //y mostrará en qué posiciones del array aparece N.
        int[] nums = new int[100];
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce un numero entre 1 y 10: ");
        int N = scan.nextInt();
        int J = 0;
        for (int O : nums) {
            O = (int) (1 + Math.random() * 10);

            if (O == N) {
                J++;
                // faltan las posiciones de N
             }

        }
        IO.println("El numero se ha repetido " + J + " veces");
    }
}