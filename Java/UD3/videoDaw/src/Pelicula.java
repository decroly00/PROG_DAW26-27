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
    private boolean isBaja;
    private boolean isAlquilada;

    public Pelicula(String titulo, Genero genero) {
        this.cod = "P-" + contador;
        this.titulo = titulo;
        this.genero = genero;
        this.FechaRegistro = LocalDate.now();
        this.FechaBaja = LocalDate.MIN;
        this.FechaAlquiler = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.ofHours(0));
        this.isBaja = false;
        this.isAlquilada = false;
        contador++;

    }
    public String mostrarInfoPelicula(){
        String mostrarInfoPelicula = "Identificador: " + this.cod +
                "\nTitulo: " + this.titulo +
                "\nGenero: " + this.genero +
                "\nFecha de registro: " + this.FechaRegistro;
        if (isBaja){
            mostrarInfoPelicula += "\nFecha Baja: " + this.FechaBaja;
        }
        if (isAlquilada){
            mostrarInfoPelicula += "\nFecha Alquiler: " + this.FechaAlquiler;
        }
        return mostrarInfoPelicula;
    }

}

