import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        //y luego muestre la matriz por pantalla.
        int k = 1;
        double[][] matriz1 = new double[5][5];
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                matriz1[i][j] = k;
                k++;
                IO.print(matriz1[i][j] + " ");
            }
            IO.println();
        }
        pintarMatriz(matriz1);
        // 2. Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        //multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
        int[][] matriz2 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            IO.println("Tabla del " + (i+1));
            for (int j = 0; j < 10; j++) {
                matriz2[i][j] = (i+1) * (j+1);;
                IO.print(matriz2[i][j] + " ");
            }
            IO.println();
        }
        // 3. Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        //introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        //matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        //menores que cero y cuántos son igual a cero.
        Scanner scan = new Scanner(System.in);
        IO.println("introduce valor N");
        int N = scan.nextInt();
        IO.println("introduce valor M");
        int M = scan.nextInt();
        double[][] matriz3;
        if (N > 0 && M > 0) {
            matriz3 = new double[N][M];
        } else {
            IO.println("Los numeros deben ser enteros positivos.");
            return;
        }

        int contador0 = 0;
        int contadorpos = 0;
        int contadorneg = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz3[i][j] = scan.nextInt();
                if (matriz3[i][j] < 0) {
                    contadorneg++;
                } else if (matriz3[i][j] > 0) {
                    contadorpos++;
                } else {
                    contador0++;
                }
            }
        }
        IO.println("Negativos: " + contadorneg);
        IO.println("Positivos: " + contadorpos);
        IO.println("0: " + contador0);
        // 4. Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        //1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        //programa mostrará la nota mínima, máxima y media de cada alumno.
        scan = new Scanner(System.in);
        double[][] alumnado = new double[4][5];

        for (int i = 0; i < 4; i++) {
            IO.println("Alumno " + (i+1));
            double tmedia = 0;
            double max = -Double.MAX_VALUE;
            double min = Double.MAX_VALUE;
            for (int j = 0; j < 5; j++) {
                IO.println("Introduce nota de asignatura " + (j+1));
                alumnado[i][j] = scan.nextDouble();
                max = Math.max(max, alumnado[i][j]);
                min = Math.min(min, alumnado[i][j]);
                tmedia += alumnado[i][j];
                IO.println(tmedia);

            }
            IO.println("Nota maxima:" + max + "\n Nota minima: "  + min + "\n Nota media" + (tmedia/5));
        }
        pintarMatriz(alumnado);
        // 5. Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        //y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        //de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        //género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        //matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
        scan = new Scanner(System.in);
        int varon = 0;
        int mujer = 0;
        double mediavaron, mediamujer;
        IO.println("Introduce numero de personas: ");
        int P = scan.nextInt();
        double [][] salario = new double[2][P+1];
        for (int i = 0, j; i < P; i++ ) {
            IO.println("Hombre (0) o Mujer (1)");
            j = scan.nextInt();
            IO.println("Introduce salario: ");
            if (j == 0){
                salario[j][varon] = scan.nextDouble();
                varon++;
            } else {
                salario[j][mujer] = scan.nextDouble();
                mujer++;
            }
        }
        double j = 0;
        for (int i = 0; i < varon; i++) {
                j = j + salario[0][i];
        }
        mediavaron = j / varon;
        j = 0;
        for (int i = 0; i < mujer; i++) {
            j = j + salario[1][i];
        }
        mediamujer = j / mujer;
        IO.println("Media hombres: " + mediavaron);
        IO.println("Media mujeres: " + mediamujer);
    }
    public static void pintarMatriz(double[][] matriz) {
        for(int i = 0; i < matriz.length; i++){
            IO.println();
            for(int j = 0; j < matriz[i].length; j++){
                IO.print(matriz[i][j]);
            }
            IO.println();
        }
    }
}
