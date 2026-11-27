import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Pelicula {
    private static int contador = 0;
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate FechaRegistro;
    private LocalDate FechaBaja;
    private LocalDateTime FechaAlquiler;
    private boolean isAlquilada;

    public Pelicula(String titulo, Genero genero) {
        this.cod = "P-" + contador;
        this.titulo = titulo;
        this.genero = genero;
        this.FechaRegistro = LocalDate.now();
        this.FechaBaja = LocalDate.MIN;
        this.FechaAlquiler = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.ofHours(0));
        this.isAlquilada = false;
        contador++;

    }

    public static int getContador() {
        return contador;
    }

    public String getCod() {
        return this.cod;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public LocalDate getFechaRegistro() {
        return this.FechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return this.FechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        FechaAlquiler = fechaAlquiler;
    }

    public void setAlquilada(boolean alquilada) {
        isAlquilada = alquilada;
    }
    public void alquilarPelicula(boolean isAlquilada) {
        this.isAlquilada = true;
        this.FechaAlquiler = LocalDateTime.now();

    }
    public void devolverPelicula(boolean isAlquilada) {
        this.isAlquilada = false;
        this.FechaAlquiler = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.ofHours(0));
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    @Override
    public String toString(){
        String respuesta = "Identificador: " + this.cod +
                "\nTitulo: " + this.titulo +
                "\nGenero: " + this.genero +
                "\nFecha de registro: " + this.FechaRegistro;
        if (isAlquilada){
            respuesta += "\nFecha Alquiler: " + this.FechaAlquiler;
        }
        return respuesta;
    }
}

