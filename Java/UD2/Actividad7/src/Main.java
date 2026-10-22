import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opcion;
        String opcionaleatoria;
        double n;
        IO.println("Bienvenido");
        do {
            n = Math.random();
            if (n<1.0/3) {
                opcionaleatoria = "P";
            } else if (n>2.0/3) {
                opcionaleatoria = "T";
            } else {
                opcionaleatoria = "L";
            }
            IO.println("\nPiedra (P), Papel (L), Tijeras (T)\nEscribe P, L o T\nPara salir: S");
            opcion = scan.nextLine().toUpperCase();
            if (opcion.equalsIgnoreCase("piedra")){
                opcion = "P";
            }
            if (opcion.equalsIgnoreCase("papel")) {
                opcion = "L";
            }
            if (opcion.equalsIgnoreCase("tijeras")) {
                opcion = "T";
            }
            IO.println("El ordenador ha elegido: " + opcionaleatoria);
            if (opcion.equals(opcionaleatoria)) {
                IO.println("Empate");
            } else {
                switch (opcion) {
                    case "P" -> {
                        if (opcionaleatoria.equals("T")) {
                            IO.println("Gana Jugador");
                        } else {
                            IO.println("Gana el ordenador");
                        }
                    }
                    case "L" -> {
                        if (opcionaleatoria.equals("P")) {
                            IO.println("Gana Jugador");
                        } else {
                            IO.println("Gana el ordenador");
                        }
                    }
                    case "T" -> {
                        if (opcionaleatoria.equals("L")) {
                            IO.println("Gana Jugador");
                        } else {
                            IO.println("Gana el ordenador");
                        }
                    }
                    case "S" -> {
                        IO.println("cerrar");
                    }
                    default -> IO.println("Introduce opcion valida");
                }
            }
        }while (!opcion.equals("S"));
    }
}