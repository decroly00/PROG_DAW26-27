//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scan = new Scanner(System.in);
    IO.println("Bienvenido, introduzca una cantidad de números enteros a almacenar:");
    int N = scan.nextInt();
    String opcion;
    String opcion2;
    boolean aux = false;
    int coleccion[] = new int[N];
    int n, suma, max, min;
    do {
        IO.println("Menu: ");
        IO.println("a. Modificar colección");
        IO.println("b. Estadísticas de la colección");
        IO.println("c. Ampliar valor de la colección");
        IO.println("d. Mostrar la colección");
        IO.println("e. Salir");
        scan = new Scanner(System.in);
        opcion = scan.nextLine();
        switch (opcion) {
            case "a" ->{
                IO.println("Modificar coleccion");
                    do {
                    IO.println("Menu: ");
                    IO.println("a. insertar numero");//t
                    IO.println("b. borrar numero");
                    IO.println("c. modificar numero");
                    scan = new Scanner(System.in);
                    opcion2 = scan.nextLine();
                    switch (opcion2) {
                        case "a" ->{
                            scan = new Scanner(System.in);
                            for (int i = 0; i < coleccion.length; i++){
                                if (coleccion[i] == 0){
                                    while (coleccion[i] == 0) {
                                        IO.println("Introduzca un número no nulo");
                                        coleccion[i] = scan.nextInt();
                                    }
                                    IO.println("Su numero ha sido guardado en la posición " + i);
                                    break;
                                }
                            }
                            aux = true;
                        }
                        case "b" ->{
                            scan = new Scanner(System.in);
                            IO.println("¿En que posición esta el número que desea borrar?");
                            IO.println("Las posiciones válidas son de 0 a " + (coleccion.length-1));
                            while (!aux) {
                                n = scan.nextInt();
                                if (n >= 0 && n < coleccion.length) {
                                    coleccion[n] = 0;
                                    aux = true;
                                } else {
                                    IO.println("La posición introducida no existe.");
                                }
                            }
                        }
                        case "c" ->{
                            scan = new Scanner(System.in);
                            IO.println("¿En que posición esta el número que desea modificar?");
                            while (!aux) {
                                n = scan.nextInt();
                                if (n >= 0 && n < coleccion.length) {
                                    IO.println("Introduce el nuevo valor:");
                                    coleccion[n] = scan.nextInt();
                                    aux = true;
                                } else {
                                    IO.println("La posición introducida no existe.");
                                }
                            }
                        }
                        default -> IO.println("Introduce una opción válida");
                    }
                }while (!aux);
                aux = false;
            }
            case "b" ->{
                IO.println("Estadísticas de la coleccion");
                do {
                IO.println("Menu: ");
                IO.println("a. Media de valores no nulos");
                IO.println("b. Suma de todos los valores");
                IO.println("c. Valor máximo de la colección");
                IO.println("d. Valor mínimo de la colección");
                scan = new Scanner(System.in);
                opcion2 = scan.nextLine();
                    suma = 0;
                    max = -Integer.MAX_VALUE;
                    min = Integer.MAX_VALUE;
                    for (int i : coleccion) {
                        suma += i;
                    }
                    switch (opcion2) {
                        case "a" ->{
                            IO.println("La media de todos los valores no nulos es: ");
                            n = 0;
                            for (int i : coleccion) {
                                if (i != 0){
                                    n++;
                                }
                            }
                            IO.println((suma*1.0)/n);
                            aux = true;
                        }
                        case "b" ->{
                            IO.println("La suma de todos los valores es: " + suma);
                            aux = true;
                        }
                        case "c" ->{
                            IO.print("El valor máximo de la colección es: ");
                            for (int i : coleccion) {
                                if (max<i && i!=0){
                                    max = i;
                                }
                            }
                            IO.println(max);
                            aux = true;
                        }
                        case "d" ->{
                            IO.print("El valor mínimo de la colección es: ");
                            for (int i : coleccion) {
                                if (min>i && i!=0){
                                    min = i;
                                }
                            }
                            IO.println(min);
                            aux = true;
                        }
                        default -> IO.println("Introduce opción válida");
                    }
                }while (!aux);
                aux = false;
            }
            case "c" ->{
                IO.println("El valor actual de la colección es " + coleccion.length);
                scan = new Scanner(System.in);
                while (coleccion.length>=N){
                    IO.println("Introduce un valor mayor");
                    N = scan.nextInt();
                }
                int coleccionaux[] = new int[N];
                for (int i = 0; i < coleccion.length; i++) {
                    coleccionaux[i] = coleccion[i];
                }
                coleccion = coleccionaux;

            }
            case "d" ->{
                IO.println("La colección tiene " + coleccion.length + " valores, del 0 al " + (coleccion.length-1));
                IO.println("A continuacion se mostrará la colección omitiendo los valores nulos: ");
                for (int i = 0; i < coleccion.length; i++){
                    if (coleccion[i] !=0) {
                        IO.println("Pos" + i + ": " + coleccion[i]);
                    }
                }
            }
            case "e" ->{
                IO.println("Salir");

            }
            default -> IO.println("Introduce opción válida");
        }
    }while (!opcion.equals("e"));
}