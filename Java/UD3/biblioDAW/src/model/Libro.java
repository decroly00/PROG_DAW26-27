package model;

public class Libro {

    private static int contadortotal = 0;

    //Atributos
    private final int id;
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private String genero;
    private String fechaPublicacion;


    //Constructor
    //minimo
    public Libro (String isbn, String titulo, String autor){
        this.id = contadortotal;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
        contadortotal++;
    }
    //completo
    public Libro (String isbn, String titulo, String autor, int nPaginas,
                  String editorial, String genero, String fechaPublicacion){
        this.id = contadortotal;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
        contadortotal++;
    }

    // propiedades: getter - setter

    public String getIsbn(){
        return this.isbn;
    }
    public int getID(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getEditorial() {
        return this.editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getFechaPublicacion(){
        return this.fechaPublicacion;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getnPaginas(){
        return nPaginas;
    }
    public void setnPaginas(int nPaginas){
        this.nPaginas = nPaginas;
    }
    // mostrar informacion libro en pantalla
    public String infoLibro(){
        String infoLibro = "ID: " + this.id + "\n";
        infoLibro += "Titulo: " + this.titulo + "\n";
        infoLibro += "Autor: " + this.autor + "\n";
        return infoLibro;
    }
}
