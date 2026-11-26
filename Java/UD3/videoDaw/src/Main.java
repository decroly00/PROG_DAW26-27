
void main() {
    Scanner scan = new Scanner(System.in);
    VideoDaw videoclub = null;
    String st1;
    String st2;
    String st3;
    String st4;
    int int1;
    int int2;

    boolean aux = true;
    do {


        String opcion;
        scan = new Scanner(System.in);
        imprimirMenu();
        opcion = scan.nextLine();
        switch (opcion) {

            case "1" -> { // registrar videoclub
                if (videoclub == null) {
                    st1 = MiUtils.leerTextoPant("Introduzca CIF");
                    st2 = MiUtils.leerTextoPant("Introduzca Dirección");

                    videoclub = new VideoDaw(st1, st2);

                } else {
                    IO.println("Ya está registrado el videoclub.");
                }
            }
            case "2" -> {// registrar pelicula
                // pendiente listar generos
                st1 = MiUtils.leerTextoPant("Introduce nombre");
                videoclub.altaPelicula(st1 ,Genero.genero1);

            }
            case "3" -> { // registrar cliente
                //añadir fecha nacimiento
                st1 = MiUtils.leerTextoPant("Introduzca DNI");
                st2 = MiUtils.leerTextoPant("Introduzca Nombre");
                st3 = MiUtils.leerTextoPant("Introduzca Dirección");

                videoclub.altaCliente(st1 ,st2 ,st3 ,LocalDate.now());

            }
            case "4" -> { // alquilar pelicula
                IO.println(videoclub.getPeliculasRegistradas());
                int1 = MiUtils.leerIntPant("Introduce el ID de la pelicula.");
                IO.println(videoclub.getPeliculasRegistradas());
                int2 = MiUtils.leerIntPant("Introduce el ID del cliente.");
                videoclub.alquilarPelicula(int1, int2);
            }
            case "5" -> { //devolver pelicula y revisar que no pasen 48h
                IO.println(videoclub.getPeliculasRegistradas());
                int1 = MiUtils.leerIntPant("Introduce el ID de la pelicula.");
                IO.println(videoclub.getPeliculasRegistradas());
                int2 = MiUtils.leerIntPant("Introduce el ID del cliente.");

            }
            case "6" -> { // baja cliente
                if (videoclub.getNClientes() != 0) {
                    IO.println(videoclub.getPeliculasRegistradas());
                    int2 = MiUtils.leerIntPant("Introduce el ID del cliente.");
                    videoclub.bajaCliente(int2);
                } else {
                    IO.println("No hay clientes registrados.");
                }
            }
            case "7" -> { // baja pelicula
                if (videoclub.getNPeliculas() != 0) {IO.println(videoclub.getPeliculasRegistradas());
                    int1 = MiUtils.leerIntPant("Introduce el ID de la pelicula.");
                    videoclub.bajaPelicula(int1);
                }
            }
            case "8" -> { // listar clientes
                IO.println("Hay " + videoclub.getNClientes() + " clientes.");
                IO.println(videoclub.getClientesRegistrados());
            }
            case "9" -> { // listar peliculas
                IO.println("Hay " + videoclub.getNPeliculas() + " peliculas.");
                IO.println(videoclub.getPeliculasRegistradas());
            }
            case "10" -> {
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
                    "8. Listar clientes\n" +
                    "9. Listar peliculas\n" +
                    "10. Salir\n");
}
