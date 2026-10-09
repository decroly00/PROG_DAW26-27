public class E11 {
    public static void main(String[] args) {
        //Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        //el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        //del primer array al segundo array en orden inverso, y mostrar ambos por pantalla
        int[] N = new int[100];
        int[] M = new int[100];
        IO.println("Array 1");
        for (int i = 0; i < N.length; i++) {
            N[i] = i+1;
            IO.println(N[i]);
        }
        IO.println("Array 2");

        for (int i = 0; i < N.length; i++) {
            M[i] = N[(N.length - i - 1)];
        }
        for (int num : M){
            IO.println(num);
        }


    }
}