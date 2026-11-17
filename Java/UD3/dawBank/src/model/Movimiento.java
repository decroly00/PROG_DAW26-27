package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private final DateTimeFormatter fecha1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final DateTimeFormatter hora1 = DateTimeFormatter.ofPattern("H:m:s");
    private int id;
    private LocalDateTime fecha;
    private tipo tipo; //restriccion ingreso/retirada
    private double cantidad;// distinto de 0
    private static int contador = 0;

    public Movimiento(tipo tipo, double cantidad){
        this.id = contador;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
        contador++;
    }

    public String infoMovimiento() {
        String movimiento = "Operación " + this.id + " con fecha " +
                this.fecha.format(fecha1) + " a las " + this.fecha.format(hora1) +
                ": " + this.tipo + " de " + this.cantidad;
        return movimiento;
    }
}
