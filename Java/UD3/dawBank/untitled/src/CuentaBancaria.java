public class CuentaBancaria {
    private static int contador = 0;
    private int id;
    private String IBAN;
    private String Titular;
    private int saldo;
    private Movimiento[] movimientos = new Movimiento[100];
    private int nMovimientos;

    public int getSaldo() {
        return this.saldo;
    }


    public CuentaBancaria(String IBAN, String Titular) {
        this.id = contador;
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.saldo = 0;

        contador++;
    }

    public void ingreso(int ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            movimientos[nMovimientos] = new Movimiento("placeholder fecha", "Ingreso", ingreso);
        }
    }

    public void retirada(int retirada) {
        if (retirada > 0) {
            this.saldo -= retirada;


        }

    }
}
