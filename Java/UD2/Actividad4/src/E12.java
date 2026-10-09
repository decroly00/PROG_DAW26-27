import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        //Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
        //con distintas opciones:
        //a. Mostrar valores.
        //b. Introducir valor.
        //c. Salir.
        int[] N = new int[10];
        int V;
        Scanner scan = new Scanner(System.in);
        String opcion = "3";
        do {
            IO.println("Menu: ");
            IO.println("a. Mostrar valores");
            IO.println("b. Introducir valor");
            IO.println("c. Salir");
            opcion = scan.nextLine();
            switch (opcion) {
                case "a" ->{
                    for (int P : N){
                        IO.println(P);
                    }
                }
                case "b" ->{
                    IO.println("Ubicacion valor a introducir (0-9):");
                    V = scan.nextInt();
                    IO.println("introduce valor");
                    N[V] = scan.nextInt();

                }
                case "c" ->{
                    return;

                }
                default -> IO.println("introduce opcion valida");
            }
        }while (!opcion.equals("c"));

    }
}