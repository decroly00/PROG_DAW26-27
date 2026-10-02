import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        // 14. scribe un programa que calcula el salario neto semanal de un trabajador en función del
        //número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        Scanner scan = new Scanner(System.in);
        int horastrabajo;
        double euroshora;
        double bruto;
        double neto;
        String nombre;
        System.out.println("Introducir nombre: ");
        nombre = scan.nextLine();
        System.out.println("Introducir horas trabajadas:");
        horastrabajo = scan.nextInt();
        System.out.println("Introducir salario por hora:");
        euroshora = scan.nextInt();
        if (horastrabajo<=35) {
            bruto = horastrabajo * euroshora;
        }
        else {
            bruto = 35*euroshora + (horastrabajo-35) * euroshora * 1.5;
        }
        System.out.println("Salario bruto: " + bruto);
        if (bruto<=500) {
            neto = bruto;
            System.out.println(neto);
        }
        else {
            if (bruto<=900)
                neto = (bruto-500)*0.75 + 500;
            else {
                neto = (bruto-900)*0.55 + 800;}
        }
        System.out.println(nombre +  " ha cobrado como salario neto: " + neto);
    }
}
