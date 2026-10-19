import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        //palabra de la cadena en una línea distinta.
        IO.println("escribe una frase");
        String A = scan.nextLine();
        String[] aA = A.split(" ");
        for (String a : aA) {
            IO.println(a);
        }
        // 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        //iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
        IO.println("escribe una palabra");
        String B = scan.nextLine();
        IO.println("otra");
        String C = scan.nextLine();
        if (B.equals(C)) {
            IO.println("Son iguales");
        } else if (B.equalsIgnoreCase(C)) {
            IO.println("Son iguales sin importar mayusculas");
        } else {
            IO.println("no son iguales sin importar mayusculas");
        }
        // 3. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        //Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        //las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        //“Tarazón” y “Alcocer” mostrará “LIOTARALC”.
        IO.println("escribe un nombre y dos apellidos separados por espacios");
        String D = scan.nextLine();
        String[] aD = D.split(" ");

        for (int i = 0; i<3; i++){
            IO.print(aD[i].substring(0,3).toUpperCase());
        }
        IO.println();


        // 4. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        //‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        //mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        //Nº de A's: 3
        //Nº de E's: 1
        //Nº de I's: 2
        //Nº de O's: 0
        //Nº de U's: 0
        IO.println("introduce una frase");
        String G = scan.nextLine().toLowerCase();
        char[] j = G.toCharArray();
        int nA = 0;
        int nE = 0;
        int nI = 0;
        int nO = 0;
        int nU = 0;
        for (int i = 0; i<j.length; i++) {
            if (j[i] == 'a'){
                nA++;
            } else if (j[i] == 'e') {
                nE++;
            } else if (j[i] == 'i') {
                nI++;
            } else if (j[i] == 'o') {
                nO++;
            } else if (j[i] == 'u') {
                nU++;
            }

        }
        IO.println("Nº de A: " + nA);
        IO.println("Nº de E: " + nE);
        IO.println("Nº de I: " + nI);
        IO.println("Nº de O: " + nO);
        IO.println("Nº de U: " + nU);
        // 5. Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        //o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        //Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        //acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        //derecha a izquierda.
        //Por ejemplo:
        //Amigo no gima
        //Dabale arroz a la zorra el abad
        //Amo la pacífica paloma
        //A man a plan a canal Panama


    }
}
