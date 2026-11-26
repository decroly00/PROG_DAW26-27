import java.time.LocalDate;

public class Libro extends Producto {

    private String ISBN;
    private String autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int nPaginas;

    public Libro(String codigo, String nombre, String descripcion, double precio,
                String ISBN, String Autor, String editorial, LocalDate fechaPublicacion, int nPaginas) {
        super(codigo, nombre, descripcion, precio);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = nPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    @Override
    public double obtenerDescuento() {
        return 20;
    }

    @Override
    public String calificacion() {
        return "";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN + "\n" +
                " autor=" + autor + "\n" +
                " editorial=" + editorial + "\n" +
                " fechaPublicacion=" + fechaPublicacion + "\n" +
                " nPaginas=" + nPaginas + "\n" +
                super.toString() +
                '}';

    }
}
