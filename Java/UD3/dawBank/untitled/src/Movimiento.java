public class Movimiento {
    int id;
    String Fecha; //restriccion formato
    String tipo; //restriccion ingreso/retirada
    int cantidad;// distinto de 0
    private static int contador = 0;

    public Movimiento(String Fecha, String tipo, int cantidad){
        this.id = contador;
        this.Fecha = Fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
        contador++;
    }
    public String mostrarinfoMovimiento(){
        return Fecha + tipo + cantidad;
    }

}
