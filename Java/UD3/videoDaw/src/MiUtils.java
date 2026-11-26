import java.util.Scanner;

public class MiUtils {
    public static double leerDoublePant (String mensaje){
        Scanner scan = new Scanner(System.in);
        IO.println(mensaje);
        return scan.nextDouble();
    }
    public static int leerIntPant (String mensaje){
        Scanner scan = new Scanner(System.in);
        IO.println(mensaje);
        return scan.nextInt();
    }

    public static String leerTextoPant(String mensaje){
        Scanner scan = new Scanner(System.in);
        IO.println(mensaje);
        return scan.nextLine();
    }

    public static boolean comprobarPatron (String patron, String mensaje){
        boolean isOK = false;
        isOK = mensaje.matches(patron);
        return isOK;
    }
    public static boolean comprobarPatronRepetidamente (String patron, String mensaje){
        boolean isOK = false;
        String texto = "";

        do {
            texto = MiUtils.leerTextoPant(mensaje);
            isOK = MiUtils.comprobarPatron(patron, mensaje);
            if (!isOK) {
                IO.println("El formato es incorrecto, vuelve a intentarlo");
            }
        } while (!isOK);
        isOK = mensaje.matches(patron);
        return isOK;
    }


}
