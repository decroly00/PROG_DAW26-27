import model.tipo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    int id;
    private LocalDateTime fecha;
    tipo tipo; //restriccion ingreso/retirada
    double cantidad;// distinto de 0
    private static int contador = 0;

    public Movimiento(tipo tipo, double cantidad){
        this.id = contador;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
        contador++;
    }


}
