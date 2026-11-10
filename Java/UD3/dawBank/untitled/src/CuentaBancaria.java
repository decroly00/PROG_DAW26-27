import model.tipo;

public class CuentaBancaria {
    private static int contador = 0;
    private int id;
    private String IBAN;
    private String Titular;
    private double saldo;
    private Movimiento[] movimientos = new Movimiento[100];
    private int nMovimientos;

    public double getSaldo() {
        return this.saldo;
    }

    public String info() {
        String info;
        return info = this.id + " " + this.IBAN + " " + this.Titular + " " + this.saldo;
    }
    public CuentaBancaria(String IBAN, String Titular) {
        this.id = contador;
        this.IBAN = IBAN;
        this.Titular = Titular;
        this.saldo = 0;

        contador++;
    }
    public String getIBAN(){
        return this.IBAN;
    }
    public String getTitular(){
        return this.Titular;
    }


    public void movimiento(double movimiento) {
        if (movimiento > 0) {
            this.saldo -= movimiento;
            movimientos[nMovimientos] = new Movimiento(tipo.retirada, movimiento);
        } else {
            this.saldo += movimiento;
            movimientos[nMovimientos] = new Movimiento(tipo.ingreso, movimiento);
        }

    }
}
