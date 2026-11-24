public abstract class Producto {

    // 1. UNA CLASE ABSTRACTA NO PUEDE INSTANCIARSE (no se usa constructor)
    // 2. PODEMOS DEFINIR METODOS ABSTRACTOS Y METODOS NORMALES

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Metodos abstractos que voy a obligar a implementar a los hijos
    public abstract double obtenerDescuento();

    public abstract String calificacion();

    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Sobreescritura del toStrincg()
    @Override
    public String toString() {
        String respuesta = "";
        respuesta += "Codigo: " + this.codigo + "\n";
        respuesta += "Nombre: " + this.nombre + "\n";
        respuesta += "Descripcion: " + this.descripcion + "\n";
        respuesta += "Precio: " + this.precio + "\n";
        return respuesta;
    }
}
