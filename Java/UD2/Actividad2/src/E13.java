public class E13 {
    public static void main(String[] args) {
        // 13. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
        //números naturales.
        int suma = 0;
        int producto = 1;
        for (int i=1; i<10; i++) {
            suma = suma + i;
            producto = producto * i;
            System.out.println(suma);
        }
        IO.println("Suma: " + suma + " Producto: " + producto);
    }
}
