void main() {
    //crear cuenta
    IO.println("Introduce numero de cuenta, tiene que tener 2 letras seguidas por 22 numeros. \n" +
            "Ej: ES1234567890123456789012");
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


    double cantidadMovimiento = 0;
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
            IO.println(cuenta1.infoCuenta());
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
            IO.println("Introduzca la cantidad de dinero que desea ingresar:");
            cantidadMovimiento = comprobacionNumero(cantidadMovimiento);
            cuenta1.movimiento(cantidadMovimiento);
            imprimirSaldoCuenta(cuenta1);
        }
        case "6" -> {
            IO.println("Introduzca la cantidad de dinero que desea retirar:");
            cantidadMovimiento = comprobacionNumero(cantidadMovimiento);
            if ((cuenta1.getSaldo() - cantidadMovimiento)>=-50.0){
                cuenta1.movimiento(-cantidadMovimiento);
                if (cuenta1.getSaldo()<0){
                    IO.println("AVISO: Saldo negativo");
                }
            } else {
                IO.println("No tienes dinero suficiente");
            }
            imprimirSaldoCuenta(cuenta1);
        }
        case "7" -> {
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

public static void imprimirSaldoCuenta(CuentaBancaria cuenta1) {
    IO.println("Su saldo actual es de " + cuenta1.getSaldo() + "€");
}

public static double comprobacionNumero(double t){
    Scanner scan = new Scanner(System.in);

    scan = new Scanner(System.in);
    double numero = 0;
    while (7 == 7) {
        if (scan.hasNextDouble()) {
            numero = Math.abs(scan.nextDouble());
        }
        if (numero != 0) {
            if (numero>3000){
                IO.println("AVISO: Notificar a hacienda");
            }
            IO.println("Ha introducido " + numero + "€");
            return numero;
        } else {
            IO.println("Introduce solo numeros diferentes de 0");
        }
    }
}

