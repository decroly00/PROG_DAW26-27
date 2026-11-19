void main() {
    Scanner scan = new Scanner(System.in);

    boolean aux = true;
    do {

        String opcion;
        scan = new Scanner(System.in);
        imprimirMenu();
        opcion = scan.nextLine();
        switch (opcion) {

            case "1" -> {

            }
            case "2" -> {

            }
            case "3" -> {

            }
            case "4" -> {

            }
            case "5" -> {

            }
            case "6" -> {

            }
            case "7" -> {

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

private static void imprimirMenu() {
    IO.println("=====MENU=====");
    IO.println(
                    "1. Crear y Registrar VideoClub en la franquicia\n" +
                    "2. Registrar pelicula en el videoclub\n" +
                    "3. Crear y registrar cliente en videoclub\n" +
                    "4. Alquilar pelicula\n" +
                    "5. Devolver pellicula\n" +
                    "6. Dar de baja cliente\n" +
                    "7. Dar de baja pelicula\n" +
                    "8. Salir\n");
}
