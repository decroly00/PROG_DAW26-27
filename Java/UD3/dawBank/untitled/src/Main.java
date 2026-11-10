//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //crear cuenta
    CuentaBancaria cuenta1 = new CuentaBancaria("ES6621000418401234567891", "mateo");


    Double t;
    String opcion;
    Scanner scan = new Scanner(System.in);
    boolean aux = true;
    do {
        scan = new Scanner(System.in);
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
//                if (t>3000){
//                    IO.println("AVISO: Notificar a hacienda");
//                }
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

        }
        case "8" -> {
            IO.println("asd");

        }
        default -> {
            IO.println("Introduce una opción valida");
        }
    }
    } while (aux);





}

