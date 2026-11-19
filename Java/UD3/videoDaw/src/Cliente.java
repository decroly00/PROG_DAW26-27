import java.time.LocalDate;
import java.util.Arrays;

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
        this.isBaja = false;
    }


    public String mostrarPeliculasAlquiladas() {
            String PeliculasAlquiladas = "";
        for (int i = 0; i < nPeliculas; i++){
            PeliculasAlquiladas += "\n" + this.PeliculasAlquiladas[i];
        }
        return PeliculasAlquiladas;
    }

    public String mostrarInfoCliente(){
        String infoCliente = "";
            infoCliente += "DNI: " + this.DNI + "\nNombre: " + this.Nombre +
                    "\nNumero de socio: " + NumSocio + "\nDireccion" + Direccion +
                    "\nFecha de nacimiento: " + FechaNacimiento +
                    "\nPeliculas alquiladas: " + PeliculasAlquiladas;
            if (!isBaja){
                infoCliente += "\nFecha baja: " + FechaBaja;
            }
        return infoCliente;
    }

    public void alquilarPelicula(Pelicula p) {
        this.PeliculasAlquiladas[nPeliculas] = p;

    }
}
