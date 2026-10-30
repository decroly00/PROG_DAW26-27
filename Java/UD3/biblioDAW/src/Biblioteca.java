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
    private int nLibrosActuales;
    private final int dimensionInicial = 100;

    // Constructor
    public Biblioteca(String codigo, String nombre, String direccion, String email, String nTelefono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.nTelefono = nTelefono;

        this.libros = new Libro[this.dimensionInicial];
        this.nLibrosActuales = 0;
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

    public int getnLibrosActuales() {
        return this.nLibrosActuales;
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
            if (this.nLibrosActuales < this.libros.length){
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            } else {
                //array lleno
                //ampliar dimension array
                this.ampliarDimensionBiblioteca();
                this.libros[this.nLibrosActuales] = libro;
                this.nLibrosActuales++;
                resultado = true;
            }
        }
        return resultado;

    }
    //eliminar libros en biblioteca
    public boolean eliminarLibro (Libro libro){
        boolean resultado = false;
        if (libro != null){
            int index = -7;
            for (int i = 0; i < this.nLibrosActuales; i++){
                if (this.libros[i] != null){
                    if (this.libros[i].equals(libro.getIsbn())){
                        index = i;
                        break;
                    }
                }
            }
            if (index != -7){
                this.libros[index] = null;
                resultado = true;

                //recolocar
//                for (int i = index; i < this.nLibrosActuales; i++){
//                    this.libros[i] = this.libros[i+1];
//                }
//                this.libros[this.nLibrosActuales-1] = null;
//                this.nLibrosActuales--;
                this.libros[index] = this.libros[this.nLibrosActuales-1];
                this.libros[this.nLibrosActuales-1] = null;
                this.nLibrosActuales--;
            }
        }


        return resultado;
    }
    //buscar por ISBN
    public Libro getLibroByISBN(String isbn){
        Libro libro = null;
        if (isbn != null && !isbn.isEmpty()){
            for (int i = 0; i < this.nLibrosActuales; i++){
                if (this.libros[i].getIsbn().equals(isbn)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }
    //buscar por titulo
    public Libro getLibroByTitulo(String titulo){
        Libro libro = null;
        if (titulo != null && !titulo.isEmpty()){
            for (int i = 0; i < this.nLibrosActuales; i++){
                if (this.libros[i].getTitulo().equalsIgnoreCase(titulo)){
                    libro = this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }


    //mostrar informacion biblioteca
    public String infoBiblioteca(){
        String infoBiblioteca = "codigo: " + this.codigo + "\n";
        infoBiblioteca += "Nombre: " + this.nombre + "\n";
        infoBiblioteca += "Direccion: " + this.direccion + "\n";
        infoBiblioteca += "Email: " + this.email + "\n";
        infoBiblioteca += "nTelefono: " + this.nTelefono + "\n";
        infoBiblioteca += "Libros actuales" + this.nLibrosActuales + "\n";


        return infoBiblioteca;
    }
    //mostrar info todos libros almacenados
    public String infoLibros(){
        String infoLibros = "";
        for (int i = 0; i < this.nLibrosActuales; i++){
            infoLibros += this.libros[i].infoLibro() + "\n";
        }

        return infoLibros;
    }

    //ampliar dimension array
    private void ampliarDimensionBiblioteca(){
        Libro [] librosAux = new Libro[this.libros.length + this.dimensionInicial];
        for (int i =0; i < this.libros.length; i++){
            librosAux[i] = this.libros[i];
        }
        this.libros = librosAux;
    }


}
