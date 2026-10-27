import model.Libro;

public class Biblioteca {

    //Atributos de la clase

    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String nTelefono;

    //Colaccion de libros

    private Libro[] libros;
    private int nLibrosaActuales;
    private final int dimensionInicial = 100;

    // Constructor
    public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.nTelefono = nTelefono;

        this.libros = new Libro[this.dimensionInicial];
        this.nLibrosaActuales = 0;
    }

    // getters, setters
    //getter
    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getEmail(){
        return this.email;
    }
    public String getnTelefono(){
        return this.nTelefono;
    }

    public int getnLibrosaActuales() {
        return this.nLibrosaActuales;
    }

    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setnTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }


    //insertar libros en biblioteca
    //boolean: true si se ha insertado correctamente
    public boolean insertarLibro(Libro libro){
        boolean resultado = false;
        //comprobacion ante NullPointerException
        if (libro != null){
            if (this.nLibrosaActuales < this.libros.length){
                this.libros[this.nLibrosaActuales] = libro;
                this.nLibrosaActuales++;
                resultado = true;
            } else {
                //array lleno
                //ampliar dimension array
                this.ampliarDimensionBiblioteca();
                this.libros[this.nLibrosaActuales] = libro;
                this.nLibrosaActuales++;
                resultado = true;
            }
        }
        return resultado;

    }
    //eliminar libros en biblioteca

    //buscar por ISBN

    //mostrar informacion biblioteca
    public String infoBiblioteca(){
        String infoBiblioteca = "codigo: " + this.codigo + "\n";
        infoBiblioteca += "Nombre: " + this.nombre + "\n";
        infoBiblioteca += "Direccion: " + this.direccion + "\n";
        infoBiblioteca += "Email: " + this.email + "\n";
        infoBiblioteca += "nTelefono: " + this.nTelefono + "\n";
        infoBiblioteca += "Libros actuales" + this.nLibrosaActuales + "\n";


        return infoBiblioteca;
    }
    //mostrar info todos libros almacenados


    //ampliar dimension array
    private void ampliarDimensionBiblioteca(){
        Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for (int i =0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        this.libros = librosAux;
    }
}
