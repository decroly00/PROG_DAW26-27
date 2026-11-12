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
        return info ="IBAN: " + this.IBAN + "\nTitular: " + this.Titular + "\nSaldo disponible: " + this.saldo + "€";
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
        if (movimiento < 0) {
            this.saldo -= movimiento;
            movimientos[nMovimientos] = new Movimiento(tipo.Retirada, movimiento);
        } else {
            this.saldo += movimiento;
            movimientos[nMovimientos] = new Movimiento(tipo.Ingreso, movimiento);
        }
        nMovimientos++;
    }
    public String getListadoMovimientos(){
                    String listadoMovimientos = "";
                    if (nMovimientos != 0) {
                        for (int i = 0; i < nMovimientos; i++) {
                            listadoMovimientos += movimientos[i].infoMovimientos() + "\n";
                        }
                    } else {
                        listadoMovimientos = "No hay movimientos";
                    }
                    return listadoMovimientos;
    }
}
