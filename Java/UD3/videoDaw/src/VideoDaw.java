import java.time.LocalDate;

public class VideoDaw {
    private String CIF;
    private String Direccion;
    private LocalDate FechaAlta;
    private Pelicula[] PeliculasRegistradas;
    private Cliente[] ClientesRegistrados;
    private int nPeliculas;
    private int nClientes;

    public VideoDaw(String CIF, String Direccion){
        this.CIF = CIF;
        this.Direccion = Direccion;
        this.FechaAlta = LocalDate.now();
        this.PeliculasRegistradas = new Pelicula[50];
        this.nPeliculas = 0;
        this.nClientes = 0;
        this.ClientesRegistrados = new Cliente[50];
    }
    @Override
    public String toString(){
        String InfoVideoClub = "";
            InfoVideoClub += "CIF: " + this.CIF + "\nDireccion: " + this.Direccion +
                    "\nNumero peliculas: " + nPeliculas + "\nNumero clientes" + nClientes;
        return InfoVideoClub;
    }

    public String getPeliculasRegistradas() {
        String PeliculasRegistradas = "";
        for (int i = 0; i < nPeliculas; i++){
            PeliculasRegistradas += "\n" + this.PeliculasRegistradas[i].toString();
        }
        return PeliculasRegistradas;
    }

    public String getClientesRegistrados() {
        String ClientesRegistrados = "";
        for (int i = 0; i < nClientes; i++){
            ClientesRegistrados += "\n" + this.ClientesRegistrados[i].toString();
        }
        return ClientesRegistrados;
    }

    public int getNClientes() {
        return nClientes;
    }

    public int getNPeliculas() {
        return nPeliculas;
    }

    public void altaPelicula(String Nombre, Genero genero){
        PeliculasRegistradas[nPeliculas] = new Pelicula(Nombre, genero);
        nPeliculas++;
    }
    public void altaCliente(String DNI, String Nombre, String Direccion, LocalDate FechaNacimiento){
        ClientesRegistrados[nClientes] = new Cliente(DNI, Nombre, Direccion, FechaNacimiento);
        nClientes++;
    }
    public String bajaCliente(int nCliente){
        if (nCliente>=nClientes){
            return "No existe ese usuario";
        }
        nClientes--;
        ClientesRegistrados[nCliente] = ClientesRegistrados[nClientes];
        ClientesRegistrados[nClientes] = null;
        return "Baja realizada correctamente";
    }
    public String bajaPelicula(int nPelicula){
        if (nPelicula>=nPeliculas){
            return "No existe esa pelicula";
        }
        nPeliculas--;
        PeliculasRegistradas[nPelicula] = PeliculasRegistradas[nPeliculas];
        PeliculasRegistradas[nPeliculas] = null;
        return "Baja realizada correctamente";
    }
    public String alquilarPelicula(int nPelicula, int nCliente){
        if (nPelicula>=nPeliculas){
            return "No existe ese pelicula";
        } else {
            ClientesRegistrados[nCliente].alquilarPelicula(PeliculasRegistradas[nPelicula]);
            return "Pelicula " + PeliculasRegistradas[nPelicula].getTitulo() + " alquilada correctamente";
        }

    }
//    public String alquilarPelicula(Pelicula p, Cliente c){
//        String alquilada;
//        if (!p.isAlquilada()){
//          c.alquilarPelicula(p);
//          alquilada = "La película se ha alquilado";
//        } else {
//            alquilada = "La película esta alquilada";
//        }
//        return alquilada;
//    }

}
