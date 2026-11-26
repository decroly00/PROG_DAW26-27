public class Pelicula extends Producto {

    private String genero;
    private int duracion;
    private String ISAN;
    private String director;
    private String calificacionEdad;

    public Pelicula(String codigo, String nombre, String descripcion, double precio) {
        super(codigo, nombre, descripcion, precio);
        this.ISAN = ISAN;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.calificacionEdad = calificacionEdad;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getISAN() {
        return ISAN;
    }

    public String getDirector() {
        return director;
    }

    public String getCalificacionEdad() {
        return calificacionEdad;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String calificacion() {
        return "";
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + "\n" +
                ", duracion=" + duracion + "\n" +
                ", ISAN='" + ISAN + "\n" +
                ", director='" + director + "\n" +
                ", calificacionEdad='" + calificacionEdad + "\n" +
                super.toString() +
                '}';
    }


}
