public class Persona {

    // Atributos de una clase
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private String genero;

    // Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = "";
        this.genero = "No especificado";
    }

    // mas de un constructor
    public Persona(String nombre, String apellido, int edad, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, int edad, String dni, String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
    }
    // constructor por defecto
    public Persona(){}
    //metodo pasar string el objeto
    public String personaToString(){
        String texto = this.nombre + " " + this.apellido + " " + this.edad + " " + this.dni; // t
        return texto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDni() {
        return this.dni;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //validar escritura correcta dni
    private boolean isDniOk(String dni){
        return dni.matches("[0-9]{7,8}[a-z][A-Z]");
    }
    // comprobar letra dni: array con las 22 letras en orden + consulta a esta
}
