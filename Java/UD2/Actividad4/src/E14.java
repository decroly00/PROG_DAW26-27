import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
    int J = 0;

    for (int i = 0; i <= 10; i++){
            J = J + i;
        }
    IO.println(J);
    int[] N = new int[J];
    int i = 0;
        for (int j = 0; j < 10 ;j++ ){
            //repetir k veces j numero hasta j numero
            for (int k = 0; k<=j;k++){
                N[i] = j+1;
                i++;
            }
        }
        for (int num : N){
            IO.println(num);
        }
    }
}