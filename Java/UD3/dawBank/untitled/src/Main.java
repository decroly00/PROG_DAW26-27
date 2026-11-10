//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaBancaria cuenta1 = new CuentaBancaria("ES123414", "Mateo");
    IO.println(cuenta1.getSaldo());
    cuenta1.ingreso(500);
    IO.println(cuenta1.getSaldo());
    IO.println();

}

