public class Videojuego extends Producto {

    private String PEG;
    private String plataforma;
    private String desarrolladora;

    public Videojuego(String codigo, String nombre, String descripcion, double precio,
                        String PEG, String plataforma,  String desarrolladora) {
        super(codigo, nombre, descripcion, precio);
        this.PEG = PEG;
        this.plataforma = plataforma;
        this.desarrolladora = desarrolladora;
    }

    public String getPEG() {
        return PEG;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "PEG= " + PEG + "\n" +
                "plataforma= " + plataforma + "\n" +
                "desarrolladora= " + desarrolladora + "\n" +
                super.toString() +
                '}';
    }

    @Override
    public double obtenerDescuento() {
        return 0;
    }

    @Override
    public String calificacion() {
        return "";
    }
}
