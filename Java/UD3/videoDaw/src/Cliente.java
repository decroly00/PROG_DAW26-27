import java.time.LocalDate;

public class Cliente {
    private static int contadorclientes = 0;
    private String DNI;
    private String Nombre;
    private String NumSocio;
    private String Direccion;
    private LocalDate FechaNacimiento;
    private LocalDate FechaBaja;
    private Pelicula[] PeliculasAlquiladas;
    private int nPeliculas;
    private boolean isBaja;

    public Cliente(String DNI, String Nombre, String Direccion, LocalDate FechaNacimiento){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.NumSocio = "S-" + contadorclientes;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaBaja = LocalDate.MIN;
        this.PeliculasAlquiladas = new Pelicula[50];
        this.nPeliculas = 0;
    }


    public String mostrarPeliculasAlquiladas() {
            String PeliculasAlquiladas = "";
        for (int i = 0; i < nPeliculas; i++){
            PeliculasAlquiladas += "\n" + this.PeliculasAlquiladas[i].toString();
        }
        return PeliculasAlquiladas;
    }

    @Override
    public String toString(){
        String respuesta = "";
            respuesta += "DNI: " + this.DNI + "\nNombre: " + this.Nombre +
                    "\nNumero de socio: " + NumSocio + "\nDireccion" + Direccion +
                    "\nFecha de nacimiento: " + FechaNacimiento +
                    "\nPeliculas alquiladas: " + PeliculasAlquiladas;
        return respuesta;
    }

    public void alquilarPelicula(Pelicula p) {
        this.PeliculasAlquiladas[nPeliculas] = p;

    }
}
