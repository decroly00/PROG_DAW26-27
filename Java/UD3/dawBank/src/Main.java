void main() {
    //crear cuenta
    IO.println("Introduce numero de cuenta, tiene que tener 2 letras seguidas por 22 numeros");
    Scanner scan = new Scanner(System.in);
    String IBAN = scan.nextLine().toUpperCase();
    while (!IBAN.matches("[A-Z]{2}[0-9]{22}")){
        IO.println("Numero de cuenta incorrecto");
        scan = new Scanner(System.in);
        IBAN = scan.nextLine().toUpperCase();
    }
    IO.println("Introduce el titular de la cuenta");
    String titular = scan.nextLine();


    CuentaBancaria cuenta1 = new CuentaBancaria(IBAN, titular);


    Double t;
    String opcion;

    boolean aux = true;
    do {
        scan = new Scanner(System.in);
        IO.println("=====MENU=====");
        IO.println(
                "1. Datos de la cuenta\n" +
                "2. IBAN\n" +
                "3. Titular\n" +
                "4. Saldo\n" +
                "5. Ingreso\n" +
                "6. Retirada\n" +
                "7. Movimientos\n" +
                "8. Salir\n");
        opcion = scan.nextLine();
    switch (opcion) {

        case "1" -> { //mostrar datos de la cuenta
            IO.println("Datos de la cuenta:");
            IO.println(cuenta1.info());
        }
        case "2" -> {
            IO.println("IBAN: " + cuenta1.getIBAN());

        }
        case "3" -> {
            IO.println("Titular: " + cuenta1.getTitular());

        }
        case "4" -> {
            IO.println("Saldo disponible: " + cuenta1.getSaldo() + "€");

        }
        case "5" -> {
            IO.println("Introduzca la cantidad de dinero que desea ingresar:");// posibilidad marcar 0
            scan = new Scanner(System.in);
            t = scan.nextDouble();

            //abajo añadir sistema antirretrasados 0 a 9 y 0 a 9 + €
            while (t == 0){
                IO.println("La cantidad no puede ser 0, introduce una cantidad válida");
                t = scan.nextDouble();
            }
            IO.println("Ha introducido " + t + "€");
            cuenta1.movimiento(t);
            IO.println("Su saldo actual es de " + cuenta1.getSaldo() + "€");
        }
        case "6" -> {
            IO.println("Introduzca la cantidad de dinero que desea retirar:");// posibilidad marcar 0
            scan = new Scanner(System.in);
            t = scan.nextDouble();
            while (t == 0){
                IO.println("La cantidad no puede ser 0, introduce una cantidad válida");
                t = scan.nextDouble();
            }
            IO.println("Ha introducido " + t + "€");
            if ((cuenta1.getSaldo()-t)>=-50.0){
                if (t>3000){
                    IO.println("AVISO: Notificar a hacienda");
                }
                cuenta1.movimiento(-t);
                if (cuenta1.getSaldo()<0){
                    IO.println("AVISO: Saldo negativo");
                }
            } else {
                IO.println("No tienes dinero suficiente");
            }

        }
        case "7" -> {
            IO.println("asd");
                IO.println(cuenta1.getListadoMovimientos());

        }
        case "8" -> {
            IO.println("El programa se cerrara");
            aux = false;

        }
        default -> {
            IO.println("Introduce una opción valida");
        }
    }
    } while (aux);
}
public class solonumeros{

}

