package model;

public class Libro {

    //Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    private String editorial;
    private String genero;
    private String fechaPublicacion;


    //Constructor

    public Libro (String isbn, String titulo, String autor){ // minimo
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = 0;
        this.editorial = "";
        this.genero = "";
        this.fechaPublicacion = "";
    }
    public Libro (String isbn, String titulo, String autor, int nPaginas,
                  String editorial, String genero, String fechaPublicacion){ // completo
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.editorial = editorial;
        this.genero = genero;
        this.fechaPublicacion = fechaPublicacion;
    }




}
